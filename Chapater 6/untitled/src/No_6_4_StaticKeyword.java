public class No_6_4_StaticKeyword {

    static int minAgeOfDriving=18;
    int myAge=18;

    public boolean isAllowedToDrive(){
        return this.myAge >= minAgeOfDriving;  //here we can access the static and non static variable in the non static method
                                               //but we can not access non static variable into static method without creating an object
    }

    public static void main(String[] args) {
        /*
        ->If we want to fix one property/method of class for any object than in this case we use static keyword
        ->static variable = belong to the class , not individual instances , shared among all insatnces of the class
        ->static method = we can called without creating am object of the class , can only directly access static variables and other static methods
        ->interest rate of saving account is static
        ->static method is used without an object directly dot operator

        ->Ex.
        in part 1 chapter 5 we declare all the methods static in Array utilities , we can call the method by
        ArrayUtilities.methodName();
        here we can not create an object of this instead of this we directly call

        -> no access to the non-static member
        -ex.
        clas car{
        static String colour=red;
        ....
        }

        psvm(){

        car obj1..;
        car obj2..;
        car obj3..;

        Car.colour; // which color here there are many objects ;
        }
        {
        ->why we create main method to static ?
        ans. jvm can easily access without creating an object

        }

         */

        //example :

        Driver myDriver=new Driver();

        myDriver.dateOfLiecence="12";
        myDriver.name="labh";
        //here we can a ccess property via object
        //but if we try to access as following:
        //Driver.name  we can not access without objects via only class name
        //because we are in static method , and name and date Of Liecence is an instance property so we can not access non static property without object

        //static example :
        System.out.println("minimam age of driving "+minAgeOfDriving);
        //here in above class we declare static variable and we access that in another static method which is main so we can directly access that

/*
#summerize :

 -> static property is assign to class and non static is assign to object
 -> object can access both , but class can not access object variable
 ->minimum use of static because we apply oop concept successfully
 */

        /*
        we can also access the static member via class name i.e. No_6_4_StaticKeyword.minAgeOfDriving
        -here we can also access via object myDriver.minAgeOfDriving but this is not recomanded

         */
    }
}