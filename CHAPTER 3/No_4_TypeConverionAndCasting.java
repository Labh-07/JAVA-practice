public class No_4_TypeConverionAndCasting {
    public static void main(String[] args) {
        /*Type conversion : convert one type of data into other type.
        There are two types : 1)Automatic Type Conversion (Widening - implicit) /coercion
                              -byte -> short -> int -> long -> float -> double  /casting

                              2)Narrowing (explicit):
                              -double -> float -> long -> int -> short -> byte
        */

        float myFloat=5;
        System.out.println(myFloat); //here container (variable space)is big and value is small so this is not generate the error
        //when implicit conversion do then it automatically convert

        //int price=99.99f;  -> here big value is try to store in small variable(small)
        //for doing above conversion we should do manual (explicit) :
        int price=(int)99.99f;  //price print only 99 , after decimal all data loss
        System.out.println(price);




    }
}
