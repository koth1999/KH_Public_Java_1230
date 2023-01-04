package 변수와데이터;

// 클래스 이름은 파일이름과 동일해야함
// 실수는 소수점이하 값이 존재하고 기본은 double형(8byte)이 기본
public class DataType {
    public static void main(String[] args) {//접근제한자/정적변수/반환타입/main()
         int num1, num2; // 같은 타입의 변수 콤마(,)로 구분해서 동시에 선언 가능
         double num3=3.14; // 선언과 동시에 초기화
         String name="곰돌이사육사";
         int hour=3;
         int minute=55;

         System.out.println(hour + "시 "+minute + "분");
         System.out.println(name);
         NameCard ns=new NameCard();
         ns.name="곰돌이사육사";
         ns.age=20;
         System.out.println(ns.name);
         System.out.println(ns.age);
    }
}

// 사용자 정의 자료형
class NameCard{
    String name;
    int age;
    String addr;
    String eMail;
    String phoneNumber;

}