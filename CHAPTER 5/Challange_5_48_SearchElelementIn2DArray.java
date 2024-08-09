import java.util.Scanner;

public class Challange_5_48_SearchElelementIn2DArray {

    public static void main(String args[]){
        System.out.println("WELCOME TO SEARCH AN ELEMENT IN 2D ARRAY :)\n");
        Scanner sc = new Scanner(System.in);
        int[][] array=ArrayUtilities.create2DArray();
        int ele;
        System.out.print("ENTER THE ELEMENT WHICH YOU WANT TO FIND: ");
        ele=sc.nextInt();

        int[] indices=searchAnIndex(array,ele);
        if(indices[0]==-1 || indices[1]==-1){
            System.out.println("No element found in array !");
        }
        else{
            System.out.println("ELEMENT IS FIND ON INDICES :[" + indices[0] + "," + indices[1] + "]");
        }
    }

    public static int[] searchAnIndex(int[][] arr,int element){
        int[] index={-1,-1};

        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                if(arr[i][j]==element){
                    index[0]=i;
                    index[1]=j;
                    return index;
                }
                j++;
            }
            i++;
        }

        return index;
    }

}
