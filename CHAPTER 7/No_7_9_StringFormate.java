public class No_7_9_StringFormate {

    public static void main(String[] args) {
        String name = "Labh";
        int marks=99;
        System.out.println("HELLO "+name+" Your marks are :"+marks);
        //in this case many string make for each + diffrent string make

        //formate
        System.out.printf("Hello %s,Your marks are %d",name,marks);
        //in this method multiple string npt create so memory efficiency increase
        //see notes further detail
    }
}
