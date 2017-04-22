package com.android.app.recyclerpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ReplaceEmpty extends Fragment {

    ViewPager viewPager;
    Button btnPast1;
    Button btnPast2;

    public ReplaceEmpty() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {



        View rootview = inflater.inflate(R.layout.replace_empty, container, false);



        Bundle bundle3 = this.getArguments();
        if(bundle3 != null) {
            int img1 = bundle3.getInt("img1");
            int img2 = bundle3.getInt("img2");

            Bundle bundle = new Bundle();
            bundle.putInt("img1",img1);
            Past_Fragment1 fragobj=new Past_Fragment1();
            fragobj.setArguments(bundle);

            Bundle bundle2 = new Bundle();
            bundle2.putInt("img2",img2);
            Past_Fragment2 fragobj2=new Past_Fragment2();
            fragobj2.setArguments(bundle2);
        }





        btnPast1 = (Button) rootview.findViewById(R.id.btn_past_1);
        btnPast2 = (Button) rootview.findViewById(R.id.btn_past_2);
        viewPager = (ViewPager) rootview.findViewById(R.id.view_pager);
        btnPast1.setBackgroundResource(R.drawable.on);
        FragmentStatePagerAdapter fragmentStatePagerAdapter = new FragmentStatePagerAdapter(getChildFragmentManager()) {
            @Override
            public Fragment getItem(final int position) {
                if (position == 0) {

                    return new Past_Fragment1();
                }
                return new Past_Fragment2();
            }

            @Override
            public int getCount() {
                return 2;
            }
        };

        btnPast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                viewPager.setCurrentItem(0);
                btnPast2.setBackgroundResource(R.drawable.download);
                btnPast1.setBackgroundResource(R.drawable.on);

            }

        });

        btnPast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                viewPager.setCurrentItem(1);
                btnPast1.setBackgroundResource(R.drawable.download);
                btnPast2.setBackgroundResource(R.drawable.on);
            }

        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(final int position, final float positionOffset, final int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(final int position) {
                if (position == 0) {
                    btnPast2.setBackgroundResource(R.drawable.download);
                    btnPast1.setBackgroundResource(R.drawable.on);
                } else {
                    btnPast1.setBackgroundResource(R.drawable.download);
                    btnPast2.setBackgroundResource(R.drawable.on);
                }
            }

            public void onPageScrollStateChanged(final int state) {

            }
        });

        viewPager.setAdapter(fragmentStatePagerAdapter);
        return rootview;
    }

}