package 입출력스트림예제4번;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// Reader : 문자 기반 입력 최상위 클래스로 추상 클래스이다. 모든 문자 기반의 입력 스트림은 Reader를 상속 받아 만듬
// read() : 입력 스트림으로부터 1개의 문자(2byte)를 읽고 4바이트 int 타입으로 반환
public class CharReadStreamEx {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("test.txt");
        int readData;
        char[] cBuf = new char[10]; // 문자를 담을 버퍼 생성
        String data = "";
        while(true){
            readData = reader.read(cBuf);
            if(readData==-1) break; // -1은 더이상 읽을 값이 없는 경우를 의미
            data += new String(cBuf, 0, readData);
        }
        reader.close(); // 입력 스트림을 사용하고 난뒤 스트림을 닫아야 함
    }
}
