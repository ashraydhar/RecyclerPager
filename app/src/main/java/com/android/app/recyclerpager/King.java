package com.android.app.recyclerpager;

import java.io.Serializable;


public class King implements Serializable {

    private int id;
    private int img;
    private String text;
    private int img1_id;
    private int img2_id;


    public King(final int id,final int img,final String text,final int img1_id,final int img2_id) {
        this.id = id;
        this.img = img;
        this.text = text;
        this.img1_id = img1_id;
        this.img2_id = img2_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImg1_id() {
        return img1_id;
    }

    public void setImg1_id(int img1_id) {
        this.img1_id = img1_id;
    }

    public int getImg2_id() {
        return img2_id;
    }

    public void setImg2_id(int img2_id) {
        this.img2_id = img2_id;
    }
}
