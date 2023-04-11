package ClassProject2;


  public   class Square implements Shape{
      double lenght;
      double width;

         public Square(double lenght, double width){
            this.lenght=lenght;
            this.width=width;

        }
        public  void calculateArea(){

            System.out.println("The area of the Square is :"+ lenght*width);
        }
        public    void calculatePerimeter(){
            double sp;
            sp = 2*(width*lenght);
            System.out.println("Perimeter of Square is : "+ sp );
        }

    }

