package e11PetrolStation;

public class Main {
    public static void main(String[] args) {
        Car tesla = new Car();
        Station shell = new Station();

        shell.gasAmountStation = 1000;

        System.out.println("Before... ");
        System.out.println(tesla.capacity);
        System.out.println(tesla.gasAmountcar);
        System.out.println(shell.gasAmountStation);

        for (int i = 0; i < tesla.capacity; i++) {
            shell.refill(shell, tesla);

        }
        System.out.println("After... ");
        System.out.println(tesla.capacity);
        System.out.println(tesla.gasAmountcar);
        System.out.println(shell.gasAmountStation);

    }
}
