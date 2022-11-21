// Generated by data binding compiler. Do not edit!
package com.jobamax.appjobamax.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.jobamax.appjobamax.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentJobSeekerPersonalInformationBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBar;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final EditText etAge;

  @NonNull
  public final EditText etEmailField;

  @NonNull
  public final EditText firstNameField;

  @NonNull
  public final ImageView ivBackButton;

  @NonNull
  public final EditText lastNameField;

  @NonNull
  public final TextView tvGenderLabel;

  @NonNull
  public final AppCompatTextView tvToolbarTitle;

  protected FragmentJobSeekerPersonalInformationBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appBar, Button btnSave, EditText etAge,
      EditText etEmailField, EditText firstNameField, ImageView ivBackButton,
      EditText lastNameField, TextView tvGenderLabel, AppCompatTextView tvToolbarTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBar = appBar;
    this.btnSave = btnSave;
    this.etAge = etAge;
    this.etEmailField = etEmailField;
    this.firstNameField = firstNameField;
    this.ivBackButton = ivBackButton;
    this.lastNameField = lastNameField;
    this.tvGenderLabel = tvGenderLabel;
    this.tvToolbarTitle = tvToolbarTitle;
  }

  @NonNull
  public static FragmentJobSeekerPersonalInformationBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_job_seeker_personal_information, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentJobSeekerPersonalInformationBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentJobSeekerPersonalInformationBinding>inflateInternal(inflater, R.layout.fragment_job_seeker_personal_information, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentJobSeekerPersonalInformationBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_job_seeker_personal_information, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentJobSeekerPersonalInformationBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable Object component) {
    return ViewDataBinding.<FragmentJobSeekerPersonalInformationBinding>inflateInternal(inflater, R.layout.fragment_job_seeker_personal_information, null, false, component);
  }

  public static FragmentJobSeekerPersonalInformationBinding bind(@NonNull View view) {
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
  public static FragmentJobSeekerPersonalInformationBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentJobSeekerPersonalInformationBinding)bind(component, view, R.layout.fragment_job_seeker_personal_information);
  }
}
