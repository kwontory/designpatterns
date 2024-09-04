package headfirst.designpatterns.strategy.actionadvanture;

public abstract class Character {
    WeaponBehavior weaponBehavior; // composition

    public Character() {
        // 생성자
    }

    // 무기 설정
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    // 공격
    public void fight() {
        weaponBehavior.useWeapon();
    };
}
