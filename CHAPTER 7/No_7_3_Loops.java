import java.util.Scanner;

public class No_7_3_Loops {

    //topic 7.4 break(exit loop which is currently execute) and continue(skip the current iteration or skip which statment below the conditon statment / use it carefully because if updation is below the condtion then in this case we stuck into infinite loop)

    //just see in notes
    /*
    do while and for
    do while runs at least one time
     */

    public static void main(String[] args) {
        //do while use case

        Scanner sc = new Scanner(System.in);
        int age;
//        System.out.print("ENTER YOUR AGE: ");
//        age=sc.nextInt();
//         //problem : continue to input till enter valid age (between 0 to 100)
//
//        while(age<0 || age>100){
//            System.out.print("ENTER YOUR AGE: ");
//            age=sc.nextInt();
//        }

        //using do while loop :

        do {
            System.out.print("ENTER YOUR AGE: ");
            age = sc.nextInt();

        } while (age > 100 || age < 0);


        //for loop:
        //in while and so while loop sometimes we forget to initialixe , updation or condtion so we use for loop
        //for logic is as similar as while loop
        //for loop is easy

        //foreach loop :
        //use to simplify

        String[] array = new String[]{
                "Ram", "Shyam", "Labh"};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        //insted of this we use foreach loop:
        for(String name : array){
            System.out.println(name);
        }

    }
}
