import java.util.Random; // we want to make use of an existing class - Random

public class Weather { // a class consists of data + operation
    // data
    private float temperature;
    private float wind;
    private float humidity;
    private float precipitation;
    
    //methods or operation : must be tightly coupled to the data

	//constructor - no return type, name same as the class, used to initialized object

    public void generate() {
		Random rand = new Random();
		temperature = rand.nextFloat() * (45 - 20) + 20; 
		wind = rand.nextFloat() * (20); 
        humidity = rand.nextFloat() * (50) ;
        precipitation = rand.nextFloat() * (100) ;
	
    }
  
	public void display() {
		System.out.println("temperature: " + temperature);
		System.out.println("humidity: " + humidity);
		System.out.println("wind: " + wind);
		System.out.println("precipitation: " + precipitation);
	}

	// getter for private attributes
	public float getTemperature(){
		return temperature;
	}

	public float getHumidity(){
		return humidity;
	}

	public float getWind(){
		return wind;
	}

	public float getPrecepitation(){
		return precipitation;
	}

	//setter for private attributes
	public void setTemperature(float newTemperature){
		if(temperature >50){
			System.out.println("error");
			return;
		}
		this.temperature = newTemperature;
	}

	public void setHumidity(float humid){
		if(humid >50){
			System.out.println("error");
			return;
		}
		this.humidity = humid;
	}

	public void setWind(float wind){
		if(wind >20){
			System.out.println("error");
			return;
		}
		this.wind = wind;
	}

	public void setPrecipitation(float preci){
		if(preci > 100){
			System.out.println("error");
			return;
		}
		precipitation = preci;
	}
  
	public static void main(String args[]) {
      // class  object/instance
		Weather weather = new Weather();
		weather.generate();
		System.out.println("Created a weather object: " + weather);
		weather.display();    
		
		// create an array of 60 weather
		Weather[] readings = new Weather[60]; 
		for (int i=0; i<readings.length; i++) {
			//initialization all temperature to zero
			//dont send like this, attribute can change
			//try to make code evolvable
            readings[i] = new Weather();
			readings[i].generate();
			System.out.println("Temperature gen at index : " + i + " is : "+ readings[i].getTemperature());
            readings[i].display();

			}
	}
	

}