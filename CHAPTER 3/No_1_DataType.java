public class No_1_DataType {
    public static void main(String args[]) {
        /*
         #Variable :
         -> variable is the name of memory location which stores some data.
         -> it is like a container in our kitchen .
         -> Each variable have a name and memory location.
         -> int a = 7 ;
            here int is data type of variable.(which indicate that number store in variable is integer type number and correspond that it assign similar size of container(block of memory to that variable))
            a is the name of variable(identifier)
            = is a assignment operator which assign right value to the left memory location
            7 is actual memory which store in memory location in the form of binary form
            ; is used to terminate the instruction or shows that here instruction is end .
          ->This variable has two values (R value / L value)
            here for above example R value is 7 and L value is address of given variable a

          #Data Type:
          ->Data type specifies that which type of data will store in the  variable
          according to that type size is assign to that particular variable
          ->data types are given below :

          *-------------------------------------*
            data  size    default  Type of
            type  (bytes)   value    value

          - byte    1         0     integral
          - short   2         0     integral
          - int     4         0     integral
          - long    8         0L    integral
          - char    2      '\u0000' character
                            (null character)
          - float   4        0.0f    decimal
          - double  8        0.0d    decimal
          - boolean 1bit     False   True or False
                    (til JDK 1.3 it uses 1 Byte now use 1 bit)
                    (depend on JDK)
          *-------------------------------------*
           1 byte = 8 bits

           -> each memory container(location) have 1 bit(it can store 1 or 0)
           -> 8 bits = 1 byte
           -> minimum size is 8 bits (1 byte) because maintenance is easy
           -> for declare float specify the f : float price=99.99f;
             because if we set R value as 99.99 than by default this is double value.

           ->> Types of Data Types :-

           1)Primitive data type :
             a)Boolean : boolean
             b)Numeric : ->integral : -integer:byte,short,int,long
                                      -floating:float,double
                                        point
                         ->character :char

            2)Non-primitive :
              a)string
              b)arrays
              c)objects
                etc...
         */
        //variable declaration :
        //int:
        int myNumber = 7; //initialization (declaration and also assign value)
        int yourNumber; //declaration
        // System.out.println(yourName);  here we do not initialize then default value is print but now advance ide identify the error
        yourNumber = 8;
        System.out.println("myNumber is :" + myNumber);
        System.out.println(yourNumber);
        yourNumber = 17;                  // we can change the variable value
        System.out.println(yourNumber);

        long num=120; //here 120 is bydefault int but here implicit conversion occurs that's why no error occurs but right way is shown below :
        long num_l=120L;

        //boolean:
        boolean isVegetarian = true;
        System.out.println("isVegetarian :" + isVegetarian);

        //floating point:

        //float myFloat=99.99; -> error occurs because by default it is double type large number
        float myFloat = 99.99f;
        //  Note: always use variable to appropriate size that required because size of program matters
        double myDouble = 392309480.38239;

        //string:
        String wishes = "Good morning";  // here set of character inside the " " is known as string
        System.out.println(wishes);      // blind string is also valid "" , any length possible

        //char
        char letter='L'; //only one character (only a byte)
        char myCharacter='1';    //Ascii value store in location



        /*

        #Naming convention :

        ->it is not rule but it is advisable to use naming convention to showcase your skill advance
        1)camelCase:
        - Start with a lowercase letter. Capitalize the first letter of each subsequent word.
        - Example :myVariableName

        2)PascalConvention:
        - Start with uppercase letter . Capitalize the first letter of each subsequent words.
        -Example :PascalConvention

        3)snake_case:
        -Start with an lowercase letter. Separate words with underscore.
        -Example :my_variable_name

        4)Kebab-case:
        -All lowercase letters. Separate words with hyphens.
        -Example :my-variable-name

        5)keep a Good and short name :
        -Choose names that are descriptive but not too long. it should make it easy to understand the variable purpose.
        -Example :age,firstName,isMarried

        ->Note: in java use camelCase for the variable and methods / or in class use PascalConvention

         */

         /*
        #RULES OF IDENTIFIERS :

        ->identifiers means variable name
        ->Rules :
        1)Only allowed alphanumerics character(A-Z,a-z,0-9) and two special character ($(dollar) , _ (underscore))
          -Ex. : @age -> not allowed
                 _age -> allowed
                 $age -> allowed
        2)can't use keyword and reserved words
          -Ex. : static -> not allowed
        3)Identifiers should not start with digits
          -Ex. : 1name -> not allowed
                 name1 -> allowed
        4)java variables are case-sensitive
          -Ex. : age and Age is different
        5)there is no limit of the identifier name but it is advisable to use and optimum length of 4-15 letters only.

        ->Note: rules must be follow , convention is not compulsory

         */

         /*
         #Literals :
         -> it is the value of the variable.
         -Ex. : int age=18; -> here 18 is literal
         ->Types : -integer literal (1,2,3,4,-7)
                   -floating-point literal (1.0,0.25,-1.99)
                   -boolean literal (true,false)
                   -character literal ('a','b','c','1','%' etc..)
                   -string literals ("hi" , "hello" etc.. )

          */

         /*
         #Keywords : reserved words by java is known as keywords.
                                     or
                     some words that are reserved for used to some specific task
          ->Ex. : int,float,default,class,public,static etc...
          */

    }}