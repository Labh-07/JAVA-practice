package Polymorphism;

public class Vehicle {

    private int numberOfTyres;

    public int getNumberOfTyres(){
        return numberOfTyres;
    }

    Vehicle (){
        this.numberOfTyres=0;
    }

    Vehicle(int noOfTyres){
        this.numberOfTyres=noOfTyres;
    }

    public void start(){
        System.out.println("vehicle is starting ...");
    }

}
