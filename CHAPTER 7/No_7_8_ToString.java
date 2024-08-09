class Car{
        /*
        #toString Method :

        -> it is used already available in the class
        -> it represent the object in string representation
        -> object ideally return in the form of string
        ->by default classes name is @hashcode
         */

        //properties:
        int noOfWheels;
        int noOfDoors;
        int maxSpeed;
        String name;

    public Car(int noOfWheels,int noOfDoors,int maxSpeed,String name) {
        this.noOfWheels= noOfWheels;
        this.noOfDoors=noOfDoors;
        this.maxSpeed=maxSpeed;
        this.name=name;
    }

    @Override
    public String toString() {
        //       return super.toString();
        return "CAR NAME IS :"+this.name;
    }

    public static void main(String[] args) {
        Car BMW=new Car(4,5,700,"BMW");
        //System.out.println(BMW.toString()); //without define to string it returns @hashcode
        System.out.println(BMW.toString());  //by default System.out.println(BMW); if we want to print object then in this cae to string print

    }
}

