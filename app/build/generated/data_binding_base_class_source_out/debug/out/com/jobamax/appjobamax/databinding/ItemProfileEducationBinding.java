// Generated by data binding compiler. Do not edit!
package com.jobamax.appjobamax.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jobamax.appjobamax.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemProfileEducationBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clParent;

  @NonNull
  public final CardView linearLayout12;

  @NonNull
  public final RecyclerView rvEducation;

  protected ItemProfileEducationBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout clParent, CardView linearLayout12, RecyclerView rvEducation) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clParent = clParent;
    this.linearLayout12 = linearLayout12;
    this.rvEducation = rvEducation;
  }

  @NonNull
  public static ItemProfileEducationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_profile_education, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemProfileEducationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemProfileEducationBinding>inflateInternal(inflater, R.layout.item_profile_education, root, attachToRoot, component);
  }

  @NonNull
  public static ItemProfileEducationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_profile_education, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemProfileEducationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemProfileEducationBinding>inflateInternal(inflater, R.layout.item_profile_education, null, false, component);
  }

  public static ItemProfileEducationBinding bind(@NonNull View view) {
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
  public static ItemProfileEducationBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemProfileEducationBinding)bind(component, view, R.layout.item_profile_education);
  }
}
