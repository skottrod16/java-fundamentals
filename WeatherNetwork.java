public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int temp = 25;  

        String forecast;
        //IF - ELSE IF - ELSE STATEMENTS HERE!
        if(temp <= -1){
            forecast = "It is FREEZING! Stay home!";
        } else if (temp <= 10) {
            forecast = "The forecast is chilly. Wear a coat!";
        } else {
            forecast = "It is warm outside. Enjoy the beautiful day!";
        }
        
        System.out.println(forecast);
    }
}
