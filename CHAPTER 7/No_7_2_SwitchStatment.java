import java.util.Scanner;

public class No_7_2_SwitchStatment {

    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER FOR THE DAY: ");
        day=sc.nextInt();

        switch (day){   //rather then int we can also use byte,short,int.char,String,enums,from java 14 we can use long,float,double
            case 1 :
                System.out.println("Monday");
                break;                           //here cases are run in series so that's why break statement is requires to exit the switch
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                //System.out.println("Thursday");
                //break;
            case 5 :                                    //fall through  \ in this case for bpth 4 and 5 friday print
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter valid day !");    //in default no break statment required ,it executs when no case match
        }

        /*
        #java 12 intorduced following syntax :
         */

        //here switch return the value
        String dayName = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Weekend";
            //case 7 -> "Sunday";
            default -> "ENTER VALID DAY";
        };
        System.out.println(dayName);
    }
}
