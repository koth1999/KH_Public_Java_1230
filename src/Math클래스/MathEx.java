package Math클래스;

import java.util.Random;

// Math 클래스는 수학에서 자주 사용하는 상수들과 메소드를 미리 구현해 놓은 클래스
// Math 클래스의 모든 메소드는 클래스 메소드(static method)이다. 그러므로 객체 생성 불가
// java.lang에 포함된 클래스다.
public class MathEx {
    public static void main(String[] args) {
        // random() : 0.0이상 1.0 미만의 범위에서 임의의 double형 값 중 하나의 임의의 값 생성
        // 예 : 1 ~ 99 사이의 임의의 수 생성
      // for(int i=0; i<100; i++){
      //     System.out.println((int)(Math.random()*100)+1);
      // }

       // 3 ~ 8 임의의 수 구하기
//       System.out.println((int)(Math.random()*6)+3);

       // abs() : 절대값 구하는 메소드, 입력이 음수이면 양수, 양수이면 양수
//       System.out.println(Math.abs(10));
//       System.out.println(Math.abs(-10));
//       System.out.println(Math.abs(-3.14));

       // floor() : 소수점 이하를 날리고 가장 가까운 정수값 출력
       // ceil() : 소수점이 있으면 무조건 올림
       // round() : 반올림
       System.out.println(Math.floor(10.9999));
       System.out.println(Math.floor(10.0001));

       System.out.println(Math.ceil(10.9999));
       System.out.println(Math.ceil(10.0001));

       System.out.println(Math.round(10.9999));
       System.out.println(Math.round(10.0001));

       // min() : 전달된 두 값 중 작은 값 출력
       // max() : 전달된 두 값 중 큰 값 출력
       System.out.println(Math.max(10,12));
       System.out.println(Math.min(10,5));



    }
}
