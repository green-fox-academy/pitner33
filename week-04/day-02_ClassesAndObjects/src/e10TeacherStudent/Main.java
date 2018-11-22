package e10TeacherStudent;

public class Main {
    public static void main(String[] args) {
        Student bob = new Student();
        Teacher will = new Teacher();

        bob.learn();
        will.answer();

        will.teach(bob);

    }
}
