public class BooleanComparisons {
    public static void main(String args[]) {
        //Greater than & less than comparisons; switch the signs to see them output. 
        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;

        System.out.println(chemistryGrade != englishGrade);
        System.out.println(biologyGrade != englishGrade);

        String sentence = "I love this course!";
        String sentence2 = "I love this course!";
        System.out.println(sentence.equals(sentence2));

        String sentence3 = "I love coding in Java!";
        String sentence4 = "I love coding in Java!";
        System.out.println(!sentence3.equals(sentence4));

    }
    
}
