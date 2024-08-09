public class Challange_7_73_DiceSimulation {


    int roll(){
        double randomnumber=Math.random()*6; //in random 1 is exclusive and 0 is inclusive
        int roll=(int) Math.ceil(randomnumber);
        return roll;
    }
    public static void main(String[] args) {

        Challange_7_73_DiceSimulation dice=new Challange_7_73_DiceSimulation();

        for(int i=0 ; i<10 ; i++) {
            System.out.println(dice.roll());
        }
    }
}
