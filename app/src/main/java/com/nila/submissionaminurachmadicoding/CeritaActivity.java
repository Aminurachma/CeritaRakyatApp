package com.nila.submissionaminurachmadicoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.nila.submissionaminurachmadicoding.adapter.CeritaAdapter;
import com.nila.submissionaminurachmadicoding.model.Cerita;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CeritaActivity extends AppCompatActivity {


    @BindView(R.id.rv_cerita)
    RecyclerView rvCerita;
    private ArrayList<Cerita> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerita);
        ButterKnife.bind(this);

        rvCerita.setHasFixedSize(true);

        DataCerita();

        showRecyclerlist();

        if (getSupportActionBar() != null ){
            getSupportActionBar().setTitle("Cerita Rakyat");
        }
    }

    private void showRecyclerlist() {
        rvCerita.setLayoutManager(new LinearLayoutManager(this));
        CeritaAdapter ceritaAdapter = new CeritaAdapter(this);
        ceritaAdapter.setListCerita(list);
        rvCerita.setAdapter(ceritaAdapter);
        rvCerita.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    private void DataCerita() {
        list = new ArrayList<>();
        list.add(new Cerita("1.","Timun Mas",getResources().getString(R.string.timunmas),R.drawable.timunmas));
        list.add(new Cerita("2.","Keong Mas",getResources().getString(R.string.timunmas),R.drawable.keongmas));
        list.add(new Cerita("3.","Malin Kundang",getResources().getString(R.string.malin),R.drawable.malin));
        list.add(new Cerita("4.","Ande Ande Lumut",getResources().getString(R.string.ande),R.drawable.andeande));
        list.add(new Cerita("5.","Bawang Merah Bawang Putih",getResources().getString(R.string.bawang),R.drawable.bawang));
        list.add(new Cerita("6.","Lutung Kasarung",getResources().getString(R.string.lutung),R.drawable.lutungg));
        list.add(new Cerita("7.","Asal Usul Danau Toba",getResources().getString(R.string.danau),R.drawable.danautoba));
        list.add(new Cerita("8.","Sangkuriang",getResources().getString(R.string.sang),R.drawable.sangkuriang));
        list.add(new Cerita("9.","Cinderelas dan Ayam Ajaib",getResources().getString(R.string.cinder),R.drawable.cinderelas));
        list.add(new Cerita("10.","Batu Menangis",getResources().getString(R.string.batu),R.drawable.batu));




    }

}
