package Inheritance;

import java.util.Objects;

public class No_8_9_person {

        private String name;
        private int age;
        private String id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    public No_8_9_person(String name, int age, String id) {
            this.name = name;
            this.age = age;
            this.id = id;
        }

        @Override
        public String toString() {
            return "person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", id='" + id + '\'' +
                    '}';
        }

    @Override
    public boolean equals(Object obj) {
       // return super.equals(obj); //super for parent object class
        if(!(obj instanceof No_8_9_person)){  //child and parent have diffrent objects
            return false;
        }
        No_8_9_person per=(No_8_9_person) obj;
        return per.name.equals((name)) && per.age==age && per.id==id;
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        //return age;  //here we compare age
        return Objects.hash(name,age,id);
    }
}
