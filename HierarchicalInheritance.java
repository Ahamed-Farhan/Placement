import java.util.*;
 abstract class Shape {
    double area;
     abstract void calculatearea();
}

class Circle extends Shape {
    double r;

    Circle() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r = scn.nextDouble();
    }

    public void calculatearea() {
        area = 3.14 * r * r;
        System.out.println("Area of Circle is: " + area);
    }
}

class Square extends Shape {
    double a;

    Square() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter side length: ");
        a = scn.nextDouble();
    }

    public void calculatearea() {
        area = a * a;
        System.out.println("Area of Square is: " + area);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape s = new Square();

        c.calculatearea();
        s.calculatearea();
    }
}
