package onlineShop;

import java.time.LocalDate;

public class Artist {


    public Artist(String firstName, String lastName, LocalDate dateBirthday, String biography) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateBirthday = dateBirthday;
        this.biography = biography;
    }

    private String firstName;
    private String lastName;

    private LocalDate dateBirthday;
    private String biography;



    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public LocalDate getDateBirthday(){return dateBirthday;}
    public String getBiography(){return biography;}


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
    public void setDateBirthday(LocalDate dateBirthday) {
        this.dateBirthday = dateBirthday;
    }


}

