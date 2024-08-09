package in.LabhCding;

import java.util.Scanner; //in java package util file is there and in this Scanner class is there so functionality or classs is import here

class Packages{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*why package import ? -> when we counter big project then we have many classes have same name so maintain that is very hard so we use package
                               ->to access predefined classes
        ->for make packages use unique id like phone number or company domain etc...

                               */
        in.LabhGate.Packages pk=new in.LabhGate.Packages();
        //we can use if and only Packages class is public
        //packages means folder create in file directory
        //we can import interface , all classes(import java.util.Scanner)
        //Types of import:1) single class (import java.util.Scanner) 2)On demand import (import java.util.*;)
        //package java.lang by default imported
        //types of packages : 1)built in(defined by java) and user defined(made by user)


    }

}
