package headfirst.designpatterns.observer.weatherdisplay;

public class DisplayTest {
    public static void main(String[] args) {
        // 옵저버 패턴(Observer Patterns)
        // 느슨한 결합(Loose Coupling)
        // 일대다 관계
        // < 디자인 원칙 >
        // 상호작용하는 객체 사이에는 가능하면 느슨한 결합을 사용해야 한다.

        // weatherData 객체 생성
        WeatherData weatherData = new WeatherData();

        // display 객체 생성
        // 현재 상태 디스플레이
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        // 기상 통계 디스플레이
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        // 측정값 변경
        weatherData.setMeasurements(10.0f,10.0f, 10.0f);
        weatherData.setMeasurements(15.0f,10.0f, 12.0f);
        weatherData.setMeasurements(10.0f,20.0f, 12.0f);

    }
}
