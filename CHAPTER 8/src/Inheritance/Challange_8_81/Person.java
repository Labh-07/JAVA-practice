package Inheritance.Challange_8_81;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    protected Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        else if(!(obj instanceof Person)){
            return false;
        }

        Person p = (Person) obj;

        return p.name.equals(name) && p.age==age;
    }

    @Override
    public int hashCode(){

        return Objects.hash(name,age);
    }
}
