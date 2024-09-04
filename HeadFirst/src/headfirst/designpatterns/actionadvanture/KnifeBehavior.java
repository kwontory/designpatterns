package headfirst.designpatterns.actionadvanture;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Knife Behavior");
    }
}
