package onlineShop;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Main {
    public static void main(String[] args) throws IOException {


        Artist artist = new Artist("Rachel", "McLean", LocalDate.now(), "Young English woman who was murdered at age nineteen by her fiancé, John Tanner");
        Book book = new Book(2.99f,artist,"B0BV2L974M", "The lighthouse murders");
        Basket basket = new Basket();
        basket.addProduct(book);
        List<Artist> artistList = new ArrayList<>();
        artistList.add(artist);
        artistList.addAll(new ArrayList<>(List.of(artist, artist, artist)));

        Dvd dvd = new Dvd(58.20f,artistList,"B09JM4HLTD","The 100: The Complete Series" );
        basket.addProduct(dvd);

        Book book2 = new Book(6.99f, artist,"Bonnnnnjooouuur","Salut tout le monde");

        basket.addProduct(book2);


        Path filePathBook = Paths.get("/home", "user", "documents", "book.json");
        Path filePathDVD = Paths.get("/home", "user", "documents", "DVD.xml");


        basket.showProducts();

        basket.showTotalPrice();

    }
}
