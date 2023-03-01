package onlineShop;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {


        artist artist = new artist();
        products products = new products();
        book book = new book();
        DVD dvd = new DVD();

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
