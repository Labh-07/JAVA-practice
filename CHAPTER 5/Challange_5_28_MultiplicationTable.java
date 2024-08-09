import java.util.Scanner;

public class Challange_5_28_MultiplicationTable {
    public static void main(String args[]){
        System.out.println("WELCOME TO TABLE GENRATOR :)\n");
        table();
    }

    public static void table(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER WHICH YOU WANT TO PRINT TABLE: ");
        n=sc.nextInt();

        int i=1;
        while(i<=10){
            System.out.println(n+" X "+i+" ="+(n*i));
            i++;
        }
    }
}
