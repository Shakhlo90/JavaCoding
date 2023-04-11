package ClassProject2;

public  class Car {
    double carPrice;
    String color;
    int a;
    void calculateSalePrice(){
        System.out.println(carPrice);}
        Car(double carPrice, String color){
            this.carPrice=carPrice;
            this.color=color;

            Car(double carPrice, String color,int a){
                this.carPrice=carPrice;
                this.color=color;
                  this.a=a;

            }
    }


class Truck extends Car {
    double weight;
   Truck(double carPrice, String color, double weight){
       super(carPrice,color);
       this.weight=weight;}
       void calculateSalePrice(){
       int dis2=100-20;
       int dis1=100-10;
           if (weight>2000){
               double totalPrice= (dis1*carPrice)/100;

               System.out.println("Truck price is "+totalPrice+" with discount 10%");}
               else if(weight<2000){
                   double totalPrice2=(dis2*carPrice)/100;
               System.out.println("Truck price is "+totalPrice2+" with discount 20%");
           }

           }
       }


class Sedan extends Car{
       double legnth;
   Sedan(double carPrice, String color, double legnth){
       super(carPrice,color);
       this.legnth=legnth;
   }
    void calculateSalePrice(){
        int dis2=100-5;
        int dis1=100-10;
        if (legnth>20){
            double sedandis1= (dis2*carPrice)/100;
            System.out.println("Sedan price is "+sedandis1+" with discount 5%");}
        else if(legnth<20){
            double sedandis2=(dis1*carPrice)/100;
            System.out.println("Sedan price is "+sedandis2+" with discount 10%");
        }

    }
}


