import java.util.Scanner;

public class Challange_5_40_SumAndAevrageOfArrayElement {

    public static void main(String args[]){
        System.out.println("WELCOME TO SUM AND AEVRAGE CALCULATOR OF ALL ELEMENT OF ARRAY :)\n");
        int c;
        Scanner sc = new Scanner(System.in);

        int[] arr=createArray();

        System.out.print("1.Sum\n2.Aevrage\nENTER THE NUMBER: ");
        c=sc.nextInt();

        if(c==1){
            System.out.println("SUM OF ELEMENT OF AN ARRAY IS: "+sumOfArrayElement(arr));
        }
        else if(c==2){
            System.out.println("AEVRAGE OF AL ELEMENT OF AN ARRAY IS: "+aevrageOfArrayElement(arr));
        }
        else{
            System.out.println("PLEASE ENTER THE VALID CHOICE !");
        }
    }

    public static int sumOfArrayElement(int[] arr){
        int i=0,sum=0;

        while(i<arr.length){
            sum+=arr[i];
            i++;
        }
        return sum;
    }

    public static float aevrageOfArrayElement(int[] arr){
        return (float)(sumOfArrayElement(arr)/arr.length);
    }

    public static int[] createArray(){
        int l;
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE LENGTH OF THE ARRAY: ");
        l=sc.nextInt();

        int[] arr=new int[l];

        int i=0;
        while(i<arr.length){
            System.out.print("array["+i+"] : ");
            arr[i]=sc.nextInt();
            i++;
        }
        return arr;
    }
}
