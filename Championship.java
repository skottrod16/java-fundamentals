public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points
        int margin = (gryffindor - ravenclaw);
    
        // int margin = amount of points by which gryffindor scored over ravenclaw;
        
        if (gryffindor >= 300) {
            System.out.println("Gryffindor takes the house cup!");
        } else if (gryffindor >= 200) {
            System.out.println("In second place, Gryffindor!");
        } else if (gryffindor <= 100) { 
            System.out.println("In thrid place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }
    }
}
