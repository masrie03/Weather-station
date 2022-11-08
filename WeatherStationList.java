import java.util.Scanner;

class WeatherStationList {

    WeatherStation[] stations = new WeatherStation[2];
    public void getNumSensors(){
        WeatherStation ws = new WeatherStation();
        for(int i=0; i<stations.length; i++){
        System.out.println("Enter info for location number " + (i+1));
        ws.readWeatherStationData();
        }
    }
    public int calcMinNumSensors() {
        getNumSensors();
        int min = stations[0].numsensors;
        for (int i=1; i<stations.length; i++) {
            if (min > stations[i].numsensors) {
                min = stations[i].numsensors;
            }
        }
        System.out.println("min sensor " + min);
        return min;
    }
    int calcMaxNumSensors() {
        int max = stations[0].numsensors;
        for (int i=1; i<stations.length; i++) {
            if (max < stations[i].numsensors) {
                max = stations[i].numsensors;
            }
        }
        
        return max;
    }
    float calcAvgNumSensors() {
        float sum = 0;
        for (int i=0; i<stations.length; i++) {
                sum += stations[i].numsensors;
        }    
        float avg = sum / stations.length;    
        return avg;
    }
     void locMenu(){
        Scanner input = new Scanner(System.in);
            System.out.println("(1)Find min num of sensors");
            System.out.println("(2)Find max num of sensors");
            System.out.println("(3)Find avg num of sensors");
            System.out.println("(4)To find weather info");
            System.out.println("(0) Quit ");
            int locChoice = input.nextInt();

            switch(locChoice){
                case 1:
                calcMinNumSensors();
                break;

                case 2:
                calcMaxNumSensors();
                break;

                case 3:
                calcAvgNumSensors();
                break;

                case 4:
                weatherMenu();
                break;

                case 0:
                System.exit(0);
                break;

                default:
                System.out.println("Invalid input");

            }

    }
    

    void weatherMenu(){
        WeatherStation ws = new WeatherStation();
        WeatherList wl = new WeatherList();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("(1) Minimum Weather Data");
            System.out.println("(2) Maximum Weather Data ");
            System.out.println("(3) Average Weather Data ");
            System.out.println("(4) Standard Deviation for Weather ");
            System.out.println("(0) Quit ");

            int choice = input.nextInt();

            switch(choice){
                case 1:
                ws.calcMin();
                break;

                case 2:
                ws.calcMax();
                break;

                case 3:
                ws.calcAvg();
                break;

                case 4:
                ws.calcStdDev();
                break;

                case 0:
                System.exit(0);
                break;

                default:
                System.out.println("Invalid input");

            }
        }
    }

}
