// Generated by data binding compiler. Do not edit!
package com.steed.top5.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.makeramen.roundedimageview.RoundedImageView;
import com.steed.top5.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BrowseCategoriesListSingleItemViewBinding extends ViewDataBinding {
  @NonNull
  public final RoundedImageView image;

  @NonNull
  public final TextView itemName;

  @NonNull
  public final View itemNameTopGap;

  @NonNull
  public final View itemTypeImageContainerStartGap;

  @NonNull
  public final View itemTypeImageContainerTopGap;

  protected BrowseCategoriesListSingleItemViewBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RoundedImageView image, TextView itemName, View itemNameTopGap,
      View itemTypeImageContainerStartGap, View itemTypeImageContainerTopGap) {
    super(_bindingComponent, _root, _localFieldCount);
    this.image = image;
    this.itemName = itemName;
    this.itemNameTopGap = itemNameTopGap;
    this.itemTypeImageContainerStartGap = itemTypeImageContainerStartGap;
    this.itemTypeImageContainerTopGap = itemTypeImageContainerTopGap;
  }

  @NonNull
  public static BrowseCategoriesListSingleItemViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.browse_categories_list_single_item_view, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BrowseCategoriesListSingleItemViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BrowseCategoriesListSingleItemViewBinding>inflateInternal(inflater, R.layout.browse_categories_list_single_item_view, root, attachToRoot, component);
  }

  @NonNull
  public static BrowseCategoriesListSingleItemViewBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.browse_categories_list_single_item_view, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BrowseCategoriesListSingleItemViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BrowseCategoriesListSingleItemViewBinding>inflateInternal(inflater, R.layout.browse_categories_list_single_item_view, null, false, component);
  }

  public static BrowseCategoriesListSingleItemViewBinding bind(@NonNull View view) {
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
  public static BrowseCategoriesListSingleItemViewBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (BrowseCategoriesListSingleItemViewBinding)bind(component, view, R.layout.browse_categories_list_single_item_view);
  }
}