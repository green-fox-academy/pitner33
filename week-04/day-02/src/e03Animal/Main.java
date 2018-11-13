package e03Animal;

public class Main {
    public static void main(String[] args) {
        Animal tiger = new Animal();

        for (int i = 0; i < 5; i++) {
            tiger.eat();
        }
        System.out.println(tiger.hunger);
    }
}
