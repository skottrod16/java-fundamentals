public class ReturnValues {
    public static void main(String[] args) {
        double area1 = calculateArea(2.3, 3.6);
        double area2 = calculateArea(1.6, 2.4);
        double area3 = calculateArea(2.6, 4.2); 
    }

    public static double calculateArea(double length, double width) { 
        double area = length * width;
        return area;
    }
    
}

// English "Area equals length * width"

// French "La surface est egale a la longueur * la largeur"

// Spanish "area es igual a largo * ancho"