package e16TreeHomework;

public class Main {
    public static void main(String[] args) {
        Tree pine = new Tree("Pine", "green", 50, "uni");
        Tree oak = new Tree("Oak", "green", 150, "uni");
        Tree cedar = new Tree("Cedar", "green", 40, "uni");
        Tree willow = new Tree("Cedar", "green", 67, "uni");
        Tree spruce = new Tree("Spruce", "green", 15, "uni");

        Forest mixedForest = new Forest();
        mixedForest.forest.add(pine);
        mixedForest.forest.add(oak);
        mixedForest.forest.add(cedar);
        mixedForest.forest.add(willow);
        mixedForest.forest.add(spruce);
    }
}
