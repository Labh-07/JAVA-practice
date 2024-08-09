import java.util.Scanner;

public class No_7_4_RecursionFactorial {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        num=sc.nextInt();
        No_7_4_RecursionFactorial obj=new No_7_4_RecursionFactorial();

        long answer=obj.fact(num); //we can not call non static context from the static method

        System.out.print("FACTORIAL IS :"+answer);
    }

    public long fact(int num){
        if(num==1){
            return 1;
        }
        return fact((num-1))*num;   //we can use loop also
    }
}
