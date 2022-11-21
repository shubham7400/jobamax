// Generated by data binding compiler. Do not edit!
package com.jobamax.appjobamax.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.jobamax.appjobamax.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DailogWishlistFilterBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatCheckBox cbAll;

  @NonNull
  public final AppCompatCheckBox cbArchive;

  @NonNull
  public final AppCompatCheckBox cbDone;

  @NonNull
  public final AppCompatCheckBox cbInProgress;

  @NonNull
  public final ImageView ivArrowDown;

  @NonNull
  public final TextView textView24;

  protected DailogWishlistFilterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatCheckBox cbAll, AppCompatCheckBox cbArchive, AppCompatCheckBox cbDone,
      AppCompatCheckBox cbInProgress, ImageView ivArrowDown, TextView textView24) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cbAll = cbAll;
    this.cbArchive = cbArchive;
    this.cbDone = cbDone;
    this.cbInProgress = cbInProgress;
    this.ivArrowDown = ivArrowDown;
    this.textView24 = textView24;
  }

  @NonNull
  public static DailogWishlistFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dailog_wishlist_filter, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DailogWishlistFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DailogWishlistFilterBinding>inflateInternal(inflater, R.layout.dailog_wishlist_filter, root, attachToRoot, component);
  }

  @NonNull
  public static DailogWishlistFilterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dailog_wishlist_filter, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DailogWishlistFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DailogWishlistFilterBinding>inflateInternal(inflater, R.layout.dailog_wishlist_filter, null, false, component);
  }

  public static DailogWishlistFilterBinding bind(@NonNull View view) {
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
  public static DailogWishlistFilterBinding bind(@NonNull View view, @Nullable Object component) {
    return (DailogWishlistFilterBinding)bind(component, view, R.layout.dailog_wishlist_filter);
  }
}
