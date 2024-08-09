public class Challange_StringBuilder {

    public static void main(String[] args) {
        String[] arr=new String[] {"labh","Patel","shaileshbhai"}; //here we have three component and its first two component make one string after another string make string
        //for build one string

        StringBuilder sb=new StringBuilder();
        for(String str : arr){
            sb.append(str).append(" ");
        }
        System.out.println(sb);

    }
}
