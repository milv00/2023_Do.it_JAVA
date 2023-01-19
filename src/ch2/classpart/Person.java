package ch2.classpart;

public class Person {
    int age;
    String name;
    boolean isMarried;
    int childNum;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isMarried=" + isMarried +
                ", childNum=" + childNum +
                '}';
    }
}
