package e11PetrolStation;
/*Station
        gasAmount
        refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount*/
public class Station {
    int gasAmountStation;


    public void refill(Station station, Car car) {
        car.capacity--;
        car.gasAmountcar++;
        station.gasAmountStation--;
    }
}
