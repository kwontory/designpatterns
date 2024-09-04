package headfirst.designpatterns.strategy.actionadvanture;

public class Troll extends Character{

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
