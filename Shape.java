package Day2;


abstract class Shapee {

 abstract double calculateArea();

}

class Circle extends Shapee {
 double radius;

 Circle(double r) {
     radius = r;
 }

 double calculateArea() {
     return 3.14 * radius * radius;
 }
}


class Rectangle extends Shapee {
 double length;
 double width;

 Rectangle(double l, double w) {
     length = l;
     width = w;
 }

 double calculateArea() {
     return length * width;
 }
}


class Triangle extends Shapee {
 double base;
 double height;

 Triangle(double b, double h) {
     base = b;
     height = h;
 }

 double calculateArea() {
     return 0.5 * base * height;
 }
}


public class Shape{
 public static void main(String[] args) {

     
     Circle c = new Circle(5);
     Rectangle r = new Rectangle(10, 4);
     Triangle t = new Triangle(6, 8);

     
     Shapee s;

     s = c;
     System.out.println("Area of Circle: " + s.calculateArea());

     s = r;
     System.out.println("Area of Rectangle: " + s.calculateArea());

     s = t;
     System.out.println("Area of Triangle: " + s.calculateArea());
 }
}
