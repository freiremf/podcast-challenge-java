package br.com.challenge;

public class Podcast extends Audio implements Classificavel{
    private String apresentador;
    private String convidado;

    public Podcast (String titulo, double duracao) {
        super(titulo, duracao);
    }

    @Override
    public void classificar(int nota) {

    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }
}
