package headfirst.designpatterns.strategy.ducks;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        // 오리 행동을 생성자에서 설정
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        // 오리 행동을 실행 시에 setter로 변경
        Duck model = new ModelDuck();
        model.performFly(); // 모형 오리는 날 수 없어.
        model.setFlyBehavior(new FlyRocketPowered()); // 로켓 추진력으로 날도록 설정
        model.performFly(); // 모형 오리는 로켓 추진력으로 날 수 있어.

        // 클래스 다이어그램 각 화살표와 클래스들이 어떤 관계인지 생각해보자.
        // 1. A는 B이다. -> 상속
        // 2. A에는 B가 있다. -> 구성(Composition)
        // 3. A가 B를 구현한다 -> 구현

        // 오리가 하는 행동(날아다닌다던지, 소리를 낸다던지..) -> family of algorithm 알고리즘군이다.
        // 통계에서처럼 군이라고 생각하는게 더 이해가 잘 되는 거 같기도..

        // < 디자인 원칙 >
        // 1. 애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분과 분리한다.
        // 2. 구현보다는 인터페이스에 맞춰서 프로그래밍 한다.
        // 3. 상속보다는 구성을 활용한다.

        // < 전략 패턴(Strategy Pattern) >
        // 알고리즘군을 정의(오리의 행동)하고 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있게 해준다.
        // 전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있다.
    }
}
