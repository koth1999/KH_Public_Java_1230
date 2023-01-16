package 접근제한자;

// 접근제한자 : 객체지향 4가지 특징 중에 하나이며, 데이터은닉 또는 캡슐화의 핵심 개념이다.
// 데이터은닉 : 사용자가 알 필요가 없거나 숨겨야 할 정보를 보이지 않도록 하는 개념이다.
// 대형 프로젝트 진행 중 필드값을 외부에서 접근 가능한 경우 여러가지 문제점이 발생할 수 있다.
public class RestrictedEx {
    public static void main(String[] args) {
        ChildRest childRest = new ChildRest();
        childRest.getMoney();
        System.out.println(childRest.name);
        System.out.println(childRest.jobs);
    }
}

class ChildRest extends ParentRest {
    String jobs;

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }
    public String getMoney(){ // protected 대한 접근(동일 패키지와 상속관계가 성립하면 접근허용)
        return money;
    }
    public String getName(){ // default에 대한 접근(동일 패키지만 접근허용)
        return name;
    }
    public String getAddr(){ // private에 대한 접근
        return addr;
    }
}