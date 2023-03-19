public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 78;
        int englishGrade = 65;

        if (chemistryGrade > 75 || englishGrade > 75) {
            System.out.println("Congratulations, you got the scholarship!");
        } else {
            System.out.println("We're sorry, you did not get the scholarship.");
        }
    }
}
