public class No_2_EscapeSequence {
    public static void main(String args[]){
        //Escape sequence :

        System.out.println("Hello , I am 'Labh'"); //labh in single qoutes this not generate the error but the right way to use is shown in escape sequence
        //System.out.println("Hello , I am "LABH" "); -> here if we used double qoutes inside the double qoutes then error occurs beacuse compiler confuse that there are many double qoutes
        //in above problem compiler understand that string start from "h and end in am "

        //Solution :
        //1. use Escape sequence :
        System.out.println("Hello , I am \"Labh\" "); //here we use escape sequence \ (backslash) to ignore the double qoutes
        System.out.println("Hello , I am \'Labh\' "); // right way to use single qoutes inside the double qoutes
        //if we want to dispay the backslash and also want to use escape sequence in this case use double back slash \\
        System.out.println("Hello , I am \\Labh\\");
        /*System.out.println("Hello
                , I am labh ");
                here we can not write a single string into a multiple lines
                for the next line two options are ther : 1)use two diffrent System.out.println(""); function
                                                         2) use escape sequence \n
                                                         */

        System.out.println("Hello ,\nI am Labh");

        //Tab space \t
        System.out.println("I\tam\tLabh");

        // \b:
        System.out.println("Hello\bIamLabh");  //here o is overwrite , insert a backspace in the next at this point

    }

}
