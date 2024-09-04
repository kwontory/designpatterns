package headfirst.designpatterns.observer.weatherdisplay;

public class StatisticsDisplay implements Observer, DisplayElement{
    // 최소, 최대, 평균 온도를 표출
    private float temperature;
    private float minTemp;
    private float maxTemp;
    private float totTemp;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData; // 생성 시 주제를 등록
        weatherData.registerObserver(this); // 해당 주제에 옵저버로 등록
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        // 온도 갱신
        this.temperature = temp;
        this.totTemp += temp;
        numReadings++;

        // 최대, 최소 갱신
        if (temp > maxTemp) {
            maxTemp = temp;
        }
        if (temp < minTemp) {
            minTemp = temp;
        }

        // 화면 표시
        display();
    }

    @Override
    public void display() { // 화면 표시
        System.out.println("Temperature: " + temperature);
        System.out.println("MinTemp: " + minTemp);
        System.out.println("MaxTemp: " + maxTemp);
        System.out.println("AvgTemp: " + (totTemp / numReadings));
    }

}
