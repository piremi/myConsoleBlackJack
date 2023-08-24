public enum Rank {
    ACE("ACE", 11),
    TWO("TWO", 2),
    THREE("THREE", 3),
    FOUR("FOUR", 4),
    FIVE("FIVE", 5),
    SIX("SIX", 6),
    SEVEN("SEVEN", 7),
    EIGHT("EIGHT", 8),
    NINE("NINE", 9),
    TEN("TEN", 10),
    JACK("JACK", 10),
    QUEEN("QUEEN", 10),
    KING("KING", 10);
    String rankName;
    int rankValue;
    Rank(String rankName, int rankValue){
        this.rankName = rankName;
        this.rankValue = rankValue;
    }
    public String toString(){
        return rankName;
    }
}
