import java.util.Scanner;  //util means utility , there are many utilities in JRE which have supporting librairies inside it


public class No_3_UserInput {
    public static void main(String[] args) {
        //User Input :

        Scanner input = new Scanner(System.in); //object declaration /Scanner is data type (but it is a class) /new means we want to create new class
        //diffrent input :

        System.out.print("Please enter the name :");
        String name = input.nextLine();
        System.out.println("Good morning :)"+name);

        System.out.print("Enter your age :");
        int age = input.nextInt();
        System.out.println("Your age is :"+age);

        System.out.print("Enter your first sem CPI :");
        float CPI=input.nextFloat();
        System.out.println("Your first sem CPI is :"+CPI);

        System.out.print("Enter your car price :");

    }
}
