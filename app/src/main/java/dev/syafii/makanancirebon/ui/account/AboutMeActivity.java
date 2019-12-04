package dev.syafii.makanancirebon.ui.account;
/*
 * Created by Muuhamad Syafi'i
 * Copyright (c) 2019.
 * All Rights Reserved
 *
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import dev.syafii.makanancirebon.R;
import dev.syafii.makanancirebon.utils.CustomToolbar;

public class AboutMeActivity extends AppCompatActivity {

    ImageView imgAbout;
    String imgUrl = "https://www.dicoding.com/images/small/avatar/20171107145703056e9ad3394c0687ad1cf9bc891cb98a.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        CustomToolbar.setupToolbar(this);

        imgAbout = findViewById(R.id.img_profile);

        Glide.with(this)
                .load(imgUrl)
                .apply(new RequestOptions())
                .into(imgAbout);



    }
}
