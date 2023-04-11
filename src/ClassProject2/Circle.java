package ClassProject2;

public class Circle implements Shape{


  public double radius;

   public Circle(double radius){
       this.radius=radius;
 }
 public void calculateArea(){
     double circleArea=radius*radius*Math.PI;
     System.out.println("The area of the circle is :"+circleArea);
    }


   public  void calculatePerimeter(){
       double P=2*Math.PI*radius;
       System.out.println("Perimeter of circle :"+ P);
    }

}/*
    Create an Interface 'Shape' with undefined
        methods as calculateArea and
        calculatePerimiter. Create 2 classes Circle &
        Square that implements functionality defined in
        the Shape Interface. Test your code.
        From zorah to Everyone 06:35 PM
        Task1
        methods as calculateArea and
        calculatePerimiter. Create 2 classes Circle &
        Square that implements functionality defined in
        the Shape Interface. Test your code.
        */
/*public static void main(String[] args) {
        Shape[] math={new circle(5,6,7),
        new square(3)};
        for (Shape math2:math){
        math2.calculateArea();
        math2.CalculateP();
        }
        }

        }
        }
        }*/
/*public class question1 {
interface Shape{
    void calculateArea();
    void CalculateP();
 }

 class circle implements Shape{
    double l;
    double w;
    double r;
    circle ( double l,double w, double r){
        this.l=l;
        this.w=w;
        this.r=r;
    }

     @Override
class square implements Shape{
    int l;
    square(int l){
        this.l=l;
    }

     @Override
     public void calculateArea() {
         System.out.println("the area of square "+(l*2));
     }

     @Override
     public void CalculateP() {
         System.out.println("the perimeter of square "+(l*4));

     }
 }
*/


