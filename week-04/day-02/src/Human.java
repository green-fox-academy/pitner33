public class Human {
    private int iq; //no acces to this from the outside, but I will give a public method for it
    public static boolean alive = true;

    public Human(int iq) {
        this.iq = iq;
    }
    public  boolean isSmart() {
        return iq > 50;
    }
  //  @Override
 /*   public String toString {
        return "Human" // and stg els was here
    }*/
}
