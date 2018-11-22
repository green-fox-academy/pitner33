package e13Farm;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal();
        Animal a4 = new Animal();

        Farm animalsOnFarm = new Farm();
        animalsOnFarm.animalList.add(a1);
        animalsOnFarm.animalList.add(a2);
        animalsOnFarm.animalList.add(a3);
        animalsOnFarm.animalList.add(a4);

        System.out.println(animalsOnFarm.animalList.toString());
        animalsOnFarm.breed();
        System.out.println(animalsOnFarm.animalList.toString());

        a2.eat();

        System.out.println(animalsOnFarm.animalList.toString());
        animalsOnFarm.slaughter();
        System.out.println(animalsOnFarm.animalList.toString());


    }
}
