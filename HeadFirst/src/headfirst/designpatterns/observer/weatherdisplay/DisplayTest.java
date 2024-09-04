package headfirst.designpatterns.observer.weatherdisplay;

public class DisplayTest {
    public static void main(String[] args) {
        /*
         * 객체지향 기초
         * 추상화, 캡슐화, 다형성, 상속
         */

        /*
         * 디자인 원칙
         * 1. 바뀌는 부분은 캡슐화 한다.
         * 2. 상속보다는 구성을 활용한다.
         * 3. 구현보다는 인터페이스에 맞춰서 프로그래밍한다.(상위 레벨에 맞춰서 프로그래밍한다.)
         * 4. 상호작용하는 객체 사이에는 가능하면 느슨한 결합을 사용한다.
         */

        /*
         * 전략 패턴(Strategy Pattern)
         * 알고리즘군 -> 캡슐화
         */

        /*
         * 옵저버 패턴(Observer Pattern)
         * 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 가고
         * 자동으로 내용이 갱신되는 방식으로 일대다(One to Many) 의존성을 정의한다.
         */

        /*
         * Push & Pull
         * Push: 주제(Subject)가 데이터를 보냄
         * Pull: 옵저버(Observer)가 데이터를 가져옴
         * Pull 방식을 좀더 바람직하다.
         */

        // 느슨한 결합(Loose Coupling)
        // 일대다(One to Many) 관계
        // < 디자인 원칙 >
        // 상호작용하는 객체 사이에는 가능하면 느슨한 결합을 사용해야 한다.

        // weatherData 객체 생성
        WeatherData weatherData = new WeatherData();

        // display 객체 생성
        // 현재 상태 디스플레이
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        // 기상 통계 디스플레이
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        // 기상 예보 디스플레이
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // 측정값 변경
        weatherData.setMeasurements(10.0f,10.0f, 10.0f);
        weatherData.setMeasurements(15.0f,10.0f, 12.0f);
        weatherData.setMeasurements(10.0f,20.0f, 12.0f);

    }
}
