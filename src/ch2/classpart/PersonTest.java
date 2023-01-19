package ch2.classpart;

public class PersonTest {
    public static void main(String []args){
        Person p1 = new Person();
        p1.age = 40;
        p1.name = "홍길동";
        p1.isMarried = false;
        p1.childNum = 3;

        System.out.println(p1.toString());
    }
}
