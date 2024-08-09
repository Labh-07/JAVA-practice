public class DriverOfCar_f {

    static int minAgeOfDriving=18;

    public static void main(String[] args) {
        Car_f BMW=new Car_f();
        Car_f Swift=new Car_f("White");

        System.out.println(BMW.color);
        System.out.println(Swift.color);
    }
}
