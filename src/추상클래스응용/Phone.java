package 추상클래스응용;

// 추상 클래스 만들기
// 일반필드와 메소드를 포함 할 수 있다.
public abstract class Phone {
    String name;
    boolean isPower;
    Phone(String name){
        this.name = name;
    }
    void setPower(boolean power){
        isPower = power;
        if(isPower){
            System.out.println("Phone Power ON");
        } else{
            System.out.println("Phone Power OFF");
        }
    }
    abstract void call(); // 상속 받은 클래스에서 반드시 오버라이딩해서 기능을 완성해야함

}
