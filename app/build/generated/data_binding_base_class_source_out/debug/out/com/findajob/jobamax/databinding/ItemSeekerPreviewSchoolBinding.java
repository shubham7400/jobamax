// Generated by data binding compiler. Do not edit!
package com.findajob.jobamax.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.findajob.jobamax.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemSeekerPreviewSchoolBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivInstitute;

  @NonNull
  public final TextView tvDateDuration;

  @NonNull
  public final TextView tvInstituteName;

  @NonNull
  public final TextView tvProgramName;

  protected ItemSeekerPreviewSchoolBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView ivInstitute, TextView tvDateDuration,
      TextView tvInstituteName, TextView tvProgramName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivInstitute = ivInstitute;
    this.tvDateDuration = tvDateDuration;
    this.tvInstituteName = tvInstituteName;
    this.tvProgramName = tvProgramName;
  }

  @NonNull
  public static ItemSeekerPreviewSchoolBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_seeker_preview_school, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemSeekerPreviewSchoolBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemSeekerPreviewSchoolBinding>inflateInternal(inflater, R.layout.item_seeker_preview_school, root, attachToRoot, component);
  }

  @NonNull
  public static ItemSeekerPreviewSchoolBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_seeker_preview_school, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemSeekerPreviewSchoolBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemSeekerPreviewSchoolBinding>inflateInternal(inflater, R.layout.item_seeker_preview_school, null, false, component);
  }

  public static ItemSeekerPreviewSchoolBinding bind(@NonNull View view) {
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
  public static ItemSeekerPreviewSchoolBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ItemSeekerPreviewSchoolBinding)bind(component, view, R.layout.item_seeker_preview_school);
  }
}
