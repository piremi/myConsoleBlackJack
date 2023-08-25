import java.util.ArrayList;

public class Deck {
    private ArrayList <Card> deck;
    public Deck(){
        deck = new ArrayList<>();
    }
    public Deck(boolean i){
        if(i){
            for(Suit suit: Suit.values()){
                for(Rank rank: Rank.values()){
                    deck.add(new Card(suit, rank));
                }
            }
        }
    }
    public void addCard(Card card){
        deck.add(card);
    }
    public String toString(){
        String output = "";
        for(Card card: deck){
            output +=  card + "\n";
        }
        return output;
    }



}
