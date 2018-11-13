package e10TeacherStudent;
/*
Student
        learn()
        question(teacher) -> calls the teachers answer method
*/
public class Student {

    public void learn() {
        System.out.println("Learning");
    }
    public void  question(Teacher teacher) {
        teacher.answer();
    }
}
