//Hierarchical Inheritance

package Classes;

public class Lab01 {
    public static void main(String[] args) {
      Car c1 = new Car();
      Car c2=new Car(c1.vehicleID, c1.numberOfSeats);
      c2.displayDetails();
      Motorcycle m1=new Motorcycle();
      Motorcycle m2=new Motorcycle(c1.vehicleID, m1.hasSideCar);
      m2.displayDetails();
    }
}

class Motorcycle extends Vehicle
{
    //Attributes
    boolean hasSideCar=false;

    //Default constructor
    Motorcycle()
    {
        hasSideCar=true;
    }
    //Parameterized constructor
    Motorcycle(String vehicleID, boolean hasSideCar)
    {
        this.vehicleID=vehicleID;
        this.hasSideCar=hasSideCar;
    }

    //Methods
    void displayDetails()
    {
        System.out.println("Motorcyle has sidecars"+" "+this.hasSideCar);
    }

}
class Car extends Vehicle
{
    //Attributes
    int numberOfSeats;

    //Default constructor
    Car()
    {
        super();
        numberOfSeats=5;
    }

    //Parameterized constructor
    Car(String vehicleID, int numberOfSeats)
    {
        super(vehicleID);
        this.numberOfSeats=numberOfSeats;
    }

    //Methods
    void displayDetails()
    {
        super.displayDetails();
        System.out.println("Number of seats are"+" "+this.numberOfSeats);
    }
}

class Vehicle
{
    //Attributes
    String vehicleID;

    //Default constructor
    Vehicle()
    {
        vehicleID="VCH 9276";
    }

    //Parameterized constructor
    Vehicle(String vehicleID)
    {
        this.vehicleID=vehicleID;
    }

    //Methods
    void displayDetails()
    {
        System.out.println("The vehicleID is"+" "+this.vehicleID);
    }
}
