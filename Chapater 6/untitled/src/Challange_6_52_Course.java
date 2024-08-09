
class Course {

    //properties:

    static int counterStudentId=0;
    static int maxCapacity=2;
    String courseName;
    int enrolledStudents;
    int unenrolledStudents;
    boolean isEnrolled;
    String[] nameOfStudent=new String[maxCapacity];

    {
        enrolledStudents=0;
        unenrolledStudents=0;
    }
    Course(String name){
        this.courseName=name;
    }

    static void setMaxCapacity(int capacity){
        maxCapacity=capacity;
        //here create a new array and copy all element of old array

    }

    void EnrollStudent(String studentName){
        if(maxCapacity<=this.enrolledStudents){
            if(unenrolledStudents!=0){
                System.out.println("Meet administration office for the enroll");
            }
            else{
            System.out.println("sorry batch is full !");
            }
        }
        else{
            nameOfStudent[counterStudentId]=studentName;
            counterStudentId++;
            System.out.println(studentName+" is successfully enrolled in the course "+this.courseName+" , Your id is :"+counterStudentId+" , best of luck :)");
            this.enrolledStudents++;
        }
    }

    void unenrolledStudent(String name,int id){
        if(nameOfStudent[(id-1)]==name){
            System.out.println(nameOfStudent[(id-1)]+" is successfully removed from the course , hope you gain your knowledge :)");
            this.unenrolledStudents++;
            nameOfStudent[(id-1)]="Null";
        }
        else{
            System.out.println("Something went wrong !!!!");
        }
    }

    public static void main(String[] args) {
        Course java=new Course("java");
        Course os=new Course("os");

        java.EnrollStudent("Labh");
        java.EnrollStudent("Druvi");
        java.EnrollStudent("Bhagy");

        java.unenrolledStudent("Labh",1);
        java.EnrollStudent("Bhagy");

        System.out.println(java.nameOfStudent[0]); //here print null because we removed labh

    }
}
