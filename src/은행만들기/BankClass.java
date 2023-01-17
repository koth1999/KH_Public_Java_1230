package 은행만들기;

public class BankClass {
    private static int cnt = 0; // 같은 클래스 내에서 접근 가능한 정적 변수(클래스 변수)
    private int account; // 계좌
    private String bank; // 은행의 이름
    public BankClass(String name, int account){
        cnt++; // 클래스가 객체로 만들어 질 때 값이 증가 됨
        this.bank = name;
        this.account = account;
        System.out.println(name+"은행에 계좌를 개설합니다. 잔액은 "+account+"입니다.");
    }
    public static int getCnt(){ // 정적 메소드
        return cnt;
    }
    public void setDeposit(final int dep){
        this.account+=dep;
        System.out.println(dep+"을 예금 했습니다.");
    }
    public void setWithdraw(final int with){
        if(with>account){
            System.out.println("잔액이 부족 합니다.");
        } else{
            account-=with;
        }
    }
    public void viewAccount(){
        System.out.println("현재 잔액은 "+account+"입니다.");
    }
}
