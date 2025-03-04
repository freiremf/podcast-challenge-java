package br.com.challenge.modelo;

public class Audio {
    private final String title;
    private final double amountTime;
    private int totalStreamings;
    private int totalLikes;
    private final int rate;

    public Audio(String title, double amountTime) {
        this.title = title;
        this.amountTime = amountTime;
        this.totalStreamings = 0;
        this.totalLikes = 0;
        this.rate = 0;
    }

    public void like() {
        this.totalLikes++;
    }

    public void play() {
        this.totalStreamings++;
    }

    public String getTitle() {
        return title;
    }

    public double getAmountTime() {
        return amountTime;
    }

    public int getTotalStreamings() {
        return totalStreamings;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getRate() {
        return this.rate;
    }
}
