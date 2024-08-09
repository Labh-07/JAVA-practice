import java.util.Scanner;

public class No_5_11_StudentMarkEntryProgram {

    public static void main(String[] args) {
        int[][] array=createArray();
        marksEntry(array);
        printArray(array);
    }

    public static int[][] createArray(){
        Scanner sc = new Scanner(System.in);
        int s,m;
        System.out.println("WELCOME TO ARRAY CREATION PROGRAM :)\n");
        System.out.print("ENTER THE NUMBER OF STUDENT: ");
        s=sc.nextInt();
        System.out.print("ENTER THE NUMBER OF SUBJECT: ");
        m=sc.nextInt();

        int[][] marks=new int[s][m];
        return marks;
    }

    public static void marksEntry(int[][] arr){
        int i=0;
        Scanner sc = new Scanner(System.in);

        while(i<arr.length){
            System.out.print("ENTER THE MARKS OF STUDENT "+(i+1)+" :\n");
            int j=0;
            while(j<arr[0].length){
                System.out.println("ENTER THE MARKS "+(j+1)+" :");
                arr[i][j]=sc.nextInt();
                j++;
            }
            i++;
        }
    }

    public static void printArray(int[][] arr){
        System.out.println("WELCOME TO ARRAY PRINTER :)\n");
        int i=0;

        while(i<arr.length){
            System.out.println("MARKS OF STUDENT "+(i+1)+" :\n");
            int j=0;
            while(j<arr[0].length){
                System.out.println("MARKS "+(j+1)+": "+arr[i][j]);
                j++;
            }
            i++;
        }
    }
}


