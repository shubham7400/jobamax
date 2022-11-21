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

public abstract class ItemProfilePortfolioBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clParent;

  @NonNull
  public final CardView llPortfolio;

  @NonNull
  public final RecyclerView rvPortfolioDocLink;

  @NonNull
  public final RecyclerView rvPortfolioLink;

  protected ItemProfilePortfolioBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout clParent, CardView llPortfolio, RecyclerView rvPortfolioDocLink,
      RecyclerView rvPortfolioLink) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clParent = clParent;
    this.llPortfolio = llPortfolio;
    this.rvPortfolioDocLink = rvPortfolioDocLink;
    this.rvPortfolioLink = rvPortfolioLink;
  }

  @NonNull
  public static ItemProfilePortfolioBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_profile_portfolio, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemProfilePortfolioBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemProfilePortfolioBinding>inflateInternal(inflater, R.layout.item_profile_portfolio, root, attachToRoot, component);
  }

  @NonNull
  public static ItemProfilePortfolioBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_profile_portfolio, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemProfilePortfolioBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemProfilePortfolioBinding>inflateInternal(inflater, R.layout.item_profile_portfolio, null, false, component);
  }

  public static ItemProfilePortfolioBinding bind(@NonNull View view) {
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
  public static ItemProfilePortfolioBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemProfilePortfolioBinding)bind(component, view, R.layout.item_profile_portfolio);
  }
}
