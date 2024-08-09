import java.util.Scanner;

public class Challange_5_46_CheckPalindromeOrNot {
    public static void main(String[] args) {
        System.out.println("WELCOME TO PALINDROME CHECLER :)\n");
        checkPalindromeOrNot(createAnArray());
    }

    public static int[] createAnArray() {
        int l;
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE LENGTH OF THE ARRAY: ");
        l = sc.nextInt();

        int[] arr = new int[l];

        int i = 0;
        while (i < arr.length) {
            System.out.print("array[" + i + "] : ");
            arr[i] = sc.nextInt();
            i++;
        }
        return arr;
    }

    public static void reverseAnArray(int[] arr) {
        int i = 0;
        int n = arr.length;
        int temp;

        while (i < (n / 2)) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
            i++;
        }

    }

    public static void checkPalindromeOrNot(int[] arr){
        int[] newArray=arr;
        reverseAnArray(arr);
        boolean trueorfals=(newArray==arr);
        System.out.println(trueorfals);
        int i=0;
        int common=0;

        while(i< arr.length){
            if(arr[i]==newArray[i]){
                common++;
            }
        }

        if(common== arr.length){
            System.out.println("AN ARRAY IS A PALINDROME :)");
        }
        else{
            System.out.println("AN ARRAY IS A NOT AN PALINDROME !");
        }

        /*
        another approach :(use original arr not reverse that)

        int i=0;
        if(i<arr.length){
            if(arr[i] != arr[(arr.length-1)-i]){
            print ARRAY IS A NOT A PALINDROME
            return ;
            }
            i++;
        }
        print array is palindrome
        return;
         */
    }
}
