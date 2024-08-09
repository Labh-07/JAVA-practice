import java.util.Scanner;

public class Challange_3_3_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.print("ENTER THE FIRST NUMBER :");
        a = sc.nextInt();
        System.out.print("ENTER THE SECOND NUMBER :");
        b=sc.nextInt();
        System.out.print("SUM OF "+a+" and "+b+" is :"+(a+b));
    }
}
