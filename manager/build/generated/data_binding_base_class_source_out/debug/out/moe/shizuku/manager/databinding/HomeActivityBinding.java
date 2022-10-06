// Generated by view binder compiler. Do not edit!
package moe.shizuku.manager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import moe.shizuku.manager.R;
import rikka.widget.borderview.BorderRecyclerView;

public final class HomeActivityBinding implements ViewBinding {
  @NonNull
  private final BorderRecyclerView rootView;

  @NonNull
  public final BorderRecyclerView list;

  private HomeActivityBinding(@NonNull BorderRecyclerView rootView,
      @NonNull BorderRecyclerView list) {
    this.rootView = rootView;
    this.list = list;
  }

  @Override
  @NonNull
  public BorderRecyclerView getRoot() {
    return rootView;
  }

  @NonNull
  public static HomeActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomeActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.home_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomeActivityBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    BorderRecyclerView list = (BorderRecyclerView) rootView;

    return new HomeActivityBinding((BorderRecyclerView) rootView, list);
  }
}
