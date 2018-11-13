package e07FleetOfThings;

public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    Thing one = new Thing("Get milk");
    fleet.add(one);

    Thing two = new Thing("Remove the obstacles");
    fleet.add(two);

    Thing three = new Thing("Stand up");
    three.complete();
    fleet.add(three);

    Thing four = new Thing("Eat lunch");
    four.complete();
    fleet.add(four);
    
    System.out.println(fleet);
  }
}
