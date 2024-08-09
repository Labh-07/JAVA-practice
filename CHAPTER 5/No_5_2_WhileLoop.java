import java.util.Scanner;

public class No_5_2_WhileLoop {
    public static void main(String args[]){
        int i=1;  //initialization

/*        while(i<=10){  //condition
            System.out.println(i); //statment
            i=i+1;  //updation
        }
     */

        int count=500;
        while(count>=200){
            System.out.println(count);
            count-=1;
        }

        int num=1;
        Scanner sc = new Scanner(System.in);

        while(num<=5){
            System.out.println("ENTER THE NUMBER"+num+": ");
            num = sc.nextInt();
            num++;
        }
    }
}
