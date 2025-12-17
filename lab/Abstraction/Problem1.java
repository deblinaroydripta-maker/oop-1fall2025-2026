

abstract class Shape{
abstract void CalculateArea();
void displayShape(){
System.out.println("this is shape");
}
}

class Rectangle extends Shape{
double lenght;
double width;
        
Rectangle(double lenght, double width) {
this.lenght = lenght;
this.width = width; 
}

@Override
void CalculateArea(){
double area = lenght*width;
System.out.println("Rectanglen Area");
}
        
}

class Circle extends Shape{
double radius;
double pi = 3.1416;
public Circle(double redius) {
this.radius = redius;
}

@Override
void CalculateArea(){
double area = pi*radius*radius;
System.out.println("Circle Area:" + area);
}
}
public class Problem1 {
public static void main(String[] args) {
Shape rectangle = new Rectangle(10,20);
Shape circle = new Circle(9);

rectangle.displayShape();
rectangle.CalculateArea();
circle.displayShape();
circle.CalculateArea();
}
}

