import java.util.Scanner;
import java.lang.Math;

public class Challange_5_37_ArmstrongConstatnt {

    public static void main(String args[]){

        System.out.println("WELCOME TO ARMSTRONG CHECKER :)\n");
        Scanner sc=new Scanner(System.in);
        int a;

        System.out.print("ENTER THE NUMBER FOR THE ARMSTRONG CHECKING: ");
        a=sc.nextInt();
        armstrongChecker(a);
    }

    public static void armstrongChecker(int num){

        int n=num;
        int sum=0;
        int temp;

        while(n>0){
            temp=n%10;
            sum=sum+(int)(Math.pow(temp,countDigits(num)));
            n=n/10;
        }

        if(num == sum){
            System.out.println("GIVEN NUMBER ("+num+") IS A ARMSTRONG NUMBER :)");
        }
        else{
            System.out.println("GIVEN NUMBER ("+num+") IS A NOT A ARMSTRONG NUMBER :)");
        }

    }

    public static int countDigits(int n){
        int i=0;
        while(n>0){
            i++;
            n=n/10;
        }

        return i;
    }
}
