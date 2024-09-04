package headfirst.designpatterns.observer.weatherdisplay;

public interface Observer {
    // Observer 인터페이스는 모든 Observer 클래스에서 구현해야 한다.
    // 온도, 습도, 기압이 변경되면 업데이트
    // Pull 방식: 주제 -> 옵저버
    // public void update(float temp, float humidity, float pressure);

    // Push 방식
    public void update();
}
