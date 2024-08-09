import java.util.Scanner;

public class Challange_5_45_ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO ARRAY REVERSE AN ARRAY :)\n");
        int[] arr=createAnArray();
        reverseAnArray(arr);
        dispayAnArray(arr);
    }

    public static int[] createAnArray(){
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

    public static void reverseAnArray(int[] arr){
        int i=0;
        int temp;

        while(i< (arr.length/2)){
            temp=arr[i];
            arr[i]=arr[(arr.length-1)-i];   //n-i-1 here (arr.length-1)=lsat element and -i for chang iteration
            arr[(arr.length-1)-i]=temp;
            i++;
        }
    }

    public static void dispayAnArray(int[] arr){
        int i=0;

        while(i<(arr.length)){
            System.out.print(arr[i]+"\t");
            i++;
        }
    }


}
