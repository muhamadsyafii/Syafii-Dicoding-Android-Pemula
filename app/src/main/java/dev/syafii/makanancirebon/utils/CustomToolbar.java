package dev.syafii.makanancirebon.utils;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;

import dev.syafii.makanancirebon.R;

public class CustomToolbar {

    public static void setupToolbar(final Activity activity) {
        View view = activity.getWindow().getDecorView();
        ImageView mToolbarBack = view.findViewById(R.id.mToolbarBack);
        mToolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityUtils.closeActivity(activity);
            }
        });

    }

}
