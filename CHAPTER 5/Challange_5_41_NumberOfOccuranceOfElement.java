import java.util.Scanner;

public class Challange_5_41_NumberOfOccuranceOfElement {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        int[] array=createAnArray();

        System.out.print("ENTER THE NUMBER WHICH YOU WANT TO CHECK IN ARRAY: ");
        num=sc.nextInt();

        System.out.println("NUMBER OF ELEMENT "+num+"OCCURANCE IS: "+numberOfOccurance(array,num)+" times");

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

    public static int numberOfOccurance(int[] arr,int element){
        System.out.println("WELCOME TO NUMBER OCCURANCE COUNTER :)\n");
        int i=0;
        int count=0;

        while(i<arr.length){
            if(arr[i]==element){
                count++;
            }
            i++;
        }

        return count;
    }
}
