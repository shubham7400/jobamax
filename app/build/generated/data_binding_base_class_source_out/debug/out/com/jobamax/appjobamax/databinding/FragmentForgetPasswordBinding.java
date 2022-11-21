// Generated by data binding compiler. Do not edit!
package com.jobamax.appjobamax.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jobamax.appjobamax.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentForgetPasswordBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnContinue;

  @NonNull
  public final TextView editText3;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final ImageView ivBackButton;

  @NonNull
  public final TextView textView;

  protected FragmentForgetPasswordBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton btnContinue, TextView editText3, EditText etEmail,
      ImageView ivBackButton, TextView textView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnContinue = btnContinue;
    this.editText3 = editText3;
    this.etEmail = etEmail;
    this.ivBackButton = ivBackButton;
    this.textView = textView;
  }

  @NonNull
  public static FragmentForgetPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_forget_password, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentForgetPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentForgetPasswordBinding>inflateInternal(inflater, R.layout.fragment_forget_password, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentForgetPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_forget_password, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentForgetPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentForgetPasswordBinding>inflateInternal(inflater, R.layout.fragment_forget_password, null, false, component);
  }

  public static FragmentForgetPasswordBinding bind(@NonNull View view) {
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
  public static FragmentForgetPasswordBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentForgetPasswordBinding)bind(component, view, R.layout.fragment_forget_password);
  }
}
