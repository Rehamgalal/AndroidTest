package com.example.reham.androidmobile_test.Data;

import com.google.gson.annotations.SerializedName;

public class MemberInfo {
    @SerializedName("username")
    private String userName;
    @SerializedName("resized_avatar")
    private String userImage;

    public MemberInfo(String userName, String userImage) {
        this.userName = userName;
        this.userImage = userImage;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
