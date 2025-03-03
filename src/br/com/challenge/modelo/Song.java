package br.com.challenge.modelo;

public class Musica extends Audio implements Classificavel {
    private String artista;
    private String album;
    private String genero;

    public Musica(String titulo, double duracao) {
        super(titulo, duracao);
    }

    @Override
    public void classificar(int nota) {
        this.classificar(nota);
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
