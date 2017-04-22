package com.android.app.recyclerpager;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Empty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
        Intent intent = getIntent();
        int img1 = intent.getIntExtra("img1",0);
        int img2 = intent.getIntExtra("img2",0);
        /**
         * pass this images to fragmnet
         */

        Bundle bundle3=new Bundle();
        bundle3.putInt("img1",img1);
        bundle3.putInt("img2",img2);
        ReplaceEmpty fragobj=new ReplaceEmpty();
        fragobj.setArguments(bundle3);

        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.replaceit,new ReplaceEmpty());
        ft.commit();
    }
}
