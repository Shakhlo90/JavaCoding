package ClassProject2;

public class StudentB implements Mark {
    double sub1;
    double sub2;
    double sub3;
    double sub4;
    StudentB(double sub1, double sub2, double sub3, double sub4) {

        this.sub1=sub1;
        this. sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;

    }


    public void getPercentage () {
        double average = (sub1 + sub2 + sub3+sub4)/4;


        System.out.println("StudentB: the avarage is  " + average);
    }
}