public class card {
    private final String rank; // the value of the card (2, 3, 4, ..., 10, J, Q, K, A)
    public String suit; // the suit of the card (Heart, Spade, Club, Diamond)

    String getRank() {
        return this.rank;


    }

    public card(String rankTemp, String suitTemp){
        this.rank = rankTemp;
        this.suit = suitTemp;
    }
}
