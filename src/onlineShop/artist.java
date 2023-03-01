package onlineShop;

import java.time.LocalDate;

public class artist {
    public String firstName; //min 3 characters
    public String lastName; // min 2 characters

    LocalDate dateBirthday = LocalDate.of(1998, 10, 2);
    public String biography;

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public LocalDate getDateBirthday(){return dateBirthday;}
    public String getBiography(){return biography;}




    }

