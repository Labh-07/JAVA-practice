class Car{

    //instance variable / properties / attributes :-
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    //In properties all integer and float etc... is set to 0
    //In String color is byDefault set to Null

    //instance methods / functionality / methods / behaviour :-

    public Car start(){
        if(currentFuelInLiters == 0){
            System.out.println("CAR IS OUT OF FUEL !!,can not start");
        }
        else if(currentFuelInLiters < 5){
            System.out.println("CAR IS RUNNING IN RESERVED MODE , PLEASE REFUEL !");
        }
        else{
            System.out.println("car is started ...bruhhhmmmmm.... :)");
        }
        return this;  //here we return a car for peticular object that was we called (because we have many objects so that why we use this)
    }
    public void drive(){

        System.out.println("car is on the road :)");
        currentFuelInLiters--;

    }

    public void addFuel(float fuel){
        currentFuelInLiters+=fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("i am in finalizer");
//    }

}
