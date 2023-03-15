package onlineShop;

import java.util.ArrayList;
import java.util.List;

public class Dvd extends Product {

    Dvd(float price, List<Artist> artists, String uuid, String title) {
        this.price = price;
        this.artists = artists;

        this.title=title;
        this.uuid = uuid;

    }





    private List<Artist> artists = new ArrayList<>();

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }
}
