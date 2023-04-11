
    public interface Mark {


        void getPercentage();

    }

     class StudentA implements ClassProject2.Mark {
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

    class StudentB implements ClassProject2.Mark {
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

    class TestTask2 {
        public static void main(String[] args) {
            StudentA a= new StudentA(65, 78, 79);
            a.getPercentage();
            StudentB b= new StudentB(90,79,86,89);
            b.getPercentage();
            System.out.println("---------------------------------------------------------------------");
            ClassProject2.Mark[]task={new StudentA(76,78,86), new StudentB(89,90,90,86)};
            for(ClassProject2.Mark arr:task){
                arr.getPercentage();

            }
        }
    }