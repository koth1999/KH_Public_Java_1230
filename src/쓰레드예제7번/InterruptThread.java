package 쓰레드예제7번;

public class InterruptThread extends Thread{
    @Override
    public void run(){
        try{
            while(true){
                System.out.println("쓰레드 실행 중....");
                Thread.sleep(1); // sleep이 추가 되어 있다
            }
        } catch(InterruptedException e){
            System.out.println("인터럽트가 발생해서 쓰레드가 종료됨...");
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
