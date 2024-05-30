/*package OOPS.All;

public class Lab02 {
    public static void main(String[] args) {
        Circle c1=new Circle(3.14f, 2, "Circle");
        c1.calculateArea();
        System.out.println("The area and perimeter of the circle is"+" "+c1.displayInfo());
    }
}


class Circle extends Shape{

    //Attributes
    String shapeName;
    double radius;
    double circleArea;
    float pi;
    double circlePerimeter;

    //Default Constructor
    Circle()
    {
        shapeName="Circle";
    }

    //Parameterized constructor
    Circle(float pi, double radius, String shapeName)
    {
        this.pi=pi;
        this.radius=radius;
        this.shapeName=shapeName;
    }

    //Method to calculate the area of the circle
    double calculateArea()
    {
        circleArea=pi*radius*radius;
        return circleArea;
    }

    //Method to calculate the perimeter of the circle
    double calculatePerimeter()
    {
        circlePerimeter=2*pi*radius;
        return circlePerimeter;
    }

    //Method to display the name, perimeter and area of the shape
    void displayInfo()
    {
        System.out.println("The name of the shape is"+" "+this.shapeName);
        System.out.println("The area of Circle is"+" "+circleArea);
        System.out.println("The perimeter of Circle is"+" "+circlePerimeter);
        return;
    }

}

/*class Rectangle extends Shape{
    //Attributes
    double width;
    double length;
    double rectangleArea;
    double rectanglePerimeter;

    //Default constructor
   /* Rectangle()
    {

    }

    //Parameterized constructor
    Rectangle(double length, double width)
    {
        this.length=length;
        this.width=width;
    }

    //Method to calculate the area of the rectangle
    double calculateArea()
    {
        rectangleArea=length*width;
    }

    //Method to calculate the perimeter of the rectangle
    double calculatePerimeter()
    {
        rectanglePerimeter=2(length+width);
    }

    void displayInfo()
    {
        System.out.println("The name of the shape is"+" "+this.shapeName);

    }

}
abstract class Shape
{
    //Attributes
    String shapeName;

    //Abstract Methods
    abstract double calculateArea();
    abstract double calculatePerimeter();

    //Method to display the name, perimeter and area of the shape
 /*   void displayInfo()
    {
        System.out.println();
    }*/

