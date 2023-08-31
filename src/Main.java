// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println (" Welcome to Jimmy's Console Black Jack!");
        Game blackjack = new Game();
        System.out.println(Suit.CLUB);
        System.out.println(Rank.ACE + " value: " + Rank.ACE.rankName);
        Card myCard = new Card(Suit.SPADE, Rank.JACK);
        System.out.println(myCard);
        Deck myDeck = new Deck();
        myDeck.addCard(myCard);
        myDeck.addCard(new Card(Suit.SPADE, Rank.KING));
        System.out.println(myDeck);
        Hand myhand = new Hand();
        Deck fullDeck = new Deck(true);
        fullDeck.shuffleDeck();
        myhand.takeCardFromDeck(fullDeck);
        myhand.takeCardFromDeck(fullDeck);
        System.out.println("myhand: "+ myhand);
        System.out.println("fullDeck: " + fullDeck);
    }
}