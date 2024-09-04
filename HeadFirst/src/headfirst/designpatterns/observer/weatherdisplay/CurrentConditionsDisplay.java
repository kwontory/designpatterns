package headfirst.designpatterns.observer.weatherdisplay;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature; // 온도
    private float humidity; // 습도
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData; // 생성 시 weatherData(Subject)를 전달
        weatherData.registerObserver(this); // weatherData(Subject)에 Observer 등록
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display(); // 최신 값으로 갱신 후 화면에 표출
    }

    @Override
    public void display() { // 가장 최근에 받은 온도와 습도 값을 화면에 표시한다.
        System.out.println("Current temperature: " + temperature); // 현재 온도
        System.out.println("Current humidity: " + humidity); // 현재 습도
    }
}
