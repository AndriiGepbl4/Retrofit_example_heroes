package com.andrii.heroesretrofit;

/**
 * Created by Andrii on 11-Feb-18.
 */

public class Hero {

    private String name;
    private String realname;
    private String team;
    private String createdby;
    private String publicsher;
    private String imageUrl;
    private String bio;
    private String firstappearence;

    public Hero(String name, String realName, String team, String firstappearence, String createdby, String publicsher, String imageUrl, String bio) {
        this.name = name;
        this.realname = realName;
        this.team = team;
        this.firstappearence = firstappearence;
        this.createdby = createdby;
        this.publicsher = publicsher;
        this.imageUrl = imageUrl;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getCreatedby() {
        return createdby;
    }

    public String getPublicsher() {
        return publicsher;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getBio() {
        return bio;
    }

    public String getFirstappearence() {
        return firstappearence;
    }
}
