import java.util.Scanner;

public class Challange_5_33_GCDCalculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("WELCOME TO GCD CALCULATOR :)\n");

        System.out.print("ENTER THE FIRST NUMBER: ");
        x = sc.nextInt();
        System.out.print("ENTER THE SECOND NUMBER: ");
        y = sc.nextInt();

        int GCD = gcd(x, y);
        if (GCD != 0) {
            System.out.println("THE GREATEST COMMON DIVISOR OF " + x + " AND " + y + " IS: " +GCD);
        } else {
            System.out.println("THERE IS NO ANY GCD OF GIVEN NUMBER !");
        }
    }

    public static int gcd(int a , int b){
        int i=1;
        int n=0,c;
        int temp1,temp2;

        if(a<b){
            c=a;
        }
        else{
            c=b;
        }
        while(i<=c){
            temp1=a%i;
            temp2=b%i;
            if(temp1==0 && temp2==0){
                n=i;
            }
            i++;
        }
        return n;
    }
}
