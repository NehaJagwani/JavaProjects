package OOPS.All;
import java.util.Scanner;

import java.time.Year;

public class Lab07 {
    public static void main(String[] args) {
        Car c1=new Car();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the make of the Car: ");
        String make=sc.next();
        c1.setMake(make);
        System.out.println();

        System.out.print("Enter the model of the Car: ");
        String model=sc.next();
        c1.setModel(model);
        System.out.println();

        System.out.print("Enter the manufacturing year: ");
        try {
            int year = sc.nextInt();
            c1.setYear(year);
        }
        catch(YearException e)
        {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println();

        System.out.print("Enter the number of seats in the car: ");
        int numberOfSeats=sc.nextInt();
        c1.setNumberOfSeats(numberOfSeats);

        c1.displayInfo();
        System.out.println();

/*Truck t1=new Truck();
        t1.setMake("Proton");
        t1.setModel("Persona");
        t1.setYear(2004);
        t1.setMaxPayload(3400);
        t1.displayInfo();*/
    }
}


class Truck extends Vehicle
{
    //Attributes
    private double maxPayload;

    //Default constructor
    Truck(){}

    //Parameterized constructor
    Truck(String make, String model, int year, double maxPayload)
    {
        super(make, model, year);
        this.maxPayload=maxPayload;
    }

    //Getter Setter methods
    void setMaxPayload(double maxPayload)
    {
        this.maxPayload=maxPayload;
    }

    double getMaxPayload()
    {
        return maxPayload;
    }

    void displayInfo()
    {
        System.out.println("The details of the Truck is: ");
        System.out.println("The make of the Car is"+" "+super.getMake());
        System.out.println("The model of the Car is"+" "+super.getModel());
        System.out.println("The manufacturing year is"+" "+super.getYear());
        System.out.println("The number of seats in the Car are"+" "+this.getMaxPayload());
    }


}
class Car extends Vehicle
{
    //Attributes
    private int numberOfSeats;

    //Default constructor
    Car() { }

    //Parameterized constructor
    Car(String make, String model, int year, int numberOfSeats)
    {
        super(make, model, year);
        this.numberOfSeats=numberOfSeats;
    }

    //Getter Setter method
    void setNumberOfSeats(int numberOfSeats)
    {
        this.numberOfSeats=numberOfSeats;
    }

    int getNumberOfSeats()
    {
        return numberOfSeats;
    }

    void displayInfo()
    {
        System.out.println("The details of the Car is: ");
        System.out.println("The make of the Car is"+" "+super.getMake());
        System.out.println("The model of the Car is"+" "+super.getModel());
        System.out.println("The manufacturing year is"+" "+super.getYear());
        System.out.println("The number of seats in the Car are"+" "+this.getNumberOfSeats());
    }

}


abstract class Vehicle
{
    //Attributes

    private String make; //represents the make of the vehicle
    private String model; //represents the model of the vehicle
    private int year; //represents the manufacturing year of the vehicle


    //Default constructor
    Vehicle() { }

    //Parameterized constructor
    Vehicle(String make, String model, int year)
    {
        this.make=make;
        this.model=model;
        this.year=year;
    }

    //Getter Setter methods
    void setMake(String make)
    {
        this.make=make;
    }

    String getMake()
    {
        return make;
    }

    void setModel(String model)
    {
        this.model=model;
    }

    String getModel()
    {
        return model;
    }

    void setYear(int year)
    {
        int length=String.valueOf(year).length();
        if(length!=4)
        {
            throw new YearException();
        }
        this.year=year;
    }

    int getYear()
    {
        return year;
    }

    abstract void displayInfo();
}

class YearException extends RuntimeException
{
    YearException()
    {
        super("Sorry, the year needs to be less than 2030");
    }
}