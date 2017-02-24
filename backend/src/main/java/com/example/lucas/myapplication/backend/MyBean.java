package com.example.lucas.myapplication.backend;

import com.example.Joke;
import com.example.Joker;

/**
 * The object model for the data we are sending through endpoints

 Body Count - No Lives Matter
 vevo.ly/7MadXb

 Steel Panther - Poontang Boomerang
 vevo.ly/m5teKE


 1:35 / 4:12

 */
public class MyBean {

    Joker joker;
    Joke joke;
    String data;

    public String getData() {
        return data;
    }

    public void setData() {
        joker = new Joker();
        data = joker.getJoke();
    }
}