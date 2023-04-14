public class Calendar {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        String day = "Friday"; //Can be any day. This is the day my friend wants to hangout. 
        System.out.println("Hey, are you free on " + day + "? \n");
        System.out.println("Hmm, let me check my calendar.");
        
        //Check 'calendar' here:      
        switch (day) {
            case "Monday": System.out.println("Sorry, I have to stay at work late."); break;
            case "Tuesday": System.out.println("It looks like I have meetings all day."); break;
            case "Wednesday": System.out.println("I have a brow appointment. Another day!"); break;
            case "Thursday": System.out.println("Sorry, Thursday is a date night with my boyfriend!"); break;
            case "Friday": System.out.println("I'm Free!"); break;
            case "Saturday": System.out.println("I'm free!"); break;
            case "Sunday": System.out.println("I'm free!"); break;
            default: System.out.println("That is not a day, lol");
        }
        

    }
}
