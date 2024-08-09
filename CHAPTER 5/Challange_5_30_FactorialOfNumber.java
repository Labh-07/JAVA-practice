import java.util.Scanner;

public class Challange_5_30_FactorialOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO FACTORIAL CALCULATOR :)\n");
        System.out.print("ENTER THE NUMBER (WHICH YOU WANT TO FACTORIAL): ");
        int n=sc.nextInt();
        int factorial=fact(n);
        System.out.println("FACTORIAL OF "+n+" IS: "+factorial);
    }

    /*using recursion :
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        int factnm1=fact((n-1));
        return factnm1*n;
    }
     */

    //Using function :
    public static int fact(int n){
        int factorial=1;

        int i=1;
        while(i<=n){
            factorial*=i;
            i++;
        }
        return factorial;
    }
}
