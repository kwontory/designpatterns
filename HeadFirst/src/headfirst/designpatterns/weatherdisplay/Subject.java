package headfirst.designpatterns.weatherdisplay;

public interface Subject {
    // Subject는 Observer를 등록/삭제할 수 있다.
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    // 변경이 생기면 등록된 Observer들에게 변경 사실을 알린다.
    public void notifyObservers();
}
