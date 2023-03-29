package org.example;

public class Artwork {
    private String title;
    private String artist;
    private double price;
    public Artwork(String title, String artist){
        this.title = title;
        this.artist = artist;
        this.price = 0;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
