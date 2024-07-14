package com.cqut.beautifulapp.dto;

import com.cqut.beautifulapp.entity.Technician;

public class Technicians extends Technician {
    private String proname;

    public Technicians(String proname) {
        this.proname = proname;
    }

    public Technicians() {
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }
}
