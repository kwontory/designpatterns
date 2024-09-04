package headfirst.designpatterns.strategy.actionadvanture;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new SwordBehavior();
    }
}
