package headfirst.designpatterns.strategy.ducks;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("FlyRocketPowered");
    }
}
