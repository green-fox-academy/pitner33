import javax.lang.model.element.NestingKind;

public class Card {
    private String color;
    private int valueInt;

    public Card(String value, String color) {
        this.color = color;
        this.valueInt = valueToInt(value);
    }

    public int getValue() {
        return valueInt;
    }

    public String getColor() {
        return color;
    }

    public int valueToInt(String value) {
        if (value.equals("A")) {
            valueInt = 14;
        } else if (value.equals("K")) {
            valueInt = 13;
        } else if (value.equals("Q")) {
            valueInt = 12;
        } else if (value.equals("J")) {
            valueInt = 11;
        } else valueInt = Integer.parseInt(value);
        return valueInt;

    }
}
