package ch2.hiding;
//private 사용 시 -> getter/setter 사용
public class StudentTest {
    public static void main(String[]  args){
        ch2.hiding.Student student1  = new ch2.hiding.Student();
//        student1.studentName = "박민규";
        student1.setStudentName("박민규");
        ch2.hiding.Student student2 = new Student();
//        student2.studentName  = "정유나";
        student2.setStudentName("정유나");

//        System.out.println(student1.studentName);
        System.out.println(student1.getStudentName());
        System.out.println(student2.getStudentName());
    }
}
