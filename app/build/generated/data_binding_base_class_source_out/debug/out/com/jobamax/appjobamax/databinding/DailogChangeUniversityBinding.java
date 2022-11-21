// Generated by data binding compiler. Do not edit!
package com.jobamax.appjobamax.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jobamax.appjobamax.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DailogChangeUniversityBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatCheckBox cbIsCurrent;

  @NonNull
  public final EditText etUniversity;

  @NonNull
  public final RecyclerView rvUniversities;

  @NonNull
  public final TextView tvCancel;

  @NonNull
  public final TextView tvDone;

  protected DailogChangeUniversityBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatCheckBox cbIsCurrent, EditText etUniversity,
      RecyclerView rvUniversities, TextView tvCancel, TextView tvDone) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cbIsCurrent = cbIsCurrent;
    this.etUniversity = etUniversity;
    this.rvUniversities = rvUniversities;
    this.tvCancel = tvCancel;
    this.tvDone = tvDone;
  }

  @NonNull
  public static DailogChangeUniversityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dailog_change_university, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DailogChangeUniversityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DailogChangeUniversityBinding>inflateInternal(inflater, R.layout.dailog_change_university, root, attachToRoot, component);
  }

  @NonNull
  public static DailogChangeUniversityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dailog_change_university, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DailogChangeUniversityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DailogChangeUniversityBinding>inflateInternal(inflater, R.layout.dailog_change_university, null, false, component);
  }

  public static DailogChangeUniversityBinding bind(@NonNull View view) {
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
  public static DailogChangeUniversityBinding bind(@NonNull View view, @Nullable Object component) {
    return (DailogChangeUniversityBinding)bind(component, view, R.layout.dailog_change_university);
  }
}
