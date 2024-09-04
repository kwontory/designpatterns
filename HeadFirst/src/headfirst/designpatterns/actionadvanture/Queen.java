package headfirst.designpatterns.actionadvanture;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
