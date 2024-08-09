import java.util.Scanner;

public class Challange_5_38_NumberIsPalindromeOrNot {

    public static void main(String[] args) {
        System.out.println("WELCOME TO PALINDROME CHECKER :)\n");
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER FOR THE PALINDROME CHECK: ");
        n=sc.nextInt();
        checkPalindromeOrNot(n);
    }

    public static int reverseNumber(int n){
        int num=n;
        int temp=0;
        int reverseNumber=0;

        while(n>0){
            temp=n%10;
            reverseNumber = (reverseNumber*10)+temp;
            n/=10;
        }

        return reverseNumber;
    }

    public static void checkPalindromeOrNot(int n){
        int reverseNum=reverseNumber(n);
        if(reverseNum==n){
            System.out.println("GIVEN NUMBER IS A PALINDROME :)");
        }
        else{
            System.out.println("GIVEN NUMBER IS A NOT A PALINDROME");
        }
    }
}
