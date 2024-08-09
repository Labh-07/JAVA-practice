class Challange_7_56_ScoreChecker {
    public static void main(String[] args) {
        //problem 57 , 58 is very easy
        //problem 56 :
        int score=90;

        String result = score >80 ? "High Score" : (score<50 ? "Low" : "Moderate") ;
        System.out.println(result);
    }
}
