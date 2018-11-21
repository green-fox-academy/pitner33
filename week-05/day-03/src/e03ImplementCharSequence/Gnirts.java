package e03ImplementCharSequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
    String text;

    public Gnirts(String text) {
        this.text = text;
    }



    @Override
    public int length() {
        return text.length();
    }

    @Override
    public char charAt(int index) {
        return text.charAt(text.length() - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }
}
