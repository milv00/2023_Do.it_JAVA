package ch2.thisex;

public class BirthDay {
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
    }
    public void printThis(){
        System.out.println(this);
    }

    public class ThisExample{
        public static void main(String []args){
            BirthDay bday = new BirthDay();
            bday.setYear(2023);
            bday.printThis();

        }

    }
}
