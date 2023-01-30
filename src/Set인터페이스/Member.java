package Set인터페이스;

public class Member {
    int id;
    String name;

    @Override
    public int hashCode(){
       return id;
    }

    @Override
    public boolean equals(Object obj){ // 자기 자신과 매개변수로 들어온 객체가 같은지 비교
        if(obj instanceof Member){ // 매개변수로 전달된 객체중에서 Member type에 해당되는 객체를 골라냄
            Member member = (Member) obj; // 다운캐스팅
            if(this.id == member.id) return true;
            else return false;

        }
        return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showMember(){
        System.out.println("아이디 : "+id);
        System.out.println("이름 : "+name);
    }
}
