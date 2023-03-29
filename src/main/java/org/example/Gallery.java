package org.example;

import java.util.ArrayList;

public class Gallery {
    private String name;
    private double till;
    private ArrayList<Artwork> artworks;

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.artworks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public double getTill() {
        return till;
    }
    public ArrayList<Artwork> getArtworks() {
        return artworks;
    }

    public void setTill(double till) {
        this.till = till;
    }

//    add artwork method
    public void addArtworks(Artwork artwork){
        this.artworks.add(artwork);
    }

    public int getArtworkCount() {
        return this.artworks.size();
    }
}
