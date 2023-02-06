package 람다예제7번;

import java.util.function.BiFunction;
import java.util.function.Function;

// 생성자 참조 : 메소드 참조는 생성자 참조를 포함한다.
public class LambdaEx7 {
    public static void main(String[] args) {
        Function<String, LambdaMember> func1 = LambdaMember::new;
        LambdaMember member1 = func1.apply("곰돌이");
        BiFunction<String, String, LambdaMember> func2 = LambdaMember::new;
        LambdaMember member2 = func2.apply("곰돌이", "1234");

    }
}

class LambdaMember {
    String name;
    String id;
    public LambdaMember(){
        System.out.println("Member() 실행");
    }
    public LambdaMember(String id){
        System.out.println("Member(String id) 실행");
    }
    public LambdaMember(String name, String id){
        System.out.println("Member(String name, String id) 실행");
    }
    public String getId(){return id;}
}