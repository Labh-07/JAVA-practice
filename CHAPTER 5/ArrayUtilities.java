import java.util.Scanner;

public class ArrayUtilities {

    public static int[] createanArray() {
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

    public static int[][] create2DArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO 2D ARRAY GENERATOR :)\n");
        int r,c;

        System.out.print("ENTER THE NO. OF ROWS OF 2D ARRAY: ");
        r=sc.nextInt();
        System.out.print("ENTER THE NO. OF COLUMNS OF 2D ARRAY: ");
        c=sc.nextInt();

        int[][] newArray=new int[r][c];
        System.out.println("NOW ENTER THE ELEMENTS OF 2D ARRAY: ");
        int i=0;
        while(i< newArray.length){
            int j=0;
            while(j<newArray[i].length){
                System.out.println("newArray["+i+"]["+j+"] : ");
                newArray[i][j]=sc.nextInt();
                j++;
            }
            System.out.println();
            i++;
        }

        return newArray;
    }

    public static int numberOfElement2DArray(int[][] arr){
        int i=((arr.length)*(arr[0].length));
        return i;
    }

    public static void dispayAnArray(int[] arr) {
        int i = 0;

        while (i < (arr.length)) {
            System.out.print(arr[i] + "\t");
            i++;
        }
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

    public static int sumOfArrayElement(int[] arr) {
        int i = 0, sum = 0;

        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public static float aevrageOfArrayElement(int[] arr) {
        return (float) (sumOfArrayElement(arr) / arr.length);
    }

    public static int numberOfOccurance(int[] arr, int element) {
        System.out.println("WELCOME TO NUMBER OCCURANCE COUNTER :)\n");
        int i = 0;
        int count = 0;

        while (i < arr.length) {
            if (arr[i] == element) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static int maxNumberFinder(int[] arr){
        int num=arr[0];
        int i=1;

        while(i<arr.length){
            if(arr[(i-1)]<arr[i]){
                num=arr[i];
            }
            i++;
        }
        return num;
    }

    public static int minNumberFinder(int[] arr){
        int num=arr[0];
        int i=1;

        while(i<arr.length){
            if(arr[(i-1)]>arr[i]){
                num=arr[i];
            }
            i++;
        }
        return num;
    }

    public static boolean isSortedOrNot(int[] arr){
        int i=1;

        while(i<arr.length){
            if(arr[i]<arr[i-1]){
                return false;
            }
            i++;
        }

        return true;
    }

    public static int[] deleteAnElement(int[] arr,int element){
        int index=returnAnIndex(arr,element);
        if(index==-1){
            System.out.println("THERE IS NO ELEMENT IN THE ARRAY !");
        }
        int i=index;

        while(i<(arr.length-1)){
            arr[i]=arr[(i+1)];
            i++;
        }

        int[] newArray=arr;

        return newArray;
    }

    public static int returnAnIndex(int[] arr,int element){
        int i=0;
        int index=-1;

        while(i<arr.length){
            if(element==arr[i]){
                index=i;
            }
            i++;
        }
        return index;
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

    }
}


