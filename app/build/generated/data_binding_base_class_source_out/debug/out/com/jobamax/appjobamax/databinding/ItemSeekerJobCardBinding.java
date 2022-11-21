// Generated by data binding compiler. Do not edit!
package com.jobamax.appjobamax.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.chip.ChipGroup;
import com.jobamax.appjobamax.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemSeekerJobCardBinding extends ViewDataBinding {
  @NonNull
  public final ChipGroup cgEducationTags;

  @NonNull
  public final ChipGroup cgExperienceTags;

  @NonNull
  public final ChipGroup cgHardSkillTags;

  @NonNull
  public final ChipGroup cgSoftSkillTags;

  @NonNull
  public final ChipGroup cgTags;

  @NonNull
  public final CircleImageView circleImageView;

  @NonNull
  public final ConstraintLayout clOverlay;

  @NonNull
  public final ConstraintLayout clProfileIv;

  @NonNull
  public final CardView cvJobOnlineDialog;

  @NonNull
  public final CardView cvJobViewedDialog;

  @NonNull
  public final ImageView ivJobPost;

  @NonNull
  public final ImageView ivLocationPoint;

  @NonNull
  public final ImageView ivOnline;

  @NonNull
  public final ImageView ivSearch;

  @NonNull
  public final LinearLayout linearLayout10;

  @NonNull
  public final LinearLayout llExperience;

  @NonNull
  public final LinearLayout llJobDesc;

  @NonNull
  public final LinearLayout llJobDesc2;

  @NonNull
  public final LinearLayout llJobLocation;

  @NonNull
  public final LinearLayout llJobSearch;

  @NonNull
  public final LinearLayout llJobTitle;

  @NonNull
  public final LinearLayout llMatch;

  @NonNull
  public final LinearLayout llMatchWithProfile;

  @NonNull
  public final LinearLayout llMostParent;

  @NonNull
  public final LinearLayout llSalary;

  @NonNull
  public final LinearLayout llSalary2;

  @NonNull
  public final LinearLayout llWorkType;

  @NonNull
  public final ConstraintLayout rootLayout;

  @NonNull
  public final SeekBar sbEducation;

  @NonNull
  public final SeekBar sbExperience;

  @NonNull
  public final SeekBar sbHardSkill;

  @NonNull
  public final SeekBar sbSoftSkill;

  @NonNull
  public final TextView tv55;

  @NonNull
  public final TextView tv57;

  @NonNull
  public final TextView tv58;

  @NonNull
  public final TextView tvCompanyName;

  @NonNull
  public final TextView tvCompanyName2;

  @NonNull
  public final TextView tvCriteriaContract;

  @NonNull
  public final TextView tvCriteriaJobSearchKeyword;

  @NonNull
  public final TextView tvCriteriaLocation;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvJobDescription;

  @NonNull
  public final TextView tvJobDescription2;

  @NonNull
  public final TextView tvJobLocation;

  @NonNull
  public final TextView tvJobName;

  @NonNull
  public final TextView tvJobOfferId;

  @NonNull
  public final TextView tvJobType;

  @NonNull
  public final TextView tvOverlayLabel;

  @NonNull
  public final TextView tvSalary;

  @NonNull
  public final TextView tvSalary2;

  @NonNull
  public final TextView tvSwipeCount;

  @NonNull
  public final TextView tvWorkTypes;

  protected ItemSeekerJobCardBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ChipGroup cgEducationTags, ChipGroup cgExperienceTags, ChipGroup cgHardSkillTags,
      ChipGroup cgSoftSkillTags, ChipGroup cgTags, CircleImageView circleImageView,
      ConstraintLayout clOverlay, ConstraintLayout clProfileIv, CardView cvJobOnlineDialog,
      CardView cvJobViewedDialog, ImageView ivJobPost, ImageView ivLocationPoint,
      ImageView ivOnline, ImageView ivSearch, LinearLayout linearLayout10,
      LinearLayout llExperience, LinearLayout llJobDesc, LinearLayout llJobDesc2,
      LinearLayout llJobLocation, LinearLayout llJobSearch, LinearLayout llJobTitle,
      LinearLayout llMatch, LinearLayout llMatchWithProfile, LinearLayout llMostParent,
      LinearLayout llSalary, LinearLayout llSalary2, LinearLayout llWorkType,
      ConstraintLayout rootLayout, SeekBar sbEducation, SeekBar sbExperience, SeekBar sbHardSkill,
      SeekBar sbSoftSkill, TextView tv55, TextView tv57, TextView tv58, TextView tvCompanyName,
      TextView tvCompanyName2, TextView tvCriteriaContract, TextView tvCriteriaJobSearchKeyword,
      TextView tvCriteriaLocation, TextView tvDescription, TextView tvJobDescription,
      TextView tvJobDescription2, TextView tvJobLocation, TextView tvJobName, TextView tvJobOfferId,
      TextView tvJobType, TextView tvOverlayLabel, TextView tvSalary, TextView tvSalary2,
      TextView tvSwipeCount, TextView tvWorkTypes) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cgEducationTags = cgEducationTags;
    this.cgExperienceTags = cgExperienceTags;
    this.cgHardSkillTags = cgHardSkillTags;
    this.cgSoftSkillTags = cgSoftSkillTags;
    this.cgTags = cgTags;
    this.circleImageView = circleImageView;
    this.clOverlay = clOverlay;
    this.clProfileIv = clProfileIv;
    this.cvJobOnlineDialog = cvJobOnlineDialog;
    this.cvJobViewedDialog = cvJobViewedDialog;
    this.ivJobPost = ivJobPost;
    this.ivLocationPoint = ivLocationPoint;
    this.ivOnline = ivOnline;
    this.ivSearch = ivSearch;
    this.linearLayout10 = linearLayout10;
    this.llExperience = llExperience;
    this.llJobDesc = llJobDesc;
    this.llJobDesc2 = llJobDesc2;
    this.llJobLocation = llJobLocation;
    this.llJobSearch = llJobSearch;
    this.llJobTitle = llJobTitle;
    this.llMatch = llMatch;
    this.llMatchWithProfile = llMatchWithProfile;
    this.llMostParent = llMostParent;
    this.llSalary = llSalary;
    this.llSalary2 = llSalary2;
    this.llWorkType = llWorkType;
    this.rootLayout = rootLayout;
    this.sbEducation = sbEducation;
    this.sbExperience = sbExperience;
    this.sbHardSkill = sbHardSkill;
    this.sbSoftSkill = sbSoftSkill;
    this.tv55 = tv55;
    this.tv57 = tv57;
    this.tv58 = tv58;
    this.tvCompanyName = tvCompanyName;
    this.tvCompanyName2 = tvCompanyName2;
    this.tvCriteriaContract = tvCriteriaContract;
    this.tvCriteriaJobSearchKeyword = tvCriteriaJobSearchKeyword;
    this.tvCriteriaLocation = tvCriteriaLocation;
    this.tvDescription = tvDescription;
    this.tvJobDescription = tvJobDescription;
    this.tvJobDescription2 = tvJobDescription2;
    this.tvJobLocation = tvJobLocation;
    this.tvJobName = tvJobName;
    this.tvJobOfferId = tvJobOfferId;
    this.tvJobType = tvJobType;
    this.tvOverlayLabel = tvOverlayLabel;
    this.tvSalary = tvSalary;
    this.tvSalary2 = tvSalary2;
    this.tvSwipeCount = tvSwipeCount;
    this.tvWorkTypes = tvWorkTypes;
  }

  @NonNull
  public static ItemSeekerJobCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_seeker_job_card, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemSeekerJobCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemSeekerJobCardBinding>inflateInternal(inflater, R.layout.item_seeker_job_card, root, attachToRoot, component);
  }

  @NonNull
  public static ItemSeekerJobCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_seeker_job_card, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemSeekerJobCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemSeekerJobCardBinding>inflateInternal(inflater, R.layout.item_seeker_job_card, null, false, component);
  }

  public static ItemSeekerJobCardBinding bind(@NonNull View view) {
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
  public static ItemSeekerJobCardBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemSeekerJobCardBinding)bind(component, view, R.layout.item_seeker_job_card);
  }
}
