package headfirst.designpatterns.actionadvanture;

public class King extends Character{
    public King() {
        // 기본 무기 세팅
        weaponBehavior = new KnifeBehavior();
    }
}
