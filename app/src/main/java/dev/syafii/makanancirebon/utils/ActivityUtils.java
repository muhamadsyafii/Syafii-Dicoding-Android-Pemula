package dev.syafii.makanancirebon.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class ActivityUtils {

    public static void openActivity(Context context, Class<?> target){
        context.startActivity(new Intent(context, target));
    }

    public static void closeActivity(Context context){
        if (context != null){
            hideKeyboard((Activity) context);
            ((Activity) context).finish();
        }
    }
    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        View view = activity.getCurrentFocus();
        if (view == null) {
            view = new View(activity);
        }
        assert imm != null;
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
