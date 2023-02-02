package 게임만들기;

// 실제 기능 구현은 하지 않고, 동작에 대한 정의를 담당 즉, 실제 메소드의 구현은 상속 받은 클래스에서 해주어야 함
public interface GameAction {
    double pAttack(); // 물리 공격에 대한 정의
    double mAttack(); // 마법 공격에 대한 정의
    int ultimate(); // 궁극기로 입히는 공격량
    boolean setDamage(double damage); // 피해를 받는량을 입력받아서 현재 체력보다 크면 true 반환
}
