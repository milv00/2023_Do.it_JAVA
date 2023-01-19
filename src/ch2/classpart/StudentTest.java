package ch2.classpart;

public class StudentTest {
    public static void main(String[]  args){
        Student student1  = new Student();
        student1.studentName = "박민규";
        Student student2 = new Student();
        student2.studentName  = "정유나";

        System.out.println(student1.studentName);
        System.out.println(student1.getStudentName());
        System.out.println(student1);
        System.out.println(student2);

    }
}
