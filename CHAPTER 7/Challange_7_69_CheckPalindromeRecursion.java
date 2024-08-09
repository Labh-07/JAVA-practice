import java.util.Scanner;

public class Challange_7_69_CheckPalindromeRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;

        System.out.print("ENTER THE STRING : ");
        word=sc.next();

        System.out.println("YOUR STRING IS "+(isPalindrome(word) ? "Palindrome" : "Not palindrome"));

    }

    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }

        int lastpos=str.length()-1;

        if(str.charAt(0) != str.charAt(lastpos)){
            return false;
        }

        String newStr=str.substring(1,lastpos);  //here last position is not inclusive
        return isPalindrome(newStr);
    }
}
