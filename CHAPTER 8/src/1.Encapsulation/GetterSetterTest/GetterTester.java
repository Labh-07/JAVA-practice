package GetterSetterTest;

import GetterAndSetter.Car;

public class GetterTester {

    public static void main(String[] args) {
        Car car=new Car("red","swift",5,7);

        System.out.printf("%s %s",car.gertModel(),car.getColor());

        /*advantage to use getter :

        1 st : to control individual access
        ->to define which user have only to read and access (ex. color of car can be modified only owner but read by everyone)
         -> get and set color have diffrent method for get we give ublic and for set it is default

         */
        // car.setColor(); we can not set because it is default method

        /*
        2nd advantage :
        ->when we crete circle class then we take radius but class what to do with radius / so to getter and setter we can know what to do eith our input
        ->proparties is one only radius / but we get circunferene and area to user

        3ed advanatge :
        -> we can control the value i.e. the color set everyone expact yellow to set in method
        ->we can change criteria to input data via getter and setter method

         */
    }
}
