package ch2.thisex;

public class BirthDay {
    int day;
    int month;
    int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void printThis(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "BirthDay{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public class ThisExample{
        public static void main(String []args){
            BirthDay bday = new BirthDay();
            bday.setDay(22);
            bday.setMonth(01);
            bday.setYear(2023);
            bday.printThis();

            System.out.println(bday.toString());

        }

    }
}
