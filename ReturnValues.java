public class ReturnValues {
    public static void main(String[] args) {
        double area1 = calculateArea(2.3, 3.6);
        printArea(2.3, 3.6, area1);
        // double area2 = calculateArea(1.6, 2.4);
        // double area3 = calculateArea(2.6, 4.2); 

        // calculateArea(-5, 2.3);

        String englishExplanation = explainArea("English");
        System.out.println(englishExplanation);
        // String frenchExplanation = explainArea("French");
        // String spanishExplanation = explainArea("Spanish");
        // String italianExplanation = explainArea("Italian");
    }
    //calculateArea returns a double when called.
    public static double calculateArea(double length, double width) { 
        if (length < 0 || width < 0) {
            System.out.println("INVALID DIMENSIONS");
            System.exit(0);
        }
        double area = length * width;
        return area;
    }
    //explainArea returns a String when called.
    public static String explainArea(String language) {
        
        switch (language) {
            case "English": return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * ancho";
            default: return "Language not available";
        }
    }
    
    public static void printArea(double length, double width, double area) {
        System.out.println("A rectangle with a length of " + length + " and a width of " + width + " has an area of " + area + ".");
    }
}


//A method should only be performing a single task because it can be doing so much work that it should not be handling the final result. 
/*The function printArea's only task is to print the area, it is not performing any computations or calculations, we cannot expect it to return 
    any values so that is why it remains void as to "String" or "double" that come after "public static ..." in the method. */
//Void means a method does not return a value.     