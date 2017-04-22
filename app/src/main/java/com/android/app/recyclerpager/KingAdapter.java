package com.android.app.recyclerpager;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.android.app.recyclerpager.R.id.parent;


public class KingAdapter extends RecyclerView.Adapter<KingAdapter.KingViewHolder> {

    private Context context;
    private ArrayList<King> kingList;

    public KingAdapter(Context context, ArrayList<King> kingList) {
        this.context = context;
        this.kingList = kingList;
    }

    @Override
    public KingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.from(parent.getContext()).inflate(R.layout.kings_layout, parent, false);
        KingViewHolder kingViewHolder = new KingViewHolder(view);
        return kingViewHolder;
    }

    @Override
    public void onBindViewHolder(KingViewHolder holder, int position) {
        final King king = kingList.get(position);
        holder.iv1.setImageResource(king.getImg());
        holder.tvTitle.setText(king.getText());
        holder.btnWeapons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Empty.class);
                intent.putExtra("img1",king.getImg1_id());
                intent.putExtra("img2",king.getImg2_id());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (kingList != null) {
            return kingList.size();
        }
        return 0;
    }


    public class KingViewHolder extends RecyclerView.ViewHolder {
        public CardView cvKing;
        public ImageView iv1;
        public TextView tvTitle;
        public Button btnWeapons;


        public KingViewHolder(View kingView) {
            super(kingView);
//            final int pos = getAdapterPosition();
            cvKing = (CardView) kingView.findViewById(R.id.cvKing);
            iv1 = (ImageView) kingView.findViewById(R.id.iv1);
            tvTitle = (TextView) kingView.findViewById(R.id.tvTitle);
            btnWeapons = (Button) kingView.findViewById(R.id.weapons);

//            btnWeapons.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    King king = kingList.get(getAdapterPosition());
//                    Intent intent = new Intent(context,Empty.class);
//                    intent.putExtra("img1",king.getImg1_id());
//                    intent.putExtra("img2",king.getImg2_id());
//                    context.startActivity(intent);
//                }
//            });
        }
    }

}
