public class Challange_5_50_SumOfTwoDiagonalElements {
    public static void main(String args[]) {
        System.out.println("WELCOME TO SUM OF DIAGONAL ELEMENT CALCULATOR :)\n");
        System.out.println("NOTE : PLEASE ENTER SQUARE MATRICES ONLY(ROWS=COLUMNS):-");
        int[][] array = ArrayUtilities.create2DArray();

        System.out.println("SUM OF YOUR DIAGONAL ELEMENTS IS: "+sumOfAllElementsOfDiagonal(array));

    }

    public static int leftDiagonalSum(int[][] arr) {
        //System.out.println("enter in left\n");
        int sum = 0;

        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                if (i == j) {
                    sum += arr[i][j];
                }
                j++;
            }
            i++;
        }

       // System.out.println("sum of left : "+sum);
        return sum;
    }

    public static int rightDiagonalSum(int[][] arr) {
      //  System.out.println("enter in right");
        int sum = 0;
        int noRows = arr.length;
        int noColumns = arr[0].length;
        int i = 0;

        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                if (i + j == (arr.length - 1)) {
                    sum += arr[i][j];
                }
                j++;
            }
            i++;
        }
        if ((noRows * noColumns) % 2 != 0) {
            sum=sum-arr[arr.length/2][arr[0].length/2];
        }

       // System.out.println("sum of right"+sum);
        return sum;
    }

    public static int sumOfAllElementsOfDiagonal(int[][] arr){
        return (leftDiagonalSum(arr)+rightDiagonalSum(arr));
    }
}

