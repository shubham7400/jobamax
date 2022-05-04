// Generated by data binding compiler. Do not edit!
package com.findajob.jobamax.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.findajob.jobamax.R;
import com.findajob.jobamax.model.JobSeeker;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentPortfolioDescriptionBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView civUser;

  @NonNull
  public final EditText etLink;

  @NonNull
  public final EditText etPortfolioDescription;

  @NonNull
  public final ImageView ivAddLink;

  @NonNull
  public final ImageView ivBackButton;

  @NonNull
  public final RelativeLayout relativeLayout;

  @NonNull
  public final RecyclerView rvLinks;

  @NonNull
  public final TextView textView31;

  @NonNull
  public final TextView tvText;

  @NonNull
  public final TextView tvText1;

  @NonNull
  public final TextView tvTextSize;

  @Bindable
  protected JobSeeker mJobSeeker;

  protected FragmentPortfolioDescriptionBinding(Object _bindingComponent, View _root,
      int _localFieldCount, CircleImageView civUser, EditText etLink,
      EditText etPortfolioDescription, ImageView ivAddLink, ImageView ivBackButton,
      RelativeLayout relativeLayout, RecyclerView rvLinks, TextView textView31, TextView tvText,
      TextView tvText1, TextView tvTextSize) {
    super(_bindingComponent, _root, _localFieldCount);
    this.civUser = civUser;
    this.etLink = etLink;
    this.etPortfolioDescription = etPortfolioDescription;
    this.ivAddLink = ivAddLink;
    this.ivBackButton = ivBackButton;
    this.relativeLayout = relativeLayout;
    this.rvLinks = rvLinks;
    this.textView31 = textView31;
    this.tvText = tvText;
    this.tvText1 = tvText1;
    this.tvTextSize = tvTextSize;
  }

  public abstract void setJobSeeker(@Nullable JobSeeker jobSeeker);

  @Nullable
  public JobSeeker getJobSeeker() {
    return mJobSeeker;
  }

  @NonNull
  public static FragmentPortfolioDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_portfolio_description, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPortfolioDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPortfolioDescriptionBinding>inflateInternal(inflater, R.layout.fragment_portfolio_description, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPortfolioDescriptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_portfolio_description, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPortfolioDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPortfolioDescriptionBinding>inflateInternal(inflater, R.layout.fragment_portfolio_description, null, false, component);
  }

  public static FragmentPortfolioDescriptionBinding bind(@NonNull View view) {
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
  public static FragmentPortfolioDescriptionBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentPortfolioDescriptionBinding)bind(component, view, R.layout.fragment_portfolio_description);
  }
}
