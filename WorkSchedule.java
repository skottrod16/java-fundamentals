public class WorkSchedule {
    public static void main(String[] args) {
        //Assume that day can be any value between 1 (Monday) and 7 (Sunday). 
        //There's also a boolean variable: holiday.
        int day = 3;
        boolean holiday = true;

        if (holiday) {
            System.out.println("Whoo hoo! No work!");
        } else if (day == 6 || day == 7) {
            System.out.println("It is the weekend, no work!");
        } else {
            System.out.println("Wake up at 7AM! :( )");
        }
    }
}
