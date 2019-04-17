package com.example.myapplication;

public class Exampleitem {
    private String mImageUrl;
    private String mCreator;
    private int mLikes;

    public Exampleitem(String imageUrl, String creator, int likes) {
        this.mImageUrl = imageUrl;
        this.mCreator = creator;
        this.mLikes = likes;
    }

    public String getImageUrl() {
        return mImageUrl;
    }


    public String getCreator() {
        return mCreator;
    }

    public int getlikeCount() {
        return mLikes;
    }


}
