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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.findajob.jobamax.R;
import com.findajob.jobamax.model.JobSeeker;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSeekerWishListBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView civUser;

  @NonNull
  public final ConstraintLayout constraintLayout6;

  @NonNull
  public final ConstraintLayout constraintLayout7;

  @NonNull
  public final ImageView imageView11;

  @NonNull
  public final ImageView ivBackButton;

  @NonNull
  public final ImageView ivFilterJob;

  @NonNull
  public final RelativeLayout relativeLayout;

  @NonNull
  public final RecyclerView rvWishlistJob;

  @NonNull
  public final TextView textView20;

  @NonNull
  public final TextView tvNoData;

  @Bindable
  protected JobSeeker mJobSeeker;

  protected FragmentSeekerWishListBinding(Object _bindingComponent, View _root,
      int _localFieldCount, CircleImageView civUser, ConstraintLayout constraintLayout6,
      ConstraintLayout constraintLayout7, ImageView imageView11, ImageView ivBackButton,
      ImageView ivFilterJob, RelativeLayout relativeLayout, RecyclerView rvWishlistJob,
      TextView textView20, TextView tvNoData) {
    super(_bindingComponent, _root, _localFieldCount);
    this.civUser = civUser;
    this.constraintLayout6 = constraintLayout6;
    this.constraintLayout7 = constraintLayout7;
    this.imageView11 = imageView11;
    this.ivBackButton = ivBackButton;
    this.ivFilterJob = ivFilterJob;
    this.relativeLayout = relativeLayout;
    this.rvWishlistJob = rvWishlistJob;
    this.textView20 = textView20;
    this.tvNoData = tvNoData;
  }

  public abstract void setJobSeeker(@Nullable JobSeeker jobSeeker);

  @Nullable
  public JobSeeker getJobSeeker() {
    return mJobSeeker;
  }

  @NonNull
  public static FragmentSeekerWishListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_seeker_wish_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSeekerWishListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSeekerWishListBinding>inflateInternal(inflater, R.layout.fragment_seeker_wish_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSeekerWishListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_seeker_wish_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSeekerWishListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSeekerWishListBinding>inflateInternal(inflater, R.layout.fragment_seeker_wish_list, null, false, component);
  }

  public static FragmentSeekerWishListBinding bind(@NonNull View view) {
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
  public static FragmentSeekerWishListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSeekerWishListBinding)bind(component, view, R.layout.fragment_seeker_wish_list);
  }
}
