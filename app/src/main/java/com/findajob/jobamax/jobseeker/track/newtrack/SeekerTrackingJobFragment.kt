package com.findajob.jobamax.jobseeker.track.newtrack

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.findajob.jobamax.R
import com.findajob.jobamax.base.BaseFragmentMain
import com.findajob.jobamax.data.pojo.PhaseGroup
import com.findajob.jobamax.databinding.FragmentSeekerTrackingJobBinding
import com.findajob.jobamax.databinding.ItemSeekerOtherJobBinding
import com.findajob.jobamax.databinding.ItemSeekerTrackBinding
import com.findajob.jobamax.enums.JobPhase
import com.findajob.jobamax.enums.ParseTableFields
import com.findajob.jobamax.enums.ParseTableName
import com.findajob.jobamax.jobseeker.calender.SeekerCalenderActivity
import com.findajob.jobamax.jobseeker.home.JobSeekerHomeViewModel
import com.findajob.jobamax.jobseeker.model.TrackingOtherJob
import com.findajob.jobamax.model.GetAllUserCallback
import com.findajob.jobamax.model.TrackingJob
import com.findajob.jobamax.preference.getUserId
import com.findajob.jobamax.util.log
import com.findajob.jobamax.util.toast
import com.google.gson.Gson
import com.parse.ParseObject
import com.parse.ParseQuery
import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SeekerTrackingJobFragment : BaseFragmentMain<FragmentSeekerTrackingJobBinding>() {

    override val layoutRes: Int get() = R.layout.fragment_seeker_tracking_job
    val viewModel: JobSeekerHomeViewModel by activityViewModels()
    override fun getViewModel(): ViewModel = viewModel

    var trackingJobamaxJobList = ArrayList<TrackingJob>()
    var trackingOtherJobList = ArrayList<TrackingOtherJob>()
    lateinit var jobamaxJobAdapter: SeekerTrackingJobamaxJobAdapter
    lateinit var otherJobAdapter: SeekerTrackingOtherJobAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentSeekerTrackingJobBinding.inflate(inflater, container, false)
        configureUi()
        return binding.root
    }

    private fun configureUi() {
        getNextDeadline()
        getNextInterview()
        setAdapter()
         setClickListeners()
        viewModelObserver()

    }

    fun getCurrent( ) {
        val query = ParseQuery.getQuery<ParseObject>(ParseTableName.JobSeeker.toString())
        query.whereEqualTo(ParseTableFields.jobSeekerId.toString(), context?.getUserId())
        query.include("portfolio")
        query.include("idealJob")
        progressHud.show()
        query.findInBackground { it, e ->
            progressHud.dismiss()
            val jobSeeker = it?.firstOrNull()
            when {
                e != null -> {
                    toast(e.message.toString())
                }
                jobSeeker == null -> {
                    toast("User Not Found.")
                }
                else -> {
                    viewModel.jobSeekerObject = jobSeeker
                    viewModel.isJobSeekerUpdated.value = true
                }
            }
        }
    }


    private fun getNextInterview() {
        viewModel.getNextInterview(JobPhase.INTERVIEW.phase, requireContext().getUserId(), {
            toast("${it.message.toString()}")
        }, {
            if (it == "" || it == null){
                binding.tvNextInterview.text = "No Interview"
            }else{
                binding.tvNextInterview.text = it
            }
        })
    }

    private fun getNextDeadline() {
        viewModel.getNextDeadline(JobPhase.DEADLINE.phase, requireContext().getUserId(), {
            toast("${it.message.toString()}")
        }, {
            if (it == "" || it == null){
                binding.tvNextDeadline.text = "No Deadline"
            }else{
                binding.tvNextDeadline.text = it
            }
        })
    }

    private fun setAdapter() {
        jobamaxJobAdapter = SeekerTrackingJobamaxJobAdapter(trackingJobamaxJobList)
        binding.rvTrackedJob.adapter = jobamaxJobAdapter

        otherJobAdapter = SeekerTrackingOtherJobAdapter(trackingOtherJobList)
        binding.rvTrackedOtherJob.adapter = otherJobAdapter
    }

    private fun viewModelObserver() {
        viewModel.isJobSeekerUpdated.observe(viewLifecycleOwner, Observer {
            if (it){
                binding.jobSeeker = viewModel.jobSeeker
            }
        })
    }

    private fun setClickListeners() {
        binding.ivBackButton.setOnClickListener {
            requireActivity().onBackPressed()
        }
        binding.civUser.setOnClickListener {
            requireActivity().onBackPressed()
        }
        binding.ivCalendar.setOnClickListener {
            requireContext().startActivity(Intent(requireContext(), SeekerCalenderActivity::class.java))
        }
        binding.ivFilter.setOnClickListener {
            val seekerTrackingJobFilterDialogFragment = SeekerTrackingJobFilterDialogFragment.newInstance()
            seekerTrackingJobFilterDialogFragment.show(childFragmentManager,"dialog")
            seekerTrackingJobFilterDialogFragment.onGoClickListener = {
             /*   filteredJob = it
                fetchWishlist(filteredJob)*/
            }
        }
        binding.tvJobamaxJob.setOnClickListener {
            binding.tvOtherJob.background = null
            binding.tvJobamaxJob.setBackgroundResource(R.drawable.rounded_white_box)
            binding.rvTrackedJob.visibility = View.VISIBLE
            binding.rvTrackedOtherJob.visibility = View.GONE
            binding.ivAddOtherJob.visibility = View.GONE
        }
        binding.tvOtherJob.setOnClickListener {
            binding.tvOtherJob.setBackgroundResource(R.drawable.rounded_white_box)
            binding.tvJobamaxJob.background = null
            binding.rvTrackedJob.visibility = View.GONE
            binding.rvTrackedOtherJob.visibility = View.VISIBLE
            binding.ivAddOtherJob.visibility = View.VISIBLE
        }

        binding.ivAddOtherJob.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.seekerAddPersonalTrackJobFragment, null))

    }

    override fun onCreated(savedInstance: Bundle?) {
        getCurrent()
        getTrackingJobamaxJobs()
        getTrackingOtherJobs()
    }

    private fun getTrackingOtherJobs() {
        val query = ParseQuery.getQuery<ParseObject>(ParseTableName.PersonalTrackJob.toString())
        query.whereEqualTo(ParseTableFields.jobSeekerId.toString(), context?.getUserId())
        query.include("jobSeeker")
        query.findInBackground { list, e ->
            when {
                e != null -> {
                    toast(e.message.toString())
                }
                list == null -> {
                    log("No result found")
                }
                else -> {
                    trackingOtherJobList.clear()
                    list.forEach {
                        trackingOtherJobList.add(TrackingOtherJob(it))
                    }
                    otherJobAdapter.submitList(trackingOtherJobList)
                    otherJobAdapter.notifyDataSetChanged()
                }
            }
        }
    }

    private fun getTrackingJobamaxJobs() {
        binding.jobSeeker = viewModel.jobSeeker
        viewModel.loadTrackingJob(object : GetAllUserCallback {
            override fun onSuccess(parseObject: List<ParseObject>) {
                trackingJobamaxJobList.clear()
                parseObject.forEach {
                    trackingJobamaxJobList.add(TrackingJob(it))
                }
                jobamaxJobAdapter.submitList(trackingJobamaxJobList)
                jobamaxJobAdapter.notifyDataSetChanged()
            }

            override fun onFailure(e: Exception?) {
                if (e != null) {
                    toast("${e.message.toString()} Something Went Wrong")
                }
            }
        })
    }

}

