
abstract class Shape {
  
    public abstract double area();
}


class Triangle extends Shape {
    private double base;
    private double height;

   
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

  
    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

 
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    @Override
    public double area() {
        return length * width;
    }
}


class Circle extends Shape {
    private double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }

  
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        
        Triangle triangle = new Triangle(5, 8);
        Rectangle rectangle = new Rectangle(4, 6);
        Circle circle = new Circle(3);

     
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}
