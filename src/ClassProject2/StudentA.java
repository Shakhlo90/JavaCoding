package ClassProject2;

public class StudentA implements Mark {
    double sub1;
    double sub2;
    double sub3;
    StudentA(double sub1, double sub2, double sub3) {
        this.sub1=sub1;
        this. sub2=sub2;
        this.sub3=sub3;
    }


    public void getPercentage () {
        double average = (sub1 + sub2 + sub3)/4;


        System.out.println("StudentA: the avarage is  " + average);
    }
}