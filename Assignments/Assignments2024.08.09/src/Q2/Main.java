package Q2;

public class Main {
    public static void main(String[] args){
        Shape mySquare = new Square(10);
        Shape myCircle = new Circle(5);

        System.out.println("Square area is: " + mySquare.area());
        System.out.println("Circle area is: " + myCircle.area());
    }
    
}
