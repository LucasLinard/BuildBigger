package com.example;

/**
 * Created by lucas on 19/02/17.
 */

public class Joke {
    private int id;
    private String text;

    public Joke(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
