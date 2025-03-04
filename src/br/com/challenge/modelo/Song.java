package br.com.challenge.modelo;

public class Song extends Audio {
    private String artist;
    private String album;
    private String genre;

    public Song(String title, double amountTime) {
        super(title, amountTime);
    }

    @Override
    public int getRate() {
        if(this.getTotalStreamings() > 200) return 10;
        return 8;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
