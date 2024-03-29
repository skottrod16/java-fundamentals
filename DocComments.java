public class DocComments {
    public static void main(String[] args) {

    }


    /** 
     * Method name: greet
     * 
     * Inside the function:
     *  1. prints: 'Hi'
    */

    public static void greet() {
        System.out.println("Hi");
    }

    /**
     * Method name: printText
     * @param name (String)
     * @param age (String)
     * 
     * 
     * Inside the method:
     *  1. prints the name and age as part of a text
     * 
     */
    public static void printText(String name, String age) {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }



    /**
     * Method name: calculateArea
     * 
     * @param length (double)
     * @param width (double)
     * @return (double)
     * 
     * Inside the function: 
     *  1. this method calculates the area and returns it. 
     */
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
}


 //When you write / ** (together of course), Java creates a format and all you have to do is write the method name, give a small description and write the type in parentheses. 