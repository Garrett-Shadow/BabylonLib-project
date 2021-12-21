package com.hfad.babylonlib;

public class Author {
    int id;
    String name, portrait;

    public Author(int id, String name, String portrait) {
        this.id = id;
        this.name = name;
        this.portrait = portrait;
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
}
