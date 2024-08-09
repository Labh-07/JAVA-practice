import java.util.Scanner;

public class No_7_1TernaryOperator {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);

        System.out.print("ENTER THE FIRST NUMBER: ");
        a=sc.nextInt();
        System.out.print("ENTER THE SECOND NUMBER: ");
        b=sc.nextInt();

        int greaternumber = a>b ? a : b ; //we can not write sout because it is an statment we can write only expression
        System.out.println("gratter numebr is : "+greaternumber);
        //can use with replace to if else
        //no recoanded becuase it makes complicated some time

    }
}
