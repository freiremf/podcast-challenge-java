package br.com.challenge.modelo;

public class Podcast extends Audio {
    private String host;
    private String invited;
    private String description;

    public Podcast (String title, double amountTime) {
        super(title, amountTime);
    }

    @Override
    public int getRate() {
        if(this.getTotalLikes() > 500) return 10;
        return 5;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getInvited() {
        return invited;
    }

    public void setInvited(String invited) {
        this.invited = invited;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
