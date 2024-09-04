package headfirst.designpatterns.strategy.ducks;

public abstract class Duck {
    // 행동 인터페이스 형식의 레퍼런스 변수 선언
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // 생성자
    public Duck () { }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        // 모든 오리는 물에 뜬다.
        System.out.println("I'm swimming duck");
    }

    // * 오리의 행동 형식을 생성자에서 인스턴스를 만드는 방식이 아닌 Duck 서브클래스에서 setter를 호출하는 방법으로 변경
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
