package e15Pirates;
/*Create a Pirate class.
        While you can add other fields and methods, you must have these methods:-
        drinkSomeRum() - intoxicates the Pirate some
        howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
        0 to 4 times, "Pour me anudder!"
        else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.

        If you manage to get this far, then you can try to do the following.

        die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
        brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies,
        the other dies or they both pass out.

        And... if you get that far...

        Add a parrot.*/
public class Pirate {
    String name;
    boolean hasParrot;
    int drunkLevel;
    boolean alive;
    boolean sleep;

    public Pirate(String name, boolean hasParrot) {
        this.name = name;
        this.hasParrot = hasParrot;
        this.drunkLevel = 0;
        this.alive = true;
        this.sleep = false;
    }
    public Pirate(String name, boolean hasParrot, int drunkLevel, boolean sleep) {
        this.name = name;
        this.hasParrot = hasParrot;
        this.drunkLevel = drunkLevel;
        this.alive = true;
        this.sleep = sleep;
    }

    public void drinkSomeRum() {
        if (alive) {
            if (!sleep) {
                drunkLevel++;
            } else System.out.println(name + " is so drunk, that has just passed out.");
        } else System.out.println(name + " has already drank himself/herself to death.");
    }

    public void howIsItGoingMate() {
        if (alive) {
            if ((!sleep) && (drunkLevel < 5)){
                    System.out.println("Pour me anudder!");
                } else if ((!sleep) && (drunkLevel <= 5)) {
                    System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                    sleep = true;
            } else System.out.println(name + " is so drunk, that has just passed out.");
        } else System.out.println(name + " cannot answer, 'cause he/she is dead.");
    }
    public void die() {
        alive = false;
    }

    public void brawl(Pirate anotherPirate){
        if (alive) {
            if (anotherPirate.alive) {
                int random = (int)(Math.random() * (100 + 1));
                if (random < 33) {
                    die();
                    System.out.println(name + " lost. He/she cannot fight anymore, 'cause he/she is dead.");
                } else if ((random >= 33) && (random <= 66)) {
                    anotherPirate.die();
                    System.out.println(name + " has won. The other scum has just died");
                } else {
                    sleep = true;
                    anotherPirate.sleep = true;
                    System.out.println("Both of them has passed out");
                }

            } else System.out.println("Fight vs. a dead man? Are you THAT drunk? Or just a pervert?");
        } else System.out.println(name + " cannot fight, 'cause he/she is dead.");

    }

}

