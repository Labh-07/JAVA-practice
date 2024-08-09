public class Challange_5_39_Pattern {

    public static void main(String[] args) {
        leftHandedHalfPyramid(5);
        reverseLeftHandedHalfPyramid(5);
        rightHandedHalfPyramid(5);
    }

    public static void leftHandedHalfPyramid(int n){
        int i=1;
        while(i<=n) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
        System.out.println("\n\n");
    }

    public static void reverseLeftHandedHalfPyramid(int n){
        int i=1;

        while(i<=n){
            int j=n;
            while(j>=i){
                System.out.print("* ");
                j--;
            }
            i++;
            System.out.println();
        }
        System.out.println("\n\n");

    }

    public static void rightHandedHalfPyramid(int n){
        int i=1;

        while(i<=n){
            //spaces
            int s=1;
            while(s<=(n-i)){
                System.out.print("  ");
                s++;
            }
            //star
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
        System.out.println("\n\n");

    }
}
