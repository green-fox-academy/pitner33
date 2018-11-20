package e02TheGardenApplication;
//The Flower
//        needs water if its current water amount is less then 5
//        when watering it the flower can only absorb the 75% of the water
//        eg. watering with 10 the flower's amount of water should only increase with 7.5
public class Flower extends Plant {


    public Flower(String color) {
        super(color, "flower", 5, 0.75);

    }


    public void watering(double water) {
        setWaterAmount(0.75 * water);
    }


}
