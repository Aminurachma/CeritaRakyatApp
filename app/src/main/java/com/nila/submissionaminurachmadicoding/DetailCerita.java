package com.nila.submissionaminurachmadicoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailCerita extends AppCompatActivity {

    @BindView(R.id.detail_judul)
    TextView judulCerita;
    @BindView(R.id.detail_cerita)
    TextView detailCerita;
    @BindView(R.id.detail_img)
    ImageView imgCerita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cerita);


        ButterKnife.bind(this);

        Intent intent = getIntent();
        String judulCeritaa = intent.getExtras().getString("JudulCerita");
        String detailCeritaa = intent.getExtras().getString("Cerita");
        int detailImg = intent.getExtras().getInt("ImgCerita");

        judulCerita.setText(judulCeritaa);
        detailCerita.setText(detailCeritaa);
        Glide.with(this)
                .load(detailImg)
                .into(imgCerita);

        if (getSupportActionBar() != null ){
            getSupportActionBar().setTitle(judulCeritaa);
        }

    }
}
