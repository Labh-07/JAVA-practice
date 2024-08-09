import java.util.Scanner;

public class Challange_5_43_CheckSortdOrNot {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ARRAY SORTED CHECKER :)\n");

        sortedOrNot(createArray());
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

     public static void sortedOrNot(int[] arr){
            boolean in,de;
            in=isIncreasing(arr);
            de=isDecreasing(arr);

            if(in==false && de==false){
                System.out.println("ARRAY IS A NOT SORTED !");
            }
            else{
                System.out.println("ARRAY IS SORTED :)");
            }
    }

    public static boolean isIncreasing(int[] arr){
        int i=1;
        while(i<arr.length){
            if(arr[i]<arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] arr){
        int j=1;
        while(j<arr.length){
            if(arr[j]>arr[j-1]){
                return false;
            }
            j++;
        }

        return true;
    }
}
