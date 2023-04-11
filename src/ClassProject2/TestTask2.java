package ClassProject2;

/*public class TestTask2 {
    public static void main(String[] args) {
        StudentA a= new StudentA(65, 78, 79);
        a.getPercentage();
       StudentB b= new StudentB(90,79,86,89);
b.getPercentage();
        System.out.println("---------------------------------------------------------------------");
Mark[]task={new StudentA(76,78,86), new StudentB(89,90,90,86)};
for(Mark arr:task){
    arr.getPercentage();

}
    }
}
/*public class question2 {
    /*
     We have to calculate the average of marks obtained in three subjects by student A and by student B.
     Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average
      percentage of marks. Provide implementation of abstract method in classes 'A' and 'B'.
      The constructor of student A takes the marks in three subjects as its parameters and the marks
      in four subjects as its parameters for student B. Test your code
    */
/*public static void main(String[] args) {
    Marks[] tasks={ new studentA(70,76,78),
            new studentB(70,76,78,89)};
    for (Marks task:tasks){
        System.out.println("average % "+ task.getPercentage());
    }
}
}
abstract class Marks {
    abstract double getPercentage();

}

class studentA extends Marks{
    double subject1;
    double subject2;
    double subject3;
    studentA(double subject1,double subject2, double subject3){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;

    }

    @Override
    double getPercentage() {
        return (subject1+subject2+subject3)/3;
    }
}
class studentB extends Marks{
    double subject1;
    double subject2;
    double subject3;
    double subject4;
    studentB(double subject1,double subject2, double subject3,double subject4){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
        this.subject4=subject4;
    }

    @Override
    double getPercentage() {
        return (subject1+subject2+subject3+subject4)/4;
    }
}
*/

/*Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own implementation of calculateSalePrice() method in which returned price is calculated as following: if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
From zorah to Everyone 07:18 PM
public static void main(String[] args) {
        Car[] cars={new Sedan(30000,25),
                new Truck(50000,2000)
        };
        for (Car car:cars){
            System.out.println("the actual price "+car.carPrice+", the discounted price is "+car.calculateSalePrice());
        }
    }
class Car{
    double carPrice;
    String color;
    Car (double carPrice){
        this.carPrice=carPrice;
    }
    double calculateSalePrice(){
        return 0;
    }
}
 class Sedan extends Car{
    int l;
    Sedan( double carPrice,int l){
        super(carPrice);
        this.l=l;
    }
     double calculateSalePrice(){
        if(l>20){
            return (carPrice-(carPrice*5/100));
        } else{
            return (carPrice-(carPrice*10/100));
     }
}
}
}
public class question4 {
    /*
    Provide Implementation for the diagram below. Then create a test class in which you
     need to create Objects of ChromeDriver, FirefoxDrive and SafariDriver classes
     and see which methods available to them.
    */
/*public static void main(String[] args) {
        remoteWebDriver [] webDriver={ new ChromeDriver(),new FirefoxDrive(), new SafariDriver()};

        for (remoteWebDriver driver:webDriver){
        driver.open();
        driver.close();
        System.out.println(driver.getTitle());
        driver.navigate();
        //driver.getScreenShot();
        System.out.println();

        }

        }
        }

        interface WebDriver{
        void open();
        void close();
        String getTitle();
        }

        interface remoteWebDriver extends WebDriver{
        void navigate();
        }

        interface takeScreenShot extends WebDriver{
        void getScreenShot();
        }

        class ChromeDriver implements remoteWebDriver, takeScreenShot{

        @Override
        public void open() {
        System.out.println("opening the chrome browser");
        }

        @Override
        public void close() {
        System.out.println("closing the chrome browser");
        }

        @Override
        public String getTitle() {
        return "getting title from the Chrome browser";
        }

        @Override
        public void navigate() {
        System.out.println("navigate to URL from Chrome browser");

        }

        @Override
        public void getScreenShot() {
        System.out.println("taking screenshots from Chrome");
        }
        }
