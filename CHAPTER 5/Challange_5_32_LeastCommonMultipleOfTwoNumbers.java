import java.util.Scanner;

public class Challange_5_32_LeastCommonMultipleOfTwoNumbers {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO LCM CALCULATOR :)\n");
        int x,y;

        System.out.print("ENTER THE FIRST NUMBER: ");
        x=sc.nextInt();
        System.out.print("ENTER THE SECOND NUMBER: ");
        y=sc.nextInt();

        System.out.println("LCM OF "+x+" and "+y+" IS: "+LCM(x,y));
    }

    public static int LCM(int a , int b){

        int n,i;
        int temp1,temp2;

        if(a>b){
            i=a;
        }
        else{
            i=b;
        }

        while(true){
            temp1=i%a;
            temp2=i%b;
            if(temp1==temp2){
                n=i;
                break;
            }
            i++;
        }

        /*
        #improved process:

        int i=1;

        while(true){
            int factor=a*i;
            if(factor % b == 0){
                return factor;
            }
            i++;
        }

         */
        return n;
    }
}
