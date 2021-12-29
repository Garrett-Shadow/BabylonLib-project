package com.hfad.babylonlib;

public class Author {
    int id;
    String name, portrait, bio;

    public Author(int id, String name, String portrait, String bio) {
        this.id = id;
        this.name = name;
        this.portrait = portrait;
        this.bio = bio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
