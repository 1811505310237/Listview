package com.example.listview;

public class Player {
    String name;
    int imgDrawbleId;
    public Player (String name, int imgDrawbleId){
        this.name=name;
        this.imgDrawbleId=imgDrawbleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgDrawbleId() {
        return imgDrawbleId;
    }

    public void setImgDrawbleId(int imgDrawbleId) {
        this.imgDrawbleId = imgDrawbleId;
    }
}
