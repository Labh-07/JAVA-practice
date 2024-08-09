package Inheritance.Challange_8_81;

public class EqualityCheck{

    public static void main(String[] args) {
        Person p1 = new Person("labh",19);
        Person p2 = new Person("labh",19);

     /*   if(p1==p2){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        O/p :not equal because it compares the refrances of the object
      */
        /*
        if(p1.equals(p2)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        O/p : here also answer is not equal
        -> because qual class is already build in object class
        -> this build in class comapre refrances i.e locations
        ->for comapre the data we make our own equal class
         */

        System.out.println(p1.equals(p2));
    }
}
