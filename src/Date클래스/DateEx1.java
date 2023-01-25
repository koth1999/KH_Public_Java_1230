package Date클래스;

import java.text.SimpleDateFormat;
import java.util.Date;

// Date 클래스 : 1970년 1월1일 0시0분0초로 부터 msec 단위로 경과 시간을 운영체제로 부터 얻어냄
// SimpleDateFormat 클래스 : 얻어낸 시간 정보를 우리가 원하는 날짜와 시간 형태로 변환하여 출력하는 포맷
public class DateEx1 {
    public static void main(String[] args) {
        Date now = new Date(); // Date 클래스로 객체를 생성 후 사용해야함
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM--dd hh:mm:ss");
        String strDate = sdf.format(now);
        System.out.println(strDate);
    }

}
