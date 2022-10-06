// Generated by view binder compiler. Do not edit!
package moe.shizuku.manager.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import moe.shizuku.manager.R;

public final class HomeServerStatusBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView icon;

  @NonNull
  public final TextView text1;

  @NonNull
  public final TextView text2;

  private HomeServerStatusBinding(@NonNull LinearLayout rootView, @NonNull ImageView icon,
      @NonNull TextView text1, @NonNull TextView text2) {
    this.rootView = rootView;
    this.icon = icon;
    this.text1 = text1;
    this.text2 = text2;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HomeServerStatusBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomeServerStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.home_server_status, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomeServerStatusBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = android.R.id.icon;
      ImageView icon = ViewBindings.findChildViewById(rootView, id);
      if (icon == null) {
        break missingId;
      }

      id = android.R.id.text1;
      TextView text1 = ViewBindings.findChildViewById(rootView, id);
      if (text1 == null) {
        break missingId;
      }

      id = android.R.id.text2;
      TextView text2 = ViewBindings.findChildViewById(rootView, id);
      if (text2 == null) {
        break missingId;
      }

      return new HomeServerStatusBinding((LinearLayout) rootView, icon, text1, text2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
