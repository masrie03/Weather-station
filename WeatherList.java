 import java.lang.Math;
 class WeatherList {
    
    public String location;
    public String reportingBody;
    public int numSensors;


    Weather[] readings = new Weather[60];
    public void readWeather(){
        for(int i = 0; i<60; i++){
            readings[i] = new Weather();
            readings[i].generate();
           }      
    }
    
    public float mintemp(){
        readWeather();
        float Mintemp = readings[0].getTemperature();
        for (int i=0; i<readings.length; i++) {
         
            if (Mintemp > readings[i].getTemperature()) {
                Mintemp = readings[i].getTemperature();
            }
            
        } 

        return Mintemp;
    }
    public float minwind(){
        readWeather();
        float minWind = readings[0].getWind();
       for (int i=0; i<60; i++) {
        
        if (minWind > readings[i].getWind()) {
            minWind = readings[i].getWind();
        }
    }
        return minWind;
    }    
    public float minhumidity(){
        readWeather();
        float minHumidity = readings[0].getHumidity();
        for (int i=0; i<60; i++) {
         
         if (minHumidity > readings[i].getHumidity()) {
            minHumidity = readings[i].getHumidity();
         }
     }
     return minHumidity;      
    }    

    public float minprecepitation(){
        readWeather();
        float minPrecipitation = readings[0].getPrecepitation();
        for (int i=0; i<60; i++) {
         
         if (minPrecipitation > readings[i].getPrecepitation()) {
             minPrecipitation = readings[i].getPrecepitation();
         }
       }
       return minPrecipitation;
    }  

    public float maxtemp(){
        readWeather();
        float maxTemp = readings[0].getTemperature();
        for (int i=0; i<readings.length; i++) {
         
            if (maxTemp < readings[i].getTemperature()) {
                maxTemp = readings[i].getTemperature();
            }
            
        } 
        return maxTemp;
    }
    public float maxwind(){
        readWeather();
        float maxWind = readings[0].getWind();
        for (int i=0; i<readings.length; i++) {
         
            if (maxWind < readings[i].getWind()) {
                maxWind = readings[i].getWind();
            }
        } 
        return maxWind;
    }
    public float maxhumidity(){
        readWeather();
        float maxHumidity = readings[0].getHumidity();
        for (int i=0; i<readings.length; i++) {
         
            if (maxHumidity < readings[i].getHumidity()) {
                maxHumidity = readings[i].getHumidity();
            }
        } 
        return maxHumidity;
    }
    public float maxprecipitation(){
        readWeather();
        float maxPrecipitation = readings[0].getPrecepitation();
        for (int i=0; i<readings.length; i++) {
         
            if (maxPrecipitation < readings[i].getPrecepitation()) {
                maxPrecipitation = readings[i].getPrecepitation();
            }
        } 
        return maxPrecipitation;
    }
    public float avgTemp(){
        readWeather();
        float sum = 0;
        for(int i=0; i<readings.length; i++){
            sum += readings[i].getTemperature();
        }
        float avgTemp = sum / readings.length;
        return avgTemp;
    }

    public float avgWind(){
        readWeather();
        float sum =0;
        for(int i=0; i<readings.length; i++){
            sum += readings[i].getWind();
        }
        float avgWind = sum / readings.length;
        return avgWind;
    }
    public float avgHumidity(){
        readWeather();
        float sum =0;
        for(int i=0; i<readings.length; i++){
            sum += readings[i].getHumidity();
        }
        float avgHumidity = sum / readings.length;
        return avgHumidity;
    }
    public float avgPrecipitation(){
        readWeather();
        float sum =0;
        for(int i=0; i<readings.length; i++){
            sum += readings[i].getPrecepitation();
            readings[i].display();
        }
        float avgPrecipitation = sum / readings.length;
        return avgPrecipitation;
    }
    public double stdDevTemp(){
        readWeather();
        float avgPrecipitation;
        double numerator =0;
        for(int i=0; i<readings.length; i++){
            numerator += Math.pow(readings[i].getTemperature(),2);
        }
        double stdDevTemp = Math.sqrt(numerator / readings.length);
        return stdDevTemp;
    }
    public double stdDevWind(){
        readWeather();
        double numerator =0;
        for(int i=0; i<readings.length; i++){
            numerator += Math.pow(readings[i].getWind(),2);
        }
        double stdDevWind = Math.sqrt(numerator / readings.length);
        return stdDevWind;
    }
    public double stdDevHumidity(){
        readWeather();
        double numerator =0;
        for(int i=0; i<readings.length; i++){
            numerator += Math.pow(readings[i].getHumidity(),2);
        }
        double stdDevHumidity = Math.sqrt(numerator / readings.length);
        return stdDevHumidity;
    }
    public double stdDevPrecipitation(){
        readWeather();
        double numerator =0;
        for(int i=0; i<readings.length; i++){
            numerator += Math.pow(readings[i].getPrecepitation(),2);
        }
        double stdDevPrecipitation = Math.sqrt(numerator / readings.length);
        return stdDevPrecipitation;
    }
    public void display(){
        System.out.println("Mintemp: " + mintemp());
        System.out.println("Maxtemp: " + maxtemp());
        System.out.println("MinWind: " + minwind() );
        System.out.println("MaxWind: " + maxwind() );
        System.out.println("MinHumidity: " + minhumidity() );
        System.out.println("MaxHumidity: " + maxhumidity() );
        System.out.println("MinPrecipitation: " + minprecepitation() );
        System.out.println("MaxPrecipitation: " + maxprecipitation() );
        System.out.println("Average temperature: " + avgTemp() );
        System.out.println("Average wind: " + avgWind() );
        System.out.println("Average precepitation: " + avgPrecipitation() );
        System.out.println("Average temperature: " + avgHumidity() );
        System.out.println("SD for temp " + stdDevTemp());
        System.out.println("SD for wind " + stdDevWind());
        System.out.println("SD for humidity " + stdDevHumidity());
        System.out.println("SD for precepitation " + stdDevPrecipitation());
    }
public static void main(String[] args){
    WeatherList newWeatherList = new WeatherList();
    newWeatherList.display();
     
}
}
