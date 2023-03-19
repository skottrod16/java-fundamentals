public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 67;
        int englishGrade = 65;
        String language = "Java";

        if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")) {
            System.out.println("Congratulations, you got the scholarship!");
        } else {
            System.out.println("We're sorry, you did not get the scholarship.");
        }

        int credits = 56;
        double GPA = 1.4;
    
        if (credits >= 40 && GPA >= 2.0) {
            System.out.println("You earned your diploma.");
        } else {
            System.out.println("Sorry, you need at least 40 credits and a minimum GPA of 2.0.");
        }
    }

}

/* As long as one comparison is True, the ENTIRE condition is True and the first line of code is executed. Otherwise, if NO comparisions are True, then the ENTIRE condition is FALSE and the else statement is executed. 
*/

// OR Operator || (double pipe); returns TRUE if EITHER comparison is true.
// AND Operator && (double ampersand); returns TRUE if EVERY comparision is true.
//The trick is to evaluate the comparison by first ignoring the '!' operator. Then, reverse the result if '!' precedes the comparison. 