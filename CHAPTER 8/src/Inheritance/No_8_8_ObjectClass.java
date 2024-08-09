package Inheritance;

public class No_8_8_ObjectClass extends MotorCycle{

    public static void main(String[] args) {

        No_8_8_ObjectClass obj = new No_8_8_ObjectClass();

        /*
        object class is parent of all classes
        -it is also known as adam
        -in multilevel inheritance object class extends root parent class and another level get those classes from the root

         */
        System.out.println(obj.getClass());//get class name
        System.out.println(obj.toString()); //parent class get we can modify this by change to string
        System.out.println(obj.hashCode());
        //many function are there in object class see notes
    }
}
