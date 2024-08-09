class Student{

    String name;
    int age;

    Student(String name , int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
//        return super.toString();
        return "NAME :"+name+
                "\nAge :"+age;
    }

    public static void main(String[] args) {
        Student s1=new Student("LABH",19);
        System.out.println(s1);
    }
}
