package 어레이리스트응용;

public class MemberInfo {
    String name;
    String id;
    String pwd;
    String eMail;
    String phone;
    int age;

    public MemberInfo(String name, String id, String pwd, String eMail, String phone, int age) {
        this.name = name;
        this.id = id;
        this.pwd = pwd;
        this.eMail = eMail;
        this.phone = phone;
        this.age = age;
    }
    public void viewInfo(){
        System.out.println("이름 : "+name);
        System.out.println("아이디 : "+id);
        System.out.println("비밀번호 : "+pwd);
        System.out.println("이메일 : "+eMail);
        System.out.println("전화번호 : "+phone);
        System.out.println("나이 : "+age);
    }
}
