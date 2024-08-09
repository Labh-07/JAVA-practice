public class No_7_6_RandomNumberAndMathClass {

    public static void main(String[] args) {
        System.out.println(Math.abs(-99)); //99
        System.out.println(Math.ceil(99.1));  //100.0
        System.out.println(Math.floor(99.7)); //99.0
        System.out.println(Math.round(99.4)); //99
        System.out.println(Math.round(99.5)); //100
        System.out.println(Math.random());  //generate number betweeen 0 to 1
        //we can change range by multiply by 100 to random number and convert into int or ceil or floor
        int random = (int) Math.ceil(Math.random());
    }
}
