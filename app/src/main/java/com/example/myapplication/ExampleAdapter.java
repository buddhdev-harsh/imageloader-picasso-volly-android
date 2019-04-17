package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private Context mContext;
    private ArrayList<Exampleitem> mExampleLis;

    public ExampleAdapter(Context context,ArrayList<Exampleitem> examplelist){
        mContext=context;
        mExampleLis=examplelist;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(mContext).inflate(R.layout.example_item, viewGroup,false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder, int i) {
        Exampleitem currentItem=mExampleLis.get(i);
        String imageUrl=currentItem.getImageUrl();
        String creatorName=currentItem.getCreator();
        int likeCount=currentItem.getlikeCount();

        exampleViewHolder.mTextViewcreator.setText(creatorName);
        exampleViewHolder.mTextviewLikes.setText("Likes: "+likeCount);
        Picasso.with(mContext).load(imageUrl).fit().centerInside().into(exampleViewHolder.mImageview);
    }

    @Override
    public int getItemCount() {
        return mExampleLis.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageview;
        public TextView mTextViewcreator;
        public TextView mTextviewLikes;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageview=itemView.findViewById(R.id.image_view);
            mTextViewcreator=itemView.findViewById(R.id.text_view_creator);
            mTextviewLikes=itemView.findViewById(R.id.text_view_likes);
        }
    }
}
