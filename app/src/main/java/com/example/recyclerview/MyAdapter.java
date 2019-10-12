package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<PAMPHLETVIEWHOLDER> {
    private Context mContext;
    private List<PamphletData> myPamphletList;

    public MyAdapter(Context mContext, List<PamphletData> myPamphletList) {
        this.mContext = mContext;
        this.myPamphletList = myPamphletList;
    }

    @Override
    public PAMPHLETVIEWHOLDER onCreateViewHolder(@NonNull  ViewGroup viewGroup, int viewType) {

        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_row_item,
                viewGroup,false);

        return new PAMPHLETVIEWHOLDER(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull final PAMPHLETVIEWHOLDER pamphletviewholder, int i) {

        pamphletviewholder.pamphlet.setImageResource(myPamphletList.get(i).getItemImage());
//        pamphletviewholder.mTitle.setText(myPamphletList.get(i).getItemName());
//        pamphletviewholder.mDescription.setText(myPamphletList.get(i).getItemDescription());
//        pamphletviewholder.mPrice.setText(myPamphletList.get(i).getItemPrice());

        pamphletviewholder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext,Detailactivity.class);
                intent.putExtra("Image",myPamphletList.get(pamphletviewholder.getAdapterPosition()).getItemImage());

//                intent.putExtra("Description",myPamphletList.get(pamphletviewholder.getAdapterPosition()).getItemDescription());
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return myPamphletList.size();

    }
}
class PAMPHLETVIEWHOLDER extends RecyclerView.ViewHolder{

    ImageView pamphlet;
//    TextView mTitle,mDescription,mPrice;
    CardView mCardView;


    public PAMPHLETVIEWHOLDER( View itemView) {
        super(itemView);

        pamphlet = itemView.findViewById(R.id.banner);
//        mTitle = itemView.findViewById(R.id.tvTitle);
//        mDescription = itemView.findViewById(R.id.tvDescription);
//        mPrice = itemView.findViewById(R.id.tvPrice);
        mCardView = itemView.findViewById(R.id.myCardview);

    }
}
