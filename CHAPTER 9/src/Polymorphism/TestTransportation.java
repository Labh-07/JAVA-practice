package Polymorphism;

public class TestTransportation {

    public static void main(String[] args) {
        Car c = new Car();
        AIrplane a = new AIrplane();

        Vehicle v = new Car(); //upcasting
        //reference is Vehicle type and Object is Car class

       // Car cvehicle=(Car) new Vehicle(); //error

    /*
    Object obj = new Vehicle(); //possible for every class(vehicle)
     */

        c.start();  //here for car start method is overriding prints car is starting ...
        a.start(); //here for airplane we comment the overriding start method so it print vehicle is starting...
    }
}
