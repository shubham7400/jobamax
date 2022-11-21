// Generated by data binding compiler. Do not edit!
package com.jobamax.appjobamax.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jobamax.appjobamax.R;
import com.jobamax.appjobamax.customview.CustomSpinner;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogReportBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnSubmit;

  @NonNull
  public final ImageView ivCancel;

  @NonNull
  public final CustomSpinner spReportReason;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  protected DialogReportBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnSubmit, ImageView ivCancel, CustomSpinner spReportReason,
      TextView textView6, TextView textView7) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSubmit = btnSubmit;
    this.ivCancel = ivCancel;
    this.spReportReason = spReportReason;
    this.textView6 = textView6;
    this.textView7 = textView7;
  }

  @NonNull
  public static DialogReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_report, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogReportBinding>inflateInternal(inflater, R.layout.dialog_report, root, attachToRoot, component);
  }

  @NonNull
  public static DialogReportBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_report, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogReportBinding>inflateInternal(inflater, R.layout.dialog_report, null, false, component);
  }

  public static DialogReportBinding bind(@NonNull View view) {
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
  public static DialogReportBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogReportBinding)bind(component, view, R.layout.dialog_report);
  }
}
