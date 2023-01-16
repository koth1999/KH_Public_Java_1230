package 접근제한자;

public class ParentRest {
    public String name; // default 접근제한자
    protected String money;
    String addr;
    public ParentRest(){
        name = "곰돌이사육사";
        money = "100억";
        addr = "경기도 수원시";

    }
}
