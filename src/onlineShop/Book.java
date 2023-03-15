package onlineShop;

public class Book extends Product {

    public Artist author;

    Book(float price, Artist author, String uuid, String title) {
        this.price = price;
        this.author = author;

        this.title=title;
        this.uuid = uuid;

    }

    public void setAuthor(Artist author) {
        this.author = author;

    }


    public Artist getauthor() {
        return author;
    }

    @Override
    public String getUuid(){return uuid;}


}
