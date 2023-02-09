package 입출력스트림예제11번;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// System.in : 표준 입력 스트림
// System.out : 표준 출력 스트림
// System.err : 표준 오류 출력 스트림
public class InOutStreamEx11 {
    public static void main(String[] args) throws IOException {
//        System.out.println("=== 메뉴 ===");
//        System.out.println("1. 예금 조회");
//        System.out.println("2. 예금 출금");
//        System.out.println("3. 예금 입급");
//        System.out.println("4. 종료 하기");
//        System.out.println("메뉴를 선택 하세요 : ");

//        InputStream is = System.in;
//        char input = (char) is.read(); // ASCII 코드를 읽어 문자로 리턴
//        switch(input){
//            case '1' :
//                System.out.println("예금 조회 메뉴를 선택 하셨습니다.");
//                break;
//            case '2' :
//                System.out.println("예금 출금 메뉴를 선택 하셨습니다.");
//                break;
//            case '3' :
//                System.out.println("예금 입금 메뉴를 선택 하셨습니다.");
//                break;
//            case '4' :
//                System.out.println("종료 하기 메뉴를 선택 하셨습니다.");
//                break;
//    }

    OutputStream os = System.out;
       for(byte b = 48; b < 58; b++){
           os.write(b);
    }
       os.write(10);
       for(byte b = 65; b<65+26; b++){
           os.write(b);
       }
       os.write(10);
        for(byte b = 97; b<97+26; b++){
            os.write(b);
        }
        os.write(10);
   }
}