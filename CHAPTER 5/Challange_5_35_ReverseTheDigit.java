import java.util.Scanner;

public class Challange_5_35_ReverseTheDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("ENTER THE NUMBER WHICH YOU WANT TO REVERSE: ");
        n=sc.nextInt();
        System.out.println("YOUR REVERSED NUMBER IS: "+reverseTheNumber(n));

    }

    public static int reverseTheNumber(int n){
        System.out.println("WELCOME TO Reverese The Number mechnism :) \n");
        int r=0;
        int temp;

        while(n>0){

            temp=n%10;
            r = (r * 10)+temp;
            n=n/10;
        }

        return r;
    }
}
