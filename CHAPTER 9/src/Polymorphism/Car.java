package Polymorphism;

public class Car extends Vehicle{

    private int numberOfTyres=super.getNumberOfTyres();

    public static void main(String[] args) {

        Car c = new Car();

        System.out.println(c.numberOfTyres);
    }

    @Override
    public void start(){
        System.out.println("car is starting ....");
    }
}
