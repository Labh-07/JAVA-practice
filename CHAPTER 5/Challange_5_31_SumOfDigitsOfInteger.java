import java.util.Scanner;

public class Challange_5_31_SumOfDigitsOfInteger {

    public static void main(String args[]){
        System.out.println("WELCOME TO SUM CALCULATOR OF THE INTEGER :)\n");
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE INTEGER NUMBER (WHICH YOU WANT TO PRINT SUM OF ALL INTEGERS): ");
        n=sc.nextInt();

        System.out.print("SUM OF YOUR GIVEN INTEGER IS: "+SumOfInteger(n));
    }

    public static int SumOfInteger(int n){
        int a,sum=0;

        while(n>0){
            a=n%10;
            sum=sum+a;
            n=n/10;
        }

        return sum;
    }
}
