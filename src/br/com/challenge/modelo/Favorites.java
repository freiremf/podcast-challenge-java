package br.com.challenge.modelo;

public class Favorites {

    public void include(Audio audio) {
        if(audio.getRate() >= 9)
            System.out.println(audio.getTitle() + " foi adicionado aos favoritos");
        else
            System.out.println(audio.getTitle() + " não atende aos critérios para ser adicionado aos favoritos");
    }
}
