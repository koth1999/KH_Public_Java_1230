package 게임만들기;

// 전사관점의 쓰레드
public class GameThA extends Thread {
    private Character warrior;
    private Character wizard;

    public GameThA(Character warrior, Character wizard) {
        this.warrior = warrior;
        this.wizard = wizard;
    }

    @Override
    public void run(){
        int normal; // 일반 공격에 대한 확률 구하기
        int special; // 특수 공격에 대한 확률 구하기
        boolean endGame = false; // 게임의 진행 여부를 판단하는 플래그

        while(true){
            try{
                sleep(3000); // 게임의 진행 속도를 맞추기 위해서
                normal = (int)(Math.random()*2); // 0, 1의 값이 만들어짐(50%확률)
                special = (int)(Math.random()*20); // 5%의 확률로 궁극기 공격
                if(normal == 1){
                    System.out.println("물리공격 : "+wizard.name+"에게"+
                            warrior.pAttack()+" 데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.pAttack());
                } else {
                    System.out.println("마법공격 : "+wizard.name+"에게"+
                            warrior.mAttack()+" 데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.mAttack());
                }
                if(special == 10){ // 5%확률로 발동됨
                    System.out.println(warrior.name+" 궁극기 발동!!!, "+
                            wizard.name+"에게"+warrior.ultimate()+" 데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.ultimate());
                }
                if(endGame) System.exit(0);

            } catch(InterruptedException e ){}

        }
    }
}
