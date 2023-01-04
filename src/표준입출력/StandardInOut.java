package 표준입출력;

public class StandardInOut {
    public static void main(String[] args) {
        String name="곰돌이사육사";
        String addr="경기도 수원시";
        char gender='남';
        int age=30;
        int kor=99;
        int eng=88;
        int mat=55;
        // 자바 스타일 (print() / println() 메소드 오버로딩)
        System.out.println("======= Java Style =====");
        System.out.println("이름 : "+name);
        System.out.println("주소 : "+addr);
        System.out.println("성별 : "+gender);
        System.out.println("나이 : "+age);
        System.out.println("총점 : "+(kor+eng+mat));
        System.out.println("평균 : "+(((double)kor+eng+mat)/3));

        // C언어 스타일(서식 지정자와 이스케이프 시퀀트 사용)
        // 서식지정자 : %d, %f, %.2f, %2d, %s, %c, %b, %%
        // 이스케이프 시퀀스 : \n, \r, \t, \b, \\
        System.out.printf("=======C Style======\n"); // 줄바꿈
        System.out.printf("이름 : %s\n", name);
        System.out.printf("이름 :%s, 주소 : %s\n", name, addr);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %d\n", kor+eng+mat);
        System.out.printf("평균 : %.2f\n", (double)(kor+eng+mat)/3);

        System.out.printf("Apple,\t\t\tBanana\b\b\b");

        System.out.println("\"Enter\"키를 입력하시면 종료 됩니다.");
        System.out.println("Hello\\Java");
        System.out.printf("오늘의 습도는 %d%%입니다.\n", 25);

    }

}
