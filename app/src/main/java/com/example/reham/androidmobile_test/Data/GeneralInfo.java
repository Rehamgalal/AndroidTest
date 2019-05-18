package com.example.reham.androidmobile_test.Data;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class GeneralInfo {
    @SerializedName("description")
    private String description;
    @SerializedName("member")
    private MemberInfo member;
    @SerializedName("post_medias")
    private List<PostMedias> postMedias;

    public GeneralInfo(String description, MemberInfo member, List<PostMedias> postMedias) {
        this.description = description;
        this.member = member;
        this.postMedias = postMedias;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MemberInfo getMember() {
        return member;
    }

    public void setMember(MemberInfo member) {
        this.member = member;
    }

    public List<PostMedias> getPostMedias() {
        return postMedias;
    }

    public void setPostMedias(List<PostMedias> postMedias) {
        this.postMedias = postMedias;
    }
}
