package com.cqut.beautifulapp.dto;

import com.cqut.beautifulapp.entity.Project;

public class Projects extends Project {
    public Projects(String imageurl) {
        this.imageurl = imageurl;
    }

    private String imageurl;

    public Projects() {
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "imageurl='" + imageurl + '\'' +
                '}';
    }
}
