package headfirst.designpatterns.actionadvanture;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Bow and Arrow Behavior");
    }
}
