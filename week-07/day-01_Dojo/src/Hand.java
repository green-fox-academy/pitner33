import java.util.*;
import java.util.stream.Collectors;

public class Hand {
    public List<Card> hand = new ArrayList<>();

    public Hand(List<Card> hand) {
        this.hand = hand;
    }

    public List<Card> getHand() {
        return hand;
    }

    public String highestCard() {
        int max = hand.stream().mapToInt(v -> v.getValue())
                .max().orElseThrow(NoSuchElementException::new);

        if (max == 14) {
            return "A";
        } else if (max == 13) {
            return "K";
        } else if (max == 12) {
            return "Q";
        } else if (max == 11) {
                return "J";
        } else return Integer.toString(max);

    }
}
