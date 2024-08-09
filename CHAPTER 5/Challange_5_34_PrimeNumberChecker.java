import java.util.Scanner;

public class Challange_5_34_PrimeNumberChecker {

    public static void main(String args[]){
        System.out.println("WELCOME TO PRIME NUMBER CHECKER :)\n");
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("ENTER THE NUMBER FOR THE CHECKING WEATHER IT IS PRIME OR NOT: ");
        num=sc.nextInt();
        primeChecker(num);
    }

    public static void primeChecker(int n){
        int i=2;
        if(n==2){
            System.out.println("YOUR NUMBER IS A PRIME NUMBER :)");
            return;
        }
        while(i<n){
            if(n%i==0){
                System.out.println("Your number is not a prime number !");
                return;
            }
            i++;
        }
        System.out.println("YOUR NUMBER IS A PRIME NUMBER :)");
    }
}
