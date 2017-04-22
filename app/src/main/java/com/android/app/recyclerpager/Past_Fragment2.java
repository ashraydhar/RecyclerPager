package com.android.app.recyclerpager;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Past_Fragment2 extends Fragment {


    public Past_Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_past__fragment2, container, false);

        Bundle bundle2 = this.getArguments();
        if(bundle2 != null) {
            int img2 = getArguments().getInt("img2");
            ImageView image2 = (ImageView) rootview.findViewById(R.id.WeaponsImageView2);
//        Resources res = getResources(); /** from an Activity */
            image2.setImageResource(img2);
        }


        return rootview;
    }

}

