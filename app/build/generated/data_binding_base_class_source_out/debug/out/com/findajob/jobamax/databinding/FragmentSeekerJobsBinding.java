// Generated by data binding compiler. Do not edit!
package com.findajob.jobamax.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.findajob.jobamax.R;
import com.findajob.jobamax.model.JobSeeker;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ramijemli.percentagechartview.PercentageChartView;
import com.yuyakaido.android.cardstackview.CardStackView;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSeekerJobsBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView civUser;

  @NonNull
  public final ConstraintLayout clMostParent;

  @NonNull
  public final ConstraintLayout clSearchBar;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final CardStackView csvJob;

  @NonNull
  public final EditText etJobKeyword;

  @NonNull
  public final FloatingActionButton fabApply;

  @NonNull
  public final FloatingActionButton fabRefuse;

  @NonNull
  public final FloatingActionButton fabRewind;

  @NonNull
  public final FloatingActionButton fabShare;

  @NonNull
  public final ImageView ivBackButton;

  @NonNull
  public final ImageView ivFavorite;

  @NonNull
  public final ImageView ivFilterJob;

  @NonNull
  public final ImageView ivSearchIcon;

  @NonNull
  public final ItemSeekerJobCardBinding lJob;

  @NonNull
  public final LinearLayout llFloatButtons;

  @NonNull
  public final LinearLayout llMatchPercent;

  @NonNull
  public final LinearLayout llRewind;

  @NonNull
  public final NestedScrollView nsvCard;

  @NonNull
  public final PercentageChartView pcvMatch;

  @NonNull
  public final RelativeLayout relativeLayout;

  @NonNull
  public final RecyclerView rvJobTypes;

  @NonNull
  public final View vFilterState;

  @Bindable
  protected JobSeeker mJobSeeker;

  protected FragmentSeekerJobsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CircleImageView civUser, ConstraintLayout clMostParent, ConstraintLayout clSearchBar,
      ConstraintLayout constraintLayout, CardStackView csvJob, EditText etJobKeyword,
      FloatingActionButton fabApply, FloatingActionButton fabRefuse, FloatingActionButton fabRewind,
      FloatingActionButton fabShare, ImageView ivBackButton, ImageView ivFavorite,
      ImageView ivFilterJob, ImageView ivSearchIcon, ItemSeekerJobCardBinding lJob,
      LinearLayout llFloatButtons, LinearLayout llMatchPercent, LinearLayout llRewind,
      NestedScrollView nsvCard, PercentageChartView pcvMatch, RelativeLayout relativeLayout,
      RecyclerView rvJobTypes, View vFilterState) {
    super(_bindingComponent, _root, _localFieldCount);
    this.civUser = civUser;
    this.clMostParent = clMostParent;
    this.clSearchBar = clSearchBar;
    this.constraintLayout = constraintLayout;
    this.csvJob = csvJob;
    this.etJobKeyword = etJobKeyword;
    this.fabApply = fabApply;
    this.fabRefuse = fabRefuse;
    this.fabRewind = fabRewind;
    this.fabShare = fabShare;
    this.ivBackButton = ivBackButton;
    this.ivFavorite = ivFavorite;
    this.ivFilterJob = ivFilterJob;
    this.ivSearchIcon = ivSearchIcon;
    this.lJob = lJob;
    this.llFloatButtons = llFloatButtons;
    this.llMatchPercent = llMatchPercent;
    this.llRewind = llRewind;
    this.nsvCard = nsvCard;
    this.pcvMatch = pcvMatch;
    this.relativeLayout = relativeLayout;
    this.rvJobTypes = rvJobTypes;
    this.vFilterState = vFilterState;
  }

  public abstract void setJobSeeker(@Nullable JobSeeker jobSeeker);

  @Nullable
  public JobSeeker getJobSeeker() {
    return mJobSeeker;
  }

  @NonNull
  public static FragmentSeekerJobsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_seeker_jobs, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSeekerJobsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSeekerJobsBinding>inflateInternal(inflater, R.layout.fragment_seeker_jobs, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSeekerJobsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_seeker_jobs, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSeekerJobsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSeekerJobsBinding>inflateInternal(inflater, R.layout.fragment_seeker_jobs, null, false, component);
  }

  public static FragmentSeekerJobsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentSeekerJobsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSeekerJobsBinding)bind(component, view, R.layout.fragment_seeker_jobs);
  }
}
