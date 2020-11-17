package com.nila.submissionaminurachmadicoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Membaca view Toolbar yang ada di XML dan mengaturnya sebagai ActionBar
    //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    //setSupportActionBar(toolbar);

    // Menampilkan ikon di Toolbar
//    getSupportActionBar().setDisplayShowHomeEnabled(true);
//    getSupportActionBar().setLogo(R.mipmap.ic_launcher);
//    getSupportActionBar().setDisplayUseLogoEnabled(true);
    @BindView(R.id.tv_cerita_rakyat)
    TextView tvCeritaRakyat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvCeritaRakyat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_cerita_rakyat:
                Intent moveIntent = new Intent(MainActivity.this, CeritaActivity.class);
                startActivity(moveIntent);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.about){
            Intent intent = new Intent(this, AboutMeActivity.class);
            startActivity(intent);
        }
        return true;
    }
}
