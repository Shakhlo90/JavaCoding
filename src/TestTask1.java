import ClassProject2.Circle;
import ClassProject2.Shape;
import ClassProject2.Square;

public class TestTask1 {
    public static void main(String[] args) {
        Circle c= new Circle(5);
        c.calculateArea();
        c.calculatePerimeter();
        Square sq= new Square(6,8);
        sq.calculateArea();
        sq.calculatePerimeter();
        System.out.println("-------------------------------------------------------------");
        Shape[] arr={new Circle(5),new Square(6,8)};

        for (Shape arr1:arr){
            arr1.calculateArea();
            arr1.calculatePerimeter();
        }

    }
}