class SeekerTrackingJobamaxJobAdapter(var list: ArrayList<TrackingJob>) : RecyclerView.Adapter<SeekerTrackingJobamaxJobAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(ItemSeekerTrackBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val job = list[position]
        holder.binding.apply {
            val mainObject = Gson().fromJson(job.phases, PhaseGroup::class.java)
            val phases = ArrayList(mainObject.phases)
            phases.forEach {
                it.date
            }

            this.tvJobTitle.text = job.job?.getString("jobTitle") ?: ""
            this.tvCompanyName.text = job.job?.getString("companyName") ?: ""
            this.tvLocation.text = job.job?.getString("location") ?: ""
            if (job.job?.getString("logo") != ""){
                Picasso.get().load(job.job?.getString("logo")).into(this.ivCompany)
            }else{
                this.ivCompany.setImageResource(R.drawable.ic_company)
            }
            val bundle = Bundle()
            bundle.putSerializable("trackingJobamaxJob", job)
            this.clParent.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.seekerTrackingJobDetailsFragment, bundle))
            this.acbtnApply.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.seekerTrackingJobDetailsFragment, bundle))
        }
    }
    override fun getItemCount(): Int = list.size
    fun submitList(trackingJobList: ArrayList<TrackingJob>) {
        list = trackingJobList
    }

    class ViewHolder(val binding: ItemSeekerTrackBinding) : RecyclerView.ViewHolder(binding.root)
}

class SeekerTrackingOtherJobAdapter(var list: ArrayList<TrackingOtherJob>) : RecyclerView.Adapter<SeekerTrackingOtherJobAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(ItemSeekerOtherJobBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val job = list[position]
        holder.binding.apply {
            this.tvJobTitle.text = job.jobTitle
            this.tvCompanyName.text = job.companyName
            this.tvCity.text = job.city
            this.ivCompany.setImageResource(R.drawable.ic_company)
            val bundle = Bundle()
            bundle.putSerializable("trackingOtherJob", job)
            this.clParent.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.seekerTrackingJobDetailsFragment, bundle))
            this.acbtnApply.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.seekerTrackingJobDetailsFragment, bundle))
        }
    }
    override fun getItemCount(): Int = list.size
    fun submitList(trackingJobList: ArrayList<TrackingOtherJob>) {
        list = trackingJobList
    }

    class ViewHolder(val binding: ItemSeekerOtherJobBinding) : RecyclerView.ViewHolder(binding.root)
}