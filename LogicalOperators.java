public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 67;
        int englishGrade = 65;

        if (chemistryGrade > 75 || englishGrade > 75) {
            System.out.println("Congratulations, you got the scholarship!");
        } else {
            System.out.println("We're sorry, you did not get the scholarship.");
        }
    }
}

/* As long as one comparison is True, the ENTIRE condition is True and the first line of code is executed. Otherwise, if NO comparisions are True, then the ENTIRE condition is FALSE and the else statement is executed. 
*/