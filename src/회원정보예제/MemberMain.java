package 회원정보예제;

public class MemberMain {
    public static void main(String[] args) {
        MemberInfo memberInfo=new MemberInfo();
        memberInfo.setName();
        memberInfo.setAge();
        memberInfo.setGender();
        memberInfo.setJobs();
        memberInfo.viewInfo();
    }
}
