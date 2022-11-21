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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jobamax.appjobamax.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSeekerWishlistBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton appCompatButtonn;

  @NonNull
  public final AppCompatButton btnSwipeJobs;

  @NonNull
  public final ConstraintLayout constraintLayout19;

  @NonNull
  public final ImageView ivFilterWishlist;

  @NonNull
  public final CardView llEmptyWishlistMsg;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextView textView21;

  @NonNull
  public final View view2;

  protected FragmentSeekerWishlistBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton appCompatButtonn, AppCompatButton btnSwipeJobs,
      ConstraintLayout constraintLayout19, ImageView ivFilterWishlist, CardView llEmptyWishlistMsg,
      RecyclerView recyclerView, TextView textView21, View view2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appCompatButtonn = appCompatButtonn;
    this.btnSwipeJobs = btnSwipeJobs;
    this.constraintLayout19 = constraintLayout19;
    this.ivFilterWishlist = ivFilterWishlist;
    this.llEmptyWishlistMsg = llEmptyWishlistMsg;
    this.recyclerView = recyclerView;
    this.textView21 = textView21;
    this.view2 = view2;
  }

  @NonNull
  public static FragmentSeekerWishlistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_seeker_wishlist, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSeekerWishlistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSeekerWishlistBinding>inflateInternal(inflater, R.layout.fragment_seeker_wishlist, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSeekerWishlistBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_seeker_wishlist, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSeekerWishlistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSeekerWishlistBinding>inflateInternal(inflater, R.layout.fragment_seeker_wishlist, null, false, component);
  }

  public static FragmentSeekerWishlistBinding bind(@NonNull View view) {
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
  public static FragmentSeekerWishlistBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSeekerWishlistBinding)bind(component, view, R.layout.fragment_seeker_wishlist);
  }
}
