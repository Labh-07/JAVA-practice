package Polymorphism;

public class Overloading {

    public int add(int a , int b){
        return a+b;
    }

    public double add(int a , int b , int c, int d){
        return a+b+c+d;
    }

    public String add(String a , String b){
        return a+b;
    }

    public static void main(String[] args) {
        Overloading overload=new Overloading();

        System.out.println(overload.add(5,4));  //call first sum
        System.out.println(overload.add(2,3,4,5));  //(csting occurs)call second sum
        System.out.println("1"+"2");
        //compile time polimorphism
        //same for constructor implement
    }
}
