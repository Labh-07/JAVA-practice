class Driver {

    static int minAgeForDriving=18;


    String name;
    String dateOfLiecence;


    public static void main(String[] args) {

        Car BMW = new Car();    //object creation (new instance of the class)
    /*
    Car myCar;  //here we declare the myCar variable of Car data type
                  that is called refrance (here we assign refracnce of Car class to myCar)

    myCar = new Car();  //here we create a object by new keyword and refrance of that(adress) is assign to myCar variable
                        //here car() is a constructor

    in java array is also an object
    int[]  arr = new int[2];

    -> here when we declare variable then in this case we assign memory previously not at run time(static allocation)
    ->ex.: at home when guest will come today then we clear the room
    -> when ew declare new keyword then dynamic memory allocation occurs (at run time)
    ->Ex.: make tea or coffee after guest was arrived


     */

    /*
    #syntax :

    Student student1= new Student();
    ->Student  -> class name
    ->student1 -> object name / reference name  (some time for meeting busy man we want to connect with his assistant (refrence)
    ->Student() -> it is constructor
    -> n ew-> keyword (dynamically allocate )(create an object)

    ->here Student student1  -} is declaration (refrance declaration)
    ->new Student();   ->(initialization)
     */

    /*
    #Using object :

    ->Access properties using . operator like product.price
     */

        BMW.start();
        BMW.addFuel(6.0f);
        BMW.drive();
        BMW.drive();
        BMW.drive();
        BMW.drive();
        BMW.drive();
        BMW.drive();
        BMW.drive();

        System.out.println(BMW.getCurrentFuelLevel());


        /*
        #Class Vs Objects :
        -> class is a blue print and objects are real values of class
        ->Ex. lane of house is class(blue print) and house that we made is called ibject

         */
    }
}