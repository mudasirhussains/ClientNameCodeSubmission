// Generated by view binder compiler. Do not edit!
package com.apex.codeassesment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.apex.codeassesment.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailsBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final MaterialTextView detailsAge;

  @NonNull
  public final MaterialTextView detailsEmail;

  @NonNull
  public final ImageView detailsImage;

  @NonNull
  public final MaterialTextView detailsLocation;

  @NonNull
  public final MaterialButton detailsLocationButton;

  @NonNull
  public final MaterialTextView detailsName;

  private ActivityDetailsBinding(@NonNull CoordinatorLayout rootView,
      @NonNull MaterialTextView detailsAge, @NonNull MaterialTextView detailsEmail,
      @NonNull ImageView detailsImage, @NonNull MaterialTextView detailsLocation,
      @NonNull MaterialButton detailsLocationButton, @NonNull MaterialTextView detailsName) {
    this.rootView = rootView;
    this.detailsAge = detailsAge;
    this.detailsEmail = detailsEmail;
    this.detailsImage = detailsImage;
    this.detailsLocation = detailsLocation;
    this.detailsLocationButton = detailsLocationButton;
    this.detailsName = detailsName;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.details_age;
      MaterialTextView detailsAge = ViewBindings.findChildViewById(rootView, id);
      if (detailsAge == null) {
        break missingId;
      }

      id = R.id.details_email;
      MaterialTextView detailsEmail = ViewBindings.findChildViewById(rootView, id);
      if (detailsEmail == null) {
        break missingId;
      }

      id = R.id.details_image;
      ImageView detailsImage = ViewBindings.findChildViewById(rootView, id);
      if (detailsImage == null) {
        break missingId;
      }

      id = R.id.details_location;
      MaterialTextView detailsLocation = ViewBindings.findChildViewById(rootView, id);
      if (detailsLocation == null) {
        break missingId;
      }

      id = R.id.details_location_button;
      MaterialButton detailsLocationButton = ViewBindings.findChildViewById(rootView, id);
      if (detailsLocationButton == null) {
        break missingId;
      }

      id = R.id.details_name;
      MaterialTextView detailsName = ViewBindings.findChildViewById(rootView, id);
      if (detailsName == null) {
        break missingId;
      }

      return new ActivityDetailsBinding((CoordinatorLayout) rootView, detailsAge, detailsEmail,
          detailsImage, detailsLocation, detailsLocationButton, detailsName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
