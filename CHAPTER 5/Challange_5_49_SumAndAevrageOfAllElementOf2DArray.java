import java.util.Scanner;

public class Challange_5_49_SumAndAevrageOfAllElementOf2DArray {

    public static void main(String args[]){
        System.out.println("WELCOME TO SU AND AEVRAGE CALCULATOR OF 2D ARRAY ELEMENTS :)\n");
        Scanner sc = new Scanner(System.in);

        int[][] array=ArrayUtilities.create2DArray();

        int sum=sumOfAn2DArray(array);
        double aevrage=aevrageOf2DArray(array);

        System.out.println("sum of an 2D array is: "+sum+"\naevrage of 2D array is: "+aevrage);


    }

    public static int sumOfAn2DArray(int[][] arr){
        int sum=0;
        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                sum+=arr[i][j];
                j++;
            }
            i++;
        }

        return sum;
    }

    public static double aevrageOf2DArray(int[][] arr){
        double aevrage=0;
        double sum=sumOfAn2DArray(arr);
        aevrage=sum/ArrayUtilities.numberOfElement2DArray(arr);

        return aevrage;
    }
}
