package AccessModifier2;

import AccessModifier.Car;

public class DefaultTestOfCar {

    public static void main(String[] args) {
        Car car = new Car("Black","BMW",8,70000,8);

        car.model="Swift";//we can access public
        car.color="black";
        //car.lifeOfEngine; we can not access default properties in another class

    }
}
