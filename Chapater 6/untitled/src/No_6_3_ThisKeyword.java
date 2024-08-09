public class No_6_3_ThisKeyword {
    public static void main(String[] args) {

        Car RR=new Car();

//        RR.addFuel(6);
//        RR.start();
//        RR.drive();

        RR.addFuel(6);
        Car startedCar = RR.start();
        startedCar.drive();   //we can also write RR.start().drive();  chain the method
        //drive a car if and only if car was started

        /*
        #another usage :

        public void addFuel(float currentFuelInLiters){
        currentFuelInLiters+=currentFuelInLiters;
    }
   -> here we there are two duplicate variables are there , first is as a argument
   so that is a priority variable but for access the currentFuelInLiters if Car property that
   in this case we can use this keyword for access the currentFuelInLiters

   ->Solution :

       public void addFuel(float currentFuelInLiters){
              this.currentFuelInLiters+=currentFuelInLiters;
       }

       ->Conclusion:
       -this keyword is used for the return current object class (instance class)

         */
    }
}
