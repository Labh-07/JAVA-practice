package GetterAndSetter;

public class Car {

    private String color;   //public accsss
    private String model;   //public
    private double fuelLevel;
    private long costOfCar;  //default

    public String getColor(){
        return color;
    }

    public String gertModel(){
        return model;
    }

    void setColor(String color){
        this.color=color;
    }

    public Car(String color, String model, double fuelLevel, long costOfCar) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfCar = costOfCar;
    }

    public static void main(String[] args) {
        /*
        getter setter suggest then all proparties can access by method only not direct
         */
    }
}
