package com.cqut.beautifulapp.dto;

import com.cqut.beautifulapp.entity.User;

public class Users extends User {
    private String imageurl;

    public Users() {
    }

    public Users(String imageurl) {
        this.imageurl = imageurl;
    }

    @Override
    public String getImageurl() {
        return imageurl;
    }

    @Override
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    @Override
    public String toString() {
        return "Users{" +
                "imageurl='" + imageurl + '\'' +
                '}';
    }
}
