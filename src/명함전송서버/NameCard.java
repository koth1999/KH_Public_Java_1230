package 명함전송서버;

import java.io.Serializable;

public class NameCard implements Serializable {
    private String name;
    private String phoneNum;
    private String eMail;
    private String addr;

    public NameCard(String name, String phoneNum, String eMail, String addr) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.eMail = eMail;
        this.addr = addr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEMail() {
        return eMail;
    }

    public String getAddr() {
        return addr;
    }

    void viewName(){
        System.out.println("이름 : "+name);
        System.out.println("전화번호 : "+phoneNum);
        System.out.println("이메일 : "+eMail);
        System.out.println("주소 : "+addr);
    }
}
