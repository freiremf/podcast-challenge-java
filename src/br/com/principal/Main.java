package br.com.principal;

import br.com.challenge.modelo.Favorites;
import br.com.challenge.modelo.Song;
import br.com.challenge.modelo.Podcast;

public class Main {
    public static void main(String[] args) {
        Song awake = new Song("Awake", 2.56);
        awake.setArtist("Duran duran");

        for (int i=0; i<=5000; i++)
            awake.play();

        for (int i=0; i<=500; i++)
            awake.like();

        Podcast podcast = new Podcast("A mulher da casa abandonada", 48.27);
        podcast.setHost("Rodrigo Alberto");
        podcast.setDescription("Rodrigo Alberto traz mais um episódio da casa abandonada");

        for (int i=0; i<=50; i++)
            podcast.play();

        for (int i=0; i<=10; i++)
            podcast.like();

        Favorites favorites = new Favorites();
        favorites.include(awake);
        favorites.include(podcast);
    }
}