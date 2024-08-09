package Inheritance;

public class No_8_7and8_TypesOfInheritance {
    public static void main(String[] args) {
        /*
        #TYPES:

        1. simple inheritance : one child and one parent
        2. multi level inheritance : one parent -> child 1 ->child 2
        3. hierarchical inheritance : one parent -> multiple children
        4. Multiple inheritance : many parents and one child (parent of 1 and 2 -> child 1)
                                                                     |
                                                                   child 2
        -multiple inheritance not possible in java because diamond problem occurs
       -diamond problem :         ->child B
                        parent A ->         ->child c
                                  ->child C
        in this case child c inheritance same name functions and properties so it confuse which i take or not
        -> multiple inheritance not allowed in normal class but we can implement by using interface

             */

        /*
        topic 8.8 object class in notes
         */
    }
}
