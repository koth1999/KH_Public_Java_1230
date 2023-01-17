package 은행만들기;

import static 은행만들기.Util.KH_SERVER_DOMAIN;

public class BankMain {
    public static void main(String[] args) {
        BankClass kakao = new BankClass("카카오", 1000);
        BankClass shinHan = new BankClass("신한", 1000);
        BankClass nh = new BankClass("농협", 0);
        kakao.setDeposit(12000);
        kakao.setWithdraw(15000);
        kakao.viewAccount();
        System.out.println(BankClass.getCnt());

        System.out.println(Util.getCurrentDate("yyyy년MM월dd일 hh:mm:ss"));
        System.out.println("서버 주소 : "+KH_SERVER_DOMAIN);
    }
}
