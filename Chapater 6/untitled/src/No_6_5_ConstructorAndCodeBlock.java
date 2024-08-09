class No_6_5_Constructor {

    {
        System.out.println("you are in initialize block\n" +
                "initialize block called when the object of the class is created/it runs before the all constructor called" +
                "it runs at every object creation time");
    }
    static{
        System.out.println("Your are in static block\n" +
                "static block is called when jvm read the class name /at blue print time" +
                "static block run at only one time when class is load");
    }

    No_6_5_Constructor(){
        System.out.println("You are in constructor !");
    }
    public static void main(String[] args) {

        No_6_5_Constructor exaple= new No_6_5_Constructor();

        No_6_5_Constructor exaple2= new No_6_5_Constructor();

        /*
        #constructor introduction :

        ->when we declare object of class in this case we call constructr

        ex. Driver myDriver=new Driver();
                                    |
                                 constructor
        -> constructor initialize new object and set initial states for the objects attributes
        ->By default constructor made automatically by java
        ->constructor return an object (we can not change constructor return type , it always return new object
        ->constructor name must be same as a class name
        ->we declare construction in car class as follow :

        public class Car {
           int noOfWheels;
           int noOfSeats;
           int maxspeed;


          car() {
          noOfWheels=4;
          maxspeed=150;
          noOfSeats=5;
          }

          public static void main(String args[]){

             Car swift=new Car();       //here swift car have

          }

        }

        ->for above class we declare some variables in constructor here we all variables that declare in constructor is bydefault assign values


         ->types of constructor : 1) default constructor :by default constructor in this all variables assign by default values
                                  2) parameterized constructor: in this case constructor have a parameter which value has passed at object creation time

         ->Example:

         public class Car {
          string color ;
          int noOfWheels;
          int noOfSeats;

          Car (String color){
             this.color=color;
             noOfWheels=4;
             noOfSeats=5;
          }

          public static void main (String args[]){

          Car swift = new Swift("White");   //if we declare like Car swift = new Swift(); then error
          sout(swift.color); //print White

          //in this case color is mandatory for the creation of the object

          }

         }

         */

        /*
        #Constuctor chain:

        ->we can create multiple constructor :
        -> in above program color is mandatory to create an object but if we do not want to pass color then in this case bydefault color is black so to tackle this problem we use class chaining
        ->Ex:

        public class Car {
          string color ;
          int noOfWheels;
          int noOfSeats;
          String tailLightColor;

          Car (String color){
             this.color=color;
             noOfWheels=4;
             noOfSeats=5;
             tailLightColor="'Black";  //if other color then black suit
          }

          Car(){
             this("Black");    //here if no argument pass in object creation then
                               //Car() constructor invoke
                               //after first statment of this Car must be call of another construction (chaining) , if we dont do this then it pop the error
             tailLightColor="White";  // if black car then white tail light suit
          //here first this("Black") called so tailLightColor set to the black but when we access return the in this class its value is reassign
          to the white
            }

          public static void main (String args[]){

          Car swift = new Swift("White");   //if we declare like Car swift = new Swift(); then error
          sout(swift.color); //print White

          //in this case color is mandatory for the creation of the object

          }

         }

         */

        /*
        see code bloc topic in notes pdf topic 6.6
         1.code block (if(conditon){})
         2.Initialize block
         3.static block

         for example see above class blocks
         */
    }
}
