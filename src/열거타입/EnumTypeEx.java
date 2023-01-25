package 열거타입;

import java.util.Calendar;

public class EnumTypeEx {
    public static void main(String[] args) {
        Week today = null;
        Calendar cal = Calendar.getInstance(); // 추상클래스
        int week = cal.get(Calendar.DAY_OF_WEEK); // 해당 주의 몇번째날인지를 반환(일요일부터 반환)
        switch(week){
            case 1 :
                today = Week.SUNDAY; break;
            case 2 :
                today = Week.MONDAY; break;
            case 3 :
                today = Week.TUESDAY; break;
            case 4 :
                today = Week.WEDNESDAY; break;
            case 5 :
                today = Week.THURSDAY; break;
            case 6 :
                today = Week.FRIDAY; break;
            case 7 :
                today = Week.SATURDAY; break;
        }
        System.out.println("오늘 요일은 : "+today);
    }
}
