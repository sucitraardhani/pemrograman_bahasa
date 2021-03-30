package com.example.pemrograman_bhs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import static android.view.KeyCharacterMap.load;

public class DetailBahasaMainActivity extends AppCompatActivity {
    public static String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_bahasa_main);

        ImageView imgBhs = findViewById(R.id.imgBhs);
        TextView tvBhsName = findViewById(R.id.tv_namaBhs);
        TextView tvBhsDetail = findViewById(R.id.tvDetailBhs);
        
        Bahasa bahasa = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(bahasa != null){
            Glide.with(this)
                    .load(bahasa.getPhoto())
                    .into(imgBhs);
            tvBhsName.setText(bahasa.getName());
            tvBhsDetail.setText(bahasa.getDetail());
        }
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Bahasa");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}