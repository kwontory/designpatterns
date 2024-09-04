package headfirst.designpatterns.observer.weatherdisplay;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject { // 클라이언트가 제공한 클래스
    private List<Observer> observers; // observer 리스트
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>(); // 생성자에서 observer 객체 생성
    }

    public void registerObserver(Observer observer) {
        observers.add(observer); // observer 등록
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers) { // 모든 observer에 최신 측정값 전달..
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() { // 측정값이 변하면 해당 함수가 호출된다.
        notifyObservers(); // 모든 observer에 측정값 전달
    }

    // 기상 스테이션을 대신할 method
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // 기타 WeatherData Method
}
