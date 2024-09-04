package headfirst.designpatterns.strategy.actionadvanture;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Axe Behavior");
    }
}
