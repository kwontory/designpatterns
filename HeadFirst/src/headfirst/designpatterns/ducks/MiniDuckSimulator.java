package headfirst.designpatterns.ducks;

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
    }
}
