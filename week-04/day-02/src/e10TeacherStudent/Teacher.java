package e10TeacherStudent;
/*Teacher
        teach(student) -> calls the students learn method
        answer()*/
public class Teacher {


    public void answer() {
        System.out.println("Answering");
    }

    public void teach(Student student) {
        student.learn();
    }
}
