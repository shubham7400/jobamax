// Generated by data binding compiler. Do not edit!
package com.jobamax.appjobamax.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.chip.ChipGroup;
import com.jobamax.appjobamax.R;
import com.jobamax.appjobamax.customview.CustomSpinner;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentRecruiterAddJobSourcingCriteriaBinding extends ViewDataBinding {
  @NonNull
  public final FragmentContainerView autocompleteFragment;

  @NonNull
  public final AppCompatButton btnAddSourcingCriteria;

  @NonNull
  public final ChipGroup cgCompanyTags;

  @NonNull
  public final ChipGroup cgJobTitleTags;

  @NonNull
  public final ChipGroup cgSkillTags;

  @NonNull
  public final ChipGroup cgUniversityTags;

  @NonNull
  public final ConstraintLayout clLocation;

  @NonNull
  public final ConstraintLayout clPageTitle;

  @NonNull
  public final ConstraintLayout clWorkType;

  @NonNull
  public final CardView cv1;

  @NonNull
  public final CardView cvTag;

  @NonNull
  public final EditText etAddCompany;

  @NonNull
  public final EditText etAddSkill;

  @NonNull
  public final EditText etAddUniversity;

  @NonNull
  public final EditText etJobTitle;

  @NonNull
  public final EditText etTitle;

  @NonNull
  public final ImageView ivAddCompany;

  @NonNull
  public final ImageView ivAddJobTitle;

  @NonNull
  public final ImageView ivAddSkill;

  @NonNull
  public final ImageView ivAddUniversity;

  @NonNull
  public final ImageView ivBackButton;

  @NonNull
  public final ImageView ivContractType;

  @NonNull
  public final ImageView ivLocationForewordArrow;

  @NonNull
  public final ImageView ivLocationPoint;

  @NonNull
  public final ImageView ivWorkTypeForewordArrow;

  @NonNull
  public final LinearLayout ll1;

  @NonNull
  public final LinearLayout ll2;

  @NonNull
  public final LinearLayout ll3;

  @NonNull
  public final LinearLayout ll4;

  @NonNull
  public final LinearLayout ll5;

  @NonNull
  public final CustomSpinner sp1;

  @NonNull
  public final TextView tvAbc;

  @NonNull
  public final TextView tvContractTypeTitle;

  @NonNull
  public final TextView tvLocation;

  @NonNull
  public final TextView tvLocationTitle;

  @NonNull
  public final TextView tvTypeOfWork;

  @NonNull
  public final View vDevider;

  protected FragmentRecruiterAddJobSourcingCriteriaBinding(Object _bindingComponent, View _root,
      int _localFieldCount, FragmentContainerView autocompleteFragment,
      AppCompatButton btnAddSourcingCriteria, ChipGroup cgCompanyTags, ChipGroup cgJobTitleTags,
      ChipGroup cgSkillTags, ChipGroup cgUniversityTags, ConstraintLayout clLocation,
      ConstraintLayout clPageTitle, ConstraintLayout clWorkType, CardView cv1, CardView cvTag,
      EditText etAddCompany, EditText etAddSkill, EditText etAddUniversity, EditText etJobTitle,
      EditText etTitle, ImageView ivAddCompany, ImageView ivAddJobTitle, ImageView ivAddSkill,
      ImageView ivAddUniversity, ImageView ivBackButton, ImageView ivContractType,
      ImageView ivLocationForewordArrow, ImageView ivLocationPoint,
      ImageView ivWorkTypeForewordArrow, LinearLayout ll1, LinearLayout ll2, LinearLayout ll3,
      LinearLayout ll4, LinearLayout ll5, CustomSpinner sp1, TextView tvAbc,
      TextView tvContractTypeTitle, TextView tvLocation, TextView tvLocationTitle,
      TextView tvTypeOfWork, View vDevider) {
    super(_bindingComponent, _root, _localFieldCount);
    this.autocompleteFragment = autocompleteFragment;
    this.btnAddSourcingCriteria = btnAddSourcingCriteria;
    this.cgCompanyTags = cgCompanyTags;
    this.cgJobTitleTags = cgJobTitleTags;
    this.cgSkillTags = cgSkillTags;
    this.cgUniversityTags = cgUniversityTags;
    this.clLocation = clLocation;
    this.clPageTitle = clPageTitle;
    this.clWorkType = clWorkType;
    this.cv1 = cv1;
    this.cvTag = cvTag;
    this.etAddCompany = etAddCompany;
    this.etAddSkill = etAddSkill;
    this.etAddUniversity = etAddUniversity;
    this.etJobTitle = etJobTitle;
    this.etTitle = etTitle;
    this.ivAddCompany = ivAddCompany;
    this.ivAddJobTitle = ivAddJobTitle;
    this.ivAddSkill = ivAddSkill;
    this.ivAddUniversity = ivAddUniversity;
    this.ivBackButton = ivBackButton;
    this.ivContractType = ivContractType;
    this.ivLocationForewordArrow = ivLocationForewordArrow;
    this.ivLocationPoint = ivLocationPoint;
    this.ivWorkTypeForewordArrow = ivWorkTypeForewordArrow;
    this.ll1 = ll1;
    this.ll2 = ll2;
    this.ll3 = ll3;
    this.ll4 = ll4;
    this.ll5 = ll5;
    this.sp1 = sp1;
    this.tvAbc = tvAbc;
    this.tvContractTypeTitle = tvContractTypeTitle;
    this.tvLocation = tvLocation;
    this.tvLocationTitle = tvLocationTitle;
    this.tvTypeOfWork = tvTypeOfWork;
    this.vDevider = vDevider;
  }

  @NonNull
  public static FragmentRecruiterAddJobSourcingCriteriaBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_recruiter_add_job_sourcing_criteria, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRecruiterAddJobSourcingCriteriaBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentRecruiterAddJobSourcingCriteriaBinding>inflateInternal(inflater, R.layout.fragment_recruiter_add_job_sourcing_criteria, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRecruiterAddJobSourcingCriteriaBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_recruiter_add_job_sourcing_criteria, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRecruiterAddJobSourcingCriteriaBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable Object component) {
    return ViewDataBinding.<FragmentRecruiterAddJobSourcingCriteriaBinding>inflateInternal(inflater, R.layout.fragment_recruiter_add_job_sourcing_criteria, null, false, component);
  }

  public static FragmentRecruiterAddJobSourcingCriteriaBinding bind(@NonNull View view) {
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
  public static FragmentRecruiterAddJobSourcingCriteriaBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentRecruiterAddJobSourcingCriteriaBinding)bind(component, view, R.layout.fragment_recruiter_add_job_sourcing_criteria);
  }
}
