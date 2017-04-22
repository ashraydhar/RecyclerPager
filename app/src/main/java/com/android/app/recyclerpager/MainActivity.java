package com.android.app.recyclerpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    CardView cvItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView rvKings = (RecyclerView) findViewById(R.id.rvKings);

        ArrayList<King> kingList = generatedCardView();
        KingAdapter adapter = new KingAdapter(this, kingList);
        rvKings.setAdapter(adapter);
        rvKings.setLayoutManager(new LinearLayoutManager(this));
        rvKings.setHasFixedSize(true);
    }

    private ArrayList<King> generatedCardView() {
        ArrayList<King> list = new ArrayList<>();

        King maharana_pratap = new King(1, R.drawable.maharana_pratap, "Maharana Pratap", R.drawable.maharana_pratap_weapon1, R.drawable.maharana_pratap_weapon2);
        maharana_pratap.setId(1);
        maharana_pratap.setText("Maharana Pratap");
        maharana_pratap.setImg(R.drawable.maharana_pratap);
        maharana_pratap.setImg1_id(R.drawable.maharana_pratap_weapon1);
        maharana_pratap.setImg2_id(R.drawable.maharana_pratap_weapon2);
        list.add(maharana_pratap);

        King shivaji = new King(2, R.drawable.shivaji, "Shivaji", R.drawable.shivaji_weapon1, R.drawable.shivaji_weapon2);
        shivaji.setId(2);
        shivaji.setText("Shivaji");
        shivaji.setImg(R.drawable.shivaji);
        shivaji.setImg1_id(R.drawable.shivaji_weapon1);
        shivaji.setImg2_id(R.drawable.shivaji_weapon2);
        list.add(shivaji);

        King ranjit = new King(3, R.drawable.ranjit_singh, "Ranjit Singh", R.drawable.ranjit_weapon1, R.drawable.ranjit_weapon2);
        ranjit.setId(3);
        ranjit.setText("Ranjit Singh");
        ranjit.setImg(R.drawable.ranjit_singh);
        ranjit.setImg1_id(R.drawable.ranjit_weapon1);
        ranjit.setImg2_id(R.drawable.ranjit_weapon2);
        list.add(ranjit);

        return list;
    }


}
