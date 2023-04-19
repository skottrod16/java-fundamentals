public class Parameters {
    public static void main(String[] args) {
        calculateArea(2.3, 3.6);
        calculateArea(1.6, 2.4);
        calculateArea(2.6, 4.2); //2.3 and 3.6 are arguments while:
    }

    public static void calculateArea(double length, double width) { //double length and double width are parameters.
        double area = length * width ;
        System.out.println("Area: " + area);
    }
}

/*
 -A parameter stores a value that your function expects to receive.
 -Paraameters are values the function expects to receive. Arguments are the values being passed in. 
 */
