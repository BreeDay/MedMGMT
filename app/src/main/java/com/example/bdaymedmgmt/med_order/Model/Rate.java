package com.example.bdaymedmgmt.med_order.Model;

public class Rate {
    private String phone;
    private Rating ratings;

    public Rate(String phone, Rating ratings) {
        this.phone = phone;
        this.ratings = ratings;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Rating getRatings() {
        return ratings;
    }

    public void setRatings(Rating ratings) {
        this.ratings = ratings;
    }
}
