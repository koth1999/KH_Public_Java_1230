package Set인터페이스;

import java.util.*;

// Set인터페이스 : 중복 허용 하지 않음, 순서를 유지하지 않음
// HashSet : HashCode() 메소드 리턴값을 사용하여 객체의 동일여부 판단
public class SetInterfaceEx {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        hashSet.add(new Member(1001, "유나"));
        hashSet.add(new Member(1002,"카리나"));
        hashSet.add(new Member(1003, "진"));
        hashSet.add(new Member(1003, "안유진"));

        for(Member e : hashSet) {
            e.showMember();
            System.out.println(e.hashCode());
            System.out.println("------------------");
        }
    }
}
