package headfirst.designpatterns.strategy.actionadvanture;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Sword behaviour");
    }
}
