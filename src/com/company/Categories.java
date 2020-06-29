package com.company;

public enum Categories {
    Art("Art"),
    Sc("Science"),
    Sp ("Sports"),
    Hi("History"),
    En("Entertainment"),
    Geo ("Geography")
    ;
    private String category;


    Categories(String category) {
        this.category=category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return   super.toString();
    }
}
