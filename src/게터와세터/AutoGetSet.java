package 게터와세터;

public class AutoGetSet {
    String id;
    String pwd;
    String eMail;
    String addr;

    public AutoGetSet(String id, String pwd, String eMail, String addr) {
        this.id = id;
        this.pwd = pwd;
        this.eMail = eMail;
        this.addr = addr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
