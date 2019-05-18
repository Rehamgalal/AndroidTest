package com.example.reham.androidmobile_test.Data;

import com.google.gson.annotations.SerializedName;

public class PostMedias {
    @SerializedName("cover_image")
    private String imagePath;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
