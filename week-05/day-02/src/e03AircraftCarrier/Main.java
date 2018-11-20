package e03AircraftCarrier;

public class Main {
    public static void main(String[] args) {
        Aircraft f16 = new F16();

        System.out.println(f16.refill(300));

        f16.getType();

        System.out.println(f16.getStatus());

        System.out.println(f16.isPriority());

        Carrier good = new Carrier("good",2800, 3000);
        Carrier evil = new Carrier("evil",3800, 2500);

        good.addAircraft(new F16());
        good.addAircraft(new F16());
        good.addAircraft(new F35());
        good.addAircraft(new F35());

        evil.addAircraft(new F16());
        evil.addAircraft(new F16());
        evil.addAircraft(new F16());
        evil.addAircraft(new F16());
        evil.addAircraft(new F16());

        System.out.println(good.getStatusCarrier(good));
        System.out.println("");
        System.out.println(evil.getStatusCarrier(evil));

        good.fill();
        evil.fill();

        System.out.println(good.getStatusCarrier(good));
        System.out.println("");
        System.out.println(evil.getStatusCarrier(evil));

//        evil.fight(good);
//        good.fight(evil);
//        good.fight(evil);
//
//        System.out.println(good.getStatusCarrier(good));
//        System.out.println("");
//        System.out.println(evil.getStatusCarrier(evil));

        while ((!good.isDead()) && (!evil.isDead())) {
            evil.fight(good);
            good.fight(evil);
        }
        System.out.println("_______________________________________________________________________");
        System.out.println(good.getStatusCarrier(good));
        System.out.println("");
        System.out.println(evil.getStatusCarrier(evil));

    }
}
