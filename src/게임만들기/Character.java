package 게임만들기;

public class Character extends Unit implements GameAction {
    // name : 캐릭터 이름
    // pP : 물리힘
    // mP : 마법힘
    // pH : 물리적중률
    // mH : 마법적중률
    // ultra : 특수기술에 대한 공격력
    // hp : 체력
    public Character(String name, int pP, int mP, double pH, double mH, int ultra, int hP) {
        this.name = name;
        this.pPower = pP;
        this.mPower = mP;
        this.pHit = pH;
        this.mHit = mH;
        this.ultraPower = ultra;
        this.hP = hP;
    }

    @Override
    public double pAttack() { // 물리 공격에 대한 기능 구현
        return pPower * pHit;
    }

    @Override
    public double mAttack() { // 마법 공격에 대한 기능 구현
        return mPower * mHit;
    }

    @Override
    public int ultimate() { // 궁극기
        return ultraPower;
    }

    @Override
    public boolean setDamage(double damage) {
        if (hP > damage) {
            hP -= damage;
            System.out.println("남아 있는 "+name+"의 체력은 "+hP+"입니다.");
            return false; // 캐릭터가 살아있음
        } else{
            System.out.println(name+"이 죽었습니다. 게임을 종료 합니다.");
            return true;
        }
    }
}
