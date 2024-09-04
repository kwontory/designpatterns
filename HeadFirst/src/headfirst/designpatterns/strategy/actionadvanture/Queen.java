package headfirst.designpatterns.strategy.actionadvanture;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
