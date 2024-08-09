import java.util.Scanner;

public class Challange_7_68_PrintFibbonacciSeriesRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("ENTER THE NUMBER: ");
        num=sc.nextInt();

        for(int i=0 ; i<=num ; i++){
            System.out.print(fib(i)+"\t");
        }
    }

    public static int fib(int position){

        if(position == 0){
                return 0;
        }
        if(position == 1 ){
            return 1;
        }

        return fib(position-2)+fib(position-1);
    }
}
