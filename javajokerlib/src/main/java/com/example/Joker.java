package com.example;

import java.util.ArrayList;

public class Joker {

    static ArrayList<Joke> jokes = null;
    static int index = 0;

    public String getJoke() {
        int i = index;
        index++;

        // Only 13 jokes in the javalib version.
        if (index > 12) {
            index = 0;
        }

        if (jokes == null) {
            initJokes();
        }
        return jokes.get(i).getText();
    };

    public void initJokes() {
        jokes = new ArrayList<>();

        Joke currentJoke;
        currentJoke = new Joke(1, "I started a joke which started the whole world crying");
        jokes.add(currentJoke);

        currentJoke = new Joke(2, "But I didn't see that the joke was on me oh no");
        jokes.add(currentJoke);

        currentJoke = new Joke(3, "I started to cry which started the whole world laughing");
        jokes.add(currentJoke);

        currentJoke = new Joke(4, "Oh If I'd only seen that the joke was on me");
        jokes.add(currentJoke);

        currentJoke = new Joke(5, "I looked at the skies running my hands over my eyes");
        jokes.add(currentJoke);

        currentJoke = new Joke(6, "And I fell out of bed hurting my head from things that I said");
        jokes.add(currentJoke);

        currentJoke = new Joke(7, "'Till I finally died which started the whole world living");
        jokes.add(currentJoke);

        currentJoke = new Joke(8, "Oh if I'd only seen that the joke was on me");
        jokes.add(currentJoke);

        currentJoke = new Joke(9, "I looked at the skies running my hands over my eyes");
        jokes.add(currentJoke);

        currentJoke = new Joke(10, "And I fell out of bed hurting my head from things that I said");
        jokes.add(currentJoke);

        currentJoke = new Joke(11, "'Till I finally died which started the whole world living");
        jokes.add(currentJoke);

        currentJoke = new Joke(12, "Oh if I'd only seen that the joke was on me");
        jokes.add(currentJoke);

        currentJoke = new Joke(13, "Oh no that the joke was on me");
        jokes.add(currentJoke);
    };



}
