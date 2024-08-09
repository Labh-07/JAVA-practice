package Inheritance;

class Vehicle{

    public int numberOfTiers;  //if we make this property private then no inherit to the child
    private int milege;    //private : no use because it is private (we can use by getter and setter)
    String color;  //default
    protected int glass; //


    public void setMilege(int milege){
        this.milege=milege;
    }

    public void setNumberOfTiers(int number){
        this.numberOfTiers=number;
    }

    Vehicle(int tiers){
        this.numberOfTiers=tiers;
    }
    public void commute(){
        System.out.printf("I ma going from place A to Place B using %d tiers\n",numberOfTiers);
    }
}

class TwoWheeler extends Vehicle{

    TwoWheeler(){
        super(3);
        //super(2);  //instead of this Vehicle(){}
        color="black"; //we can access because we defined default
    }

    public void balance(){
        System.out.println("PLEASE BALANCE CAREFULLY :)");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4);
        TwoWheeler twovel= new TwoWheeler();

        vehicle.commute();
        twovel.commute();
        twovel.setMilege(5); //we can access private property by setter and getter
    }
}

class MotorCycle extends TwoWheeler{

    public static void main(String[] args) {
        MotorCycle mt= new MotorCycle();
        System.out.println(mt.numberOfTiers);  //print 2 because twovehler set 2 tiers
        mt.commute();
    }
}


/*
summary:
1) how to transfer parent to child
2) private:no transfer
   public:anyone
   default:transfer package
   protracted:package + child grand child any  //special make for inheritance
 */