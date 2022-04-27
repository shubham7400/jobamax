// Generated by data binding compiler. Do not edit!
package com.findajob.jobamax.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.findajob.jobamax.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemSearchQueryCompanyBinding extends ViewDataBinding {
  @NonNull
  public final ImageView civCompanyLogo;

  @NonNull
  public final ConstraintLayout clMostParent;

  @NonNull
  public final TextView tvCompanyDomain;

  @NonNull
  public final TextView tvCompanyName;

  protected ItemSearchQueryCompanyBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView civCompanyLogo, ConstraintLayout clMostParent,
      TextView tvCompanyDomain, TextView tvCompanyName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.civCompanyLogo = civCompanyLogo;
    this.clMostParent = clMostParent;
    this.tvCompanyDomain = tvCompanyDomain;
    this.tvCompanyName = tvCompanyName;
  }

  @NonNull
  public static ItemSearchQueryCompanyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_search_query_company, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemSearchQueryCompanyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemSearchQueryCompanyBinding>inflateInternal(inflater, R.layout.item_search_query_company, root, attachToRoot, component);
  }

  @NonNull
  public static ItemSearchQueryCompanyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_search_query_company, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemSearchQueryCompanyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemSearchQueryCompanyBinding>inflateInternal(inflater, R.layout.item_search_query_company, null, false, component);
  }

  public static ItemSearchQueryCompanyBinding bind(@NonNull View view) {
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
  public static ItemSearchQueryCompanyBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemSearchQueryCompanyBinding)bind(component, view, R.layout.item_search_query_company);
  }
}
