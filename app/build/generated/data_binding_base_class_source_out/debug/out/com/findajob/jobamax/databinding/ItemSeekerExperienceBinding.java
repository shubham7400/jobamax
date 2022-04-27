// Generated by data binding compiler. Do not edit!
package com.findajob.jobamax.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.findajob.jobamax.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemSeekerExperienceBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivCompany;

  @NonNull
  public final ImageView ivDeleteItem;

  @NonNull
  public final RelativeLayout rlParent;

  @NonNull
  public final TextView tvAddress;

  @NonNull
  public final TextView tvCompanyName;

  @NonNull
  public final TextView tvDateDuration;

  @NonNull
  public final TextView tvJobName;

  protected ItemSeekerExperienceBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivCompany, ImageView ivDeleteItem, RelativeLayout rlParent, TextView tvAddress,
      TextView tvCompanyName, TextView tvDateDuration, TextView tvJobName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivCompany = ivCompany;
    this.ivDeleteItem = ivDeleteItem;
    this.rlParent = rlParent;
    this.tvAddress = tvAddress;
    this.tvCompanyName = tvCompanyName;
    this.tvDateDuration = tvDateDuration;
    this.tvJobName = tvJobName;
  }

  @NonNull
  public static ItemSeekerExperienceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_seeker_experience, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemSeekerExperienceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemSeekerExperienceBinding>inflateInternal(inflater, R.layout.item_seeker_experience, root, attachToRoot, component);
  }

  @NonNull
  public static ItemSeekerExperienceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_seeker_experience, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemSeekerExperienceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemSeekerExperienceBinding>inflateInternal(inflater, R.layout.item_seeker_experience, null, false, component);
  }

  public static ItemSeekerExperienceBinding bind(@NonNull View view) {
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
  public static ItemSeekerExperienceBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemSeekerExperienceBinding)bind(component, view, R.layout.item_seeker_experience);
  }
}
