public class Animals {
    private int belly;
    private int gut;

    public Animals(){
        this.belly = 0;
        this.gut = 0;
    }


    public void eat(int food) {
        this.belly += food;
    }


    public boolean isHungry() {
        return this.belly <= 0;
    }

    public int poop() {
        int poopAmount = gut;
        gut = 0;
        return poopAmount;
    }

    public void walk() {
        gut = belly;
        belly = 0;
    }

}
