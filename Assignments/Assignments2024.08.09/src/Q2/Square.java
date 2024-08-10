package Q2;

public class Square extends Shape{
    double side;

    Square(double side){
        this.side = side;
    }

    double area(){
        return side * side;
    }
    
}
