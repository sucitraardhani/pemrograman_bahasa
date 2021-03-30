package com.example.pemrograman_bhs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBahasa;
    private ArrayList<Bahasa> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBahasa = findViewById(R.id.rv_bahasa);
        rvBahasa.setHasFixedSize(true);

        list.addAll(BahasaData.getListData());
        showRecylerList();
    }

    private void showRecylerList(){
        rvBahasa.setLayoutManager(new LinearLayoutManager(this));
        ListBahasaAdapter listBahasaAdapter = new ListBahasaAdapter(list);
        rvBahasa.setAdapter(listBahasaAdapter);

        listBahasaAdapter.setOnItemClickCallback(new ListBahasaAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Bahasa bahasa) {
                Intent moveIntent = new Intent(MainActivity.this, DetailBahasaMainActivity.class);
                moveIntent.putExtra(DetailBahasaMainActivity.ITEM_EXTRA, bahasa);
                startActivity(moveIntent);
            }
        });
    }

}