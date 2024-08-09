import java.util.Scanner;

public class Challange_5_29_SumOfAllOddNumber {
    public static void main(String args[]){

        System.out.print("Sum of odd number is: "+SumAllOddNumber());
    }

    public static int SumAllOddNumber(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("WELCOME TO SUM OF ODD NUMBER GENERATOR :)\n");
        System.out.print("ENTER THE NUMBER TILL WHICH YOU WANT TO PRINT SUM: ");
        n=sc.nextInt();

        int sum=0;
        int i=1;
        while(i<=n){
            if(i % 2 != 0){
                sum = sum + i;
            }
            i++;
        }
        return sum;
    }
}
