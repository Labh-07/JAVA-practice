package AbstractInterface;

public class Car extends vehicle{
    //each extended or child class must be chain with super class constructor or must be satisfied attrbutes
    //if superclass have bydefault constrctor then no required to any chaining
    // but if you modify the super class constructor then you must chain the class

    private int noOfDoors;

    @Override                         //here we full fill the responsiblities if you dont want this responsibility then make this class to abstract
    public void makeStartSound(){
        System.out.println("bruhmmmmm .......");
    }
    Car(){
        super(4);  //to pass attribue parent constructor
                             //it must be at first line
    }
}
