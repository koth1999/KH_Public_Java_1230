package Math클래스;

import java.util.Random;

// Math 클래스는 수학에서 자주 사용하는 상수들과 메소드를 미리 구현해 놓은 클래스
// Math 클래스의 모든 메소드는 클래스 메소드(static method)이다. 그러므로 객체 생성 불가
// java.lang에 포함된 클래스다.
public class MathEx {
    public static void main(String[] args) {
        // random() : 0.0이상 1.0 미만의 범위에서 임의의 double형 값 중 하나의 임의의 값 생성
        // 예 : 1 ~ 99 사이의 임의의 수 생성
       for(int i=0; i<100; i++){
           System.out.println((int)(Math.random()*100)+1);
       }

       //Random ran = new Random();
       //System.out.println(ran.nextInt(100)); // 0 ~ 99
    }
}
