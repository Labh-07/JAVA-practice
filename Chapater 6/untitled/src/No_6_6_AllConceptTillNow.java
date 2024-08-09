class Car_f{

    //properties (instant variables)

    static int carNo=0;
    static boolean isInsuranceRequires=true;
    String model;
    String color;
    String colorOfHightlighter;
    int noOfTiers;
    int noOfSeats;
    int maxSpeed;
    float currentFuelInLitters;


    //functions / methods

    public Car_f start(){
        if(currentFuelInLitters==0){
            System.out.println("FUEL IS EMPTY ! , PLEASE REFUEL THE FUEL");
        }
        else if(currentFuelInLitters<=5){
            System.out.println("CAR IS AN RESERVE MODE , PLEASE REFUEL :)");
        }
        else{
            System.out.println("CAR IS STARTED , BRUHMMMMMM.........");
            return this;
        }
        return this;
    }

    public void adFuel(float currentFuelInLitters){
        this.currentFuelInLitters+=currentFuelInLitters;
    }

    public void driveCar() {
        if (currentFuelInLitters > 0) {
            System.out.println("CAR IS RUNNING :)");
            currentFuelInLitters--;
        }
        else{
            System.out.println("Sorry car is out of fuel !");
        }
    }

    public void displayCurrentFuel(){
        System.out.println(currentFuelInLitters);
    }

    //initialize block
    {
        carNo++;
        System.out.println("Insurance claim is successfully assigned to the car \n Congratulations for your new car no."+carNo+" :)");
    }

    //static block
    static{
        System.out.println("Hey customer Your car is available you can buy new car :)\nyou can bus car via object creation");
    }

    //constructor:

    //with argument / color
    Car_f(String color){
        this.color=color;
        noOfTiers=4;
        noOfSeats=5;
        colorOfHightlighter="Black"; //any color expat black , black highlighter suit very well
    }

    //without argument / color
    Car_f(){
        this("Black");  //by default set to black and it must first
        colorOfHightlighter="White"; //it assign first Black but we redefined it by White
    }

    public static void main(String[] args) {

    }

}
