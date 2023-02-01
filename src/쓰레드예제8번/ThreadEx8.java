package 쓰레드예제8번;

public class ThreadEx8 {
    public static void main(String[] args) {
        ShareThread shareThread = new ShareThread();
        Thread thread = new Thread(){
            @Override
            public void run() {
                shareThread.setValue(30);
            }
        };
        thread.setName("쓰레드 0");
        thread.start();

        Thread thread1 = new Thread(() ->{
            shareThread.setValue(100);
        });
        Thread thread2 = new Thread(() ->{
            shareThread.setValue(10);
        });

        thread1.setName("쓰레드 1");
        thread2.setName("쓰레드 2");
        thread1.start();
        thread2.start();
    }
}

class ShareThread {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){}
        System.out.println(Thread.currentThread().getName()+"의 Value 값은 "+this.value+"입니다.");
    }
}