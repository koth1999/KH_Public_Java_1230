package 클론메소드;
// clone() : 해당 객체(인스턴스)를 복제해 새로운 인스턴스를 생성
// 얕은복사와 깊은 복사 개념이 필요
// 얕은 복사로 인해 주소가 복사되어 의도하지 않은 동작이 일어나는 문제를 해결하기 위해 깊은 복사를 수행
public class CloneMethod {
    public static void main(String[] args) {
         Member mem1 = new Member("hunter", "곰돌이사육사", "1234", 30, true);
         Member mem2 = mem1.getMember();

         mem2.age = 300;
         mem2.name = "멍멍이";

//         System.out.println("age : "+mem1.age);
//         System.out.println("name : "+mem1.name);
//         System.out.println("age : "+mem2.age);
//         System.out.println("name : "+mem2.name);

         String str1 = new String("abc");
         String str2 = new String("abc");
         System.out.println(str1.hashCode());
         System.out.println(str2.hashCode());

    }
}


