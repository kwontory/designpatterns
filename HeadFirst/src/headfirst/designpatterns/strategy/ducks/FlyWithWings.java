package headfirst.designpatterns.strategy.ducks;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with Wings!");
    }
}
