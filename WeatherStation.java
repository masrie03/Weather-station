import java.util.Scanner;
public class WeatherStation {
    // data
    String reportingbody;
    int numsensors;
    
    WeatherList weatherData = new WeatherList();
    void readWeatherStationData() {
        Scanner input = new Scanner(System.in);
        // read in data for each weather station
        System.out.println("Enter location name: ");
        String locationName = input.nextLine();

        System.out.println("Enter how many sensors");
        int numsensors = input.nextInt();

    }    
    void calcMin() {
        System.out.println("Minimum Temperature = " + weatherData.mintemp()) ;
        System.out.println("Minimum Wind Speed = " + weatherData.minwind() ) ;
        System.out.println("Minimum Wind Speed = " + weatherData.minhumidity() ) ;
        System.out.println("Minimum Wind Speed = " + weatherData.minprecepitation() ) ;
    }
    
    void calcMax() {
        System.out.println("Maximum Temp = " + weatherData.maxtemp() ) ;
        System.out.println("Maximum Wind Speed = " + weatherData.maxwind() ) ;
        System.out.println("Maximum Humidity = " + weatherData.maxhumidity() ) ;
        System.out.println("Maximum Precipitation = " + weatherData.maxprecipitation() ) ;
    }
    
    void calcAvg() {
        
        System.out.println("Average temp: " + weatherData.maxtemp());
        System.out.println("Average wind: " + weatherData.maxwind() );
        System.out.println("Average humidity: " + weatherData.maxhumidity() );
        System.out.println("Average precepitation: " + weatherData.maxprecipitation() );
    }
    
    void calcStdDev() {
        System.out.println("SD for temp " + weatherData.stdDevTemp());
        System.out.println("SD for wind " + weatherData.stdDevWind());
        System.out.println("SD for humidity " + weatherData.stdDevHumidity());
        System.out.println("SD for precepitation " + weatherData.stdDevPrecipitation());
    }
}
