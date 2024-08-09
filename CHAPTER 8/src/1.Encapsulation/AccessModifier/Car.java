package AccessModifier;

public class Car {

    public String color;
    public String model;
    private double fuelLevel;
    private long costOfCar;
    int engineAge;

    public Car() {
    }

    public Car(String color,String model,double fuelLevel,long costOfCar,int engineAge){
        this.color=color;
        this.model=model;
        this.fuelLevel=fuelLevel;  //here private proparties can use because in same class
        this.costOfCar=costOfCar;
    }

    @Override
    public String toString(){
        return "{color: "+color+"/model:"+model+" /fuelLevel:"+fuelLevel+" /costOfCar:"+costOfCar+" }";
    }

    //see program or pdf

}
