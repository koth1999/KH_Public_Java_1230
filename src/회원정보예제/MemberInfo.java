package 회원정보예제;

import java.util.Scanner;

// 회원정보를 관리하는 클래스
public class MemberInfo {
    // 필드 추가하기 : 클래스 소속의 변수를 필드라고 부른다.
    String name;
    int age; // 나이는 1~199까지를 유효값으로 간주
    char gender; // 'M'과 'm'은 남성, 'F'와 'f'는 여성으로 간주하고 출력은 "남성", "여성"으로 출력
    int jobs; // 정수로 입력(1. 학생, 2.회사원, 3.주부, 4.무직)
    Scanner sc = new Scanner(System.in); // 키보드 입력을 위해서 스캐너 생성
    // 메소드 추가하기 (클래스 외부에 존재하면 함수라고 부르는데 자바는 메소드가 클래스 외부에 존재 할 수 없다)

    public void setName() { // 세터라고 부른다
        System.out.print("이름을 입력하세요 : ");
        name = sc.next();
    }

    public void setAge() {
        while (true) {
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt();
            if (age > 0 && age < 200) return; // 메소드를 호출한 곳으로 되돌아감. 즉 메소드 수행이 종료됨
            System.out.println("나이를 잘못 입력하였습니다.");
        }
    }

    public void setGender() {
        while (true) {
            System.out.print("성별을 입력하세요(M/F) : ");
            gender = sc.next().charAt(0); // 문자열에서 첫번째 문자를 추출
            switch (gender) { // 조건식은 올 수 없음
                case 'M':
                case 'm':
                case 'F':
                case 'f':
                    return;
                default:
                    System.out.println("성별을 잘못 입력 하셨습니다.");
            }
        }
    }

    public void setJobs() {
        while (true) {
            System.out.print("직업을 입력하세요(1.학생, 2.회사원, 3.주부, 4.무직) : ");
            jobs = sc.nextInt();
            if(jobs>0 && jobs<5) return;
            System.out.println("직업을 잘못 입력하셨습니다.");
        }
    }

    public int getGenderType(){
    if(gender=='M' || gender=='m') return 1;
    else return 2;
    }

    // 회원정보 출력하기
    public void viewInfo(){
        String [] genderStr={"", "남성", "여성"};
        String [] jobsStr={"", "학생", "회사원", "주부", "무직"};
        System.out.println("========= 회원 정보 출력=======");
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        System.out.println("성별 : "+genderStr[getGenderType()]);
        System.out.println("직업 : "+jobsStr[jobs]);
    }
}
