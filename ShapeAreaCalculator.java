
import java.util.*;

abstract class Shape {

    abstract double calculateArea();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {

        this.radius = radius;
    }

    double calculateArea() {

        return Math.PI * radius *radius;
    }
}

class Rectangle extends Shape {

    double length, width;

    Rectangle(double length, double width) {

        this.length = length;
        this.width = width;
    }

  double calculateArea() {

    return length * width;
  }
        
    }

    class Tringle extends Shape {

        double base,hieght;

        Tringle(double base, double hieght) {

            this.base = base;
            this.hieght = hieght;
        }

        double calculateArea() {

            return 0.5 * base *hieght;

            
        }
    }

public class ShapeAreaCalculator {
    
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println(" Chose Shape: 1.Circle 2.Rectangle 3.Tringle");

    int choise = sc.nextInt();

    Shape shape = null;

    switch (choise) {

        case 1:
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        shape = new Circle(r);
        break;

        case 2:
        System.out.print("Enter length:");
        double l = sc.nextDouble();
        System.out.print("Enetr width: ");
        double w = sc.nextDouble();

        shape = new Rectangle(l, w);

        break;

        case 3:
        System.out.print("Enter base: ");
        double b = sc.nextDouble();

        System.out.print("Enter height");

        double h = sc.nextDouble();
        shape = new Tringle(b, h);

        break;

        default:
        System.out.println("invalid Choise!");
        System.exit(0);

    }

    System.out.println("Area = " + shape.calculateArea());

    sc.close();
}

    

}
