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
public class Past_Fragment1 extends Fragment {


    public Past_Fragment1() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_past__fragment1, container, false);


        Bundle bundle = this.getArguments();
        if(bundle != null) {
            int img1 = bundle.getInt("img1");
            ImageView image = (ImageView) rootview.findViewById(R.id.WeaponsImageView1);
//         Resources res = getResources(); /** from an Activity */
            image.setImageResource(img1);

        }

        return rootview;
    }

}









