package headfirst.designpatterns.actionadvanture;

public class Troll extends Character{

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
