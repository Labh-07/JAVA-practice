import java.util.Scanner;

public class Challange_5_42_MaximumMinimumNumberCheckerInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array=createArray();
        System.out.print("1.MAX  NUMBER\n2.MIN NUMBER\nENTER THE VALID CHOICE: ");
        int c=sc.nextInt();

        if(c==1){
            System.out.println("MAX NUMBER IN THE ARRAY IS: "+maxNumberFinder(array));
        }
        else if(c==2){
            System.out.println("MIN NUMBER IN THE ARRAY IS: "+minNumberFinder(array));
        }
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

    public static int maxNumberFinder(int[] arr){
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
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
        int num=Integer.MAX_VALUE;
        int i=1;

        while(i<arr.length){
            if(num>arr[i]){
                num=arr[i];
            }
            i++;
        }
        return num;
    }
}
