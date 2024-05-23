// Generated by view binder compiler. Do not edit!
package org.hyperskill.stopwatch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.hyperskill.stopwatch.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout btnContainer;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final Button resetButton;

  @NonNull
  public final Button startButton;

  @NonNull
  public final TextView textView;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull LinearLayout btnContainer,
      @NonNull ProgressBar progressBar, @NonNull Button resetButton, @NonNull Button startButton,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.btnContainer = btnContainer;
    this.progressBar = progressBar;
    this.resetButton = resetButton;
    this.startButton = startButton;
    this.textView = textView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnContainer;
      LinearLayout btnContainer = ViewBindings.findChildViewById(rootView, id);
      if (btnContainer == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.resetButton;
      Button resetButton = ViewBindings.findChildViewById(rootView, id);
      if (resetButton == null) {
        break missingId;
      }

      id = R.id.startButton;
      Button startButton = ViewBindings.findChildViewById(rootView, id);
      if (startButton == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, btnContainer, progressBar,
          resetButton, startButton, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
