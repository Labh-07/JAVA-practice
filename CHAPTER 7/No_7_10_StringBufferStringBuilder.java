public class No_7_10_StringBufferStringBuilder {
    public static void main(String[] args) {
        //mostly used string builder

        StringBuilder sb=new StringBuilder("First");
        sb.append(45);
        sb.append(", now this is the").append(45);
        sb.append(76.45);
        System.out.println(sb);

    }
}
