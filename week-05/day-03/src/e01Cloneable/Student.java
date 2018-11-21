package e01Cloneable;

public class Student extends Person implements Cloneable {
    private String previousOrganisation;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganisation) {
        super(name, age, gender);
        this.previousOrganisation = previousOrganisation;
        this.skippedDays = 0;
    }

    public Student() {
        super();
        this.previousOrganisation = "The School of Life";
        this.skippedDays = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " + previousOrganisation + " who skipped " + skippedDays + " days from the course already");
    }

    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public int skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
        return skippedDays;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
