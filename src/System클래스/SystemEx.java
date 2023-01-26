package System클래스;

import static java.lang.Thread.sleep;

public class SystemEx {
    public static void main(String[] args) throws InterruptedException {
        int[] data = new int[1000];
        int cnt = 0;
        // 배열 내에서 찾고자하는 임의의 수를 생성
        int val = (int)(Math.random()*1000)+1; // 1~1000사이의 임의의 수 생성
        for(int i=0; i<data.length; i++){ // 배열에 1에서 1000까지의 값을 입력
            data[i] = i+1;
        }
        long time1 = System.currentTimeMillis();
        // 순차 검색 : 정렬이 되어 있지 않은 배열에서 임의의 값을 찾는 방법, 처음부터 끝까지 탐색
        for(int i=0; i<data.length; i++){
            cnt++; // 총 검색 횟수 구하기
            sleep(1);
            if(val == data[i]){ // 찾고자 하는 값과 배열의 값이 같으면 검색 중지
                System.out.println("위치 : "+(i+1));
                break;
            }
        }
        long time2 = System.currentTimeMillis();
        System.out.println("총 검색 : "+cnt);
        System.out.println("검색에 소요된 시간 : "+(time2-time1));

        // 시스템 프로퍼티 얽기
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("os.home"));
    }
}
