import java.util.Scanner;

public class Challange_5_36_FibonacciSeries {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO FIBONACCI SERIES GENERATOR :)\n");
        int n;

        System.out.print("ENTER THE NUMBER TILL YOU WANT TO PRINT THE FIBONACCI SERIES: ");
        n=sc.nextInt();
        fibSeries(n);
    }

    public static void fibSeries(int n){

        if(n==0){
            System.out.print("0\t");
            return;
        }
        else if(n==1){
            System.out.print("0\t1\t1");
            return;
        }
        else if(n<0){
            return;
        }
        else{
            System.out.print("0\t1\t");
        }

        int i=0,j=1;
        int fibn=0;

        while((i+j)<n){
            fibn=i+j;
            i=j;
            j=fibn;
            System.out.print(fibn+"\t");

        }


        /*#sir logic :

        if(n<0){
            return;
        }
        System.out.print("0\t");
        if(n==0){
            return;
        }
        System.out.print("1\t");

        int first=0,second=1;
        while(first + second <= n){
            int third=first+second;
            System.out.print(third+"\t");
            first=second;
            second=third;
        }
*/

    }
}
