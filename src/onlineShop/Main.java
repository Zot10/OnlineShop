package onlineShop;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
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


        try {
            // créer un objet ObjectMapper pour lire le fichier JSON
            ObjectMapper objectMapper = new ObjectMapper();

            // lire le fichier JSON et le stocker dans une structure de données Java
            Object json = objectMapper.readValue(new File("C:\\Users\\zotri\\OneDrive\\Bureau\\HES\\Programmations de base\\Eclipse\\semestre2\\src\\onlineShop\\database\\booksDB.json"), Object.class);

            // afficher les informations dans la console
            System.out.println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
