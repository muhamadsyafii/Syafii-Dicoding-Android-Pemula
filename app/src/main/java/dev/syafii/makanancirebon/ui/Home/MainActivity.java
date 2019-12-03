package dev.syafii.makanancirebon.ui.Home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import dev.syafii.makanancirebon.R;
import dev.syafii.makanancirebon.adapter.MakananAdapter;
import dev.syafii.makanancirebon.data.dummy.MakananDummy;
import dev.syafii.makanancirebon.data.model.Makanan;
import dev.syafii.makanancirebon.ui.account.AboutMeActivity;
import dev.syafii.makanancirebon.utils.ActivityUtils;
import dev.syafii.makanancirebon.utils.CustomToolbar;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMakanan;
    private ArrayList<Makanan> listMakan = new ArrayList<>();
    ImageView imAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imAccount = findViewById(R.id.im_account);
        rvMakanan = findViewById(R.id.rv_makan);
        rvMakanan.setHasFixedSize(true);
        listMakan.addAll(MakananDummy.getData());

        onClick();
        showRecycleList();
    }

    private void onClick() {
        imAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityUtils.openActivity(MainActivity.this, AboutMeActivity.class);
            }
        });
    }


    private void showRecycleList() {
        rvMakanan.setLayoutManager(new LinearLayoutManager(this));
        MakananAdapter makananAdapter = new MakananAdapter(listMakan);
        rvMakanan.setAdapter(makananAdapter);
        makananAdapter.setOnItemClickCallback(new MakananAdapter.onItemClickCallback() {
            @Override
            public void onItemClicked(Makanan data) {
                moveToDetail(data);
            }
        });
    }

    private void moveToDetail(Makanan data) {
        Intent i = new Intent(MainActivity.this, DetailMakananActivity.class);
        i.putExtra(DetailMakananActivity.IMG, data.getImage());
        i.putExtra(DetailMakananActivity.NAME, data.getName());
        i.putExtra(DetailMakananActivity.PRICE, data.getPrice());
        i.putExtra(DetailMakananActivity.DESC, data.getDesciption());
        startActivity(i);
    }
}
