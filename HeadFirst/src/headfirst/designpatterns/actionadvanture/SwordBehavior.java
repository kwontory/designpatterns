package headfirst.designpatterns.actionadvanture;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Sword behaviour");
    }
}
