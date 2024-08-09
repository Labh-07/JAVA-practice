package AccessModifier;

public class AccessTest {

    public static void main(String[] args) {
        Car car=new Car();
        car.color="Red";
        car.model="bmw";
        //car.costOfCar=23423432; we can not access this because it is private

        Car BMW = new Car("BLACK","BMW",1,5000,8);
        System.out.println(car);
        System.out.println(BMW);
        //here all show becuase constructor and tostring is in class so it can access private proparties

        BMW.engineAge=7;//we can access default in same package

     //same rules for class and methods / class can be default or public only
        //method constructor variable we can use all modifiers

    }
}
