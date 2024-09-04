package headfirst.designpatterns.actionadvanture;

public class FightSimulator {
    public static void main(String[] args) {
        Character troll = new Troll();

        troll.fight(); // 기본 무기
        troll.setWeaponBehavior(new SwordBehavior()); // 무기 변경
        troll.fight(); // 검으로 공격

        // * 라이브러리나 프레임워크가 디자인 패턴인가? No
        // 라이브러리나 프레임워크를 구현하는 과정에서 디자인 패턴을 쓸 수는 있지만,
        // 라이브러리나 프레임워크가 디자인 패턴은 아니다.
        // 라이브러리나 프레임워크는 개발자가 각자의 코드에 링크해서 쓸 수 있는 특정 구현을 제공할 뿐이다.
    }
}
