package 입출력스트림예제7번;

import java.io.*;

// 보조 스트림 : 데이터를 변환해서 입출력 하고자 하거나, 데이터의 출력 형식을 지정하고 싶은 경우
// 그리고 성능 개선이 필요한 경우 사용
// InputStreamReader : 문자의 인코딩 방식 지정할 때 사용하며 바이트 스트림과 문자 스트림을 연결
public class AssistStreamEx1 {
    public static void main(String[] args) throws IOException {
//        InputStream is = System.in; // 콘솔 입력을 받음
//        Reader reader = new InputStreamReader(is); // 보조 스트림이고 기본 인코딩을 사용
//        int readCharNo;
//        char[] cBuf = new char[100];
//        while((readCharNo = reader.read(cBuf))!=-1){
//            String data = new String(cBuf, 0, readCharNo);
//            System.out.println(data);
//        }
//        reader.close();

        FileOutputStream fos = new FileOutputStream("src/입출력스트림예제7번/file.txt");
        Writer writer = new OutputStreamWriter(fos); // 바이트 출력 스트림을 문자 출력 스트림으로 변환하는 보조 스트림

        String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
        writer.write(data);
        writer.flush();
        writer.close();
        System.out.println("파일 저장이 끝났습니다.");

    }
}
