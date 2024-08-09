public class Challange_5_47_MergeTwoSortwdArray {
    public static void main(String[] args) {
        System.out.println("WELCOME TO MERGING TWO SORTED ARRAY :)\n");
        int[] arr1 = ArrayUtilities.createanArray();
        int[] arr2 = ArrayUtilities.createanArray();
        int[] mergedArr = merg(arr1, arr2);
        ArrayUtilities.dispayAnArray(mergedArr);
    }

    public static int[] merg(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int[] mergedArr = new int[newSize];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length || j < arr2.length) {
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) { //for logic think about short circuit
                mergedArr[k] = arr1[i];
                i++;
                k++;
            } else {
                mergedArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        return mergedArr;
    }

}
