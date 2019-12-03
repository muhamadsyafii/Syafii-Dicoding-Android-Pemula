package dev.syafii.makanancirebon.ui.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import dev.syafii.makanancirebon.R;

public class DetailMakananActivity extends AppCompatActivity {

    public static String NAME = "makan_name";
    public static String PRICE = "price";
    public static String DESC = "desc";
    public static String IMG = "img";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        ImageView makanImg = findViewById(R.id.iv_makanan);
        TextView makanName = findViewById(R.id.tv_makan_name);
        TextView makanPrice = findViewById(R.id.tv_makan_price);
        TextView makanDesc = findViewById(R.id.tv_makan_desc);

        Glide.with(this)
                .load(getIntent().getStringExtra(IMG)).into(makanImg);
        makanName.setText(getIntent().getStringExtra(NAME));
        makanPrice.setText(getIntent().getStringExtra(PRICE));
        makanDesc.setText(Html.fromHtml(getIntent().getStringExtra(DESC)));

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Detail " + getIntent().getStringExtra(NAME));

        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
