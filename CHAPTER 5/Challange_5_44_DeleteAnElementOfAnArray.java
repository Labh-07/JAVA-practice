import java.util.Scanner;

public class Challange_5_44_DeleteAnElementOfAnArray {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ELEMENT DELETE FROM AN ARRAY :)\n");
        int[] array=createAnArray();
        int element;
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE ELEMENT WHICH YOU WANT TO REMOVE THE ELEMENT: ");
        element=sc.nextInt();

        //dispayArray(deleteAnElement(array,element));
         dispayArray(deleteAnElementAndReturnArray(array,element));

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

//    public static int[] deleteAnElement(int[] arr,int element){
//        int index=returnAnIndex(arr,element);
//        if(index==-1){
//            System.out.println("THERE IS NO ELEMENT IN THE ARRAY !");
//        }
//        int i=index;
//
//        while(i<(arr.length-1)){
//            arr[i]=arr[(i+1)];
//            i++;
//        }
//
//        int[] newArray=arr;
//
//        return newArray;
//    }
//
//    public static int returnAnIndex(int[] arr,int element){
//        int i=0;
//        int index=-1;
//
//        while(i<arr.length){
//            if(element==arr[i]){
//                index=i;
//            }
//            i++;
//        }
//        return index;
//    }

    public static int[] deleteAnElementAndReturnArray(int[] arr, int element){

        //for size and create a newArray:
        int occ=ArrayUtilities.numberOfOccurance(arr,element);
        if(occ==0){
            return arr;
        }

        int[] newArray =new int[(arr.length-occ)];

        //copy the array :
        int i=0;
        int j=0;

        while(i<arr.length){
            if(arr[i]==element){
                i++;
                continue;
            }
            /*other
            while(i<arr.length){
              if(arr[i]!=element){
              newArray[j]=arr[i];
              j++;
              }
              i++;
            }
             */

            newArray[j]=arr[i];
            i++;
            j++;
        }

        return newArray;
    }

    public static void dispayArray(int[] arr){
        int i=0;

        while(i<(arr.length)){
            System.out.print(arr[i]+"\t");
            i++;
        }
    }
}
