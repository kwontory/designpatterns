package headfirst.designpatterns.actionadvanture;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new SwordBehavior();
    }
}
