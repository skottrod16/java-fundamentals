import java.util.Scanner;


public class Bank {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String decision = scan.nextLine();
        //Task 2 - Print this if the decision is "yes"
        if(decision.equals("yes")) {
            System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
            double savings = scan.nextDouble();
            double creditCardDebt = scan.nextDouble();
            System.out.println("\nHow many years have you worked?");
            int yearsWorked = scan.nextInt();
            scan.nextLine();
            System.out.println("What is your name?");
            String name = scan.nextLine();

            if (savings >= 10000 && creditCardDebt <= 5000 && yearsWorked > 2) {
                System.out.println("Congratulations " + name + "!" + "You have been approved!");
            } else {
                System.out.println("Sorry, you are not eligible for a morgage with ROYAL BANK OF JAVA.");
            }

        } else {
            System.out.println("\nOK, have a glorious day!");
        }
        
        scan.close();
    }
}