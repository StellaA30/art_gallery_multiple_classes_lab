package org.example;
public class Customer {

    private String name;
    private double wallet;

    public Customer(String name){
        this.name = name;
        this.wallet = 1000;
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

//    METHODS

// Assign a price to the artwork - Artwork class/object
// Get the till and add price to till - Gallery class/object
// Value to be removed from Customer wallet - Customer object
// Remove artwork from Artwork array list

    public void buyArtwork(Artwork artwork, Gallery gallery){
        double totalTill = gallery.getTill();
        for (Artwork art : gallery.getArtworks()) {
            double priceOfArt = art.getPrice();
            this.wallet -= priceOfArt;
            totalTill += priceOfArt;

        }

    }


}
