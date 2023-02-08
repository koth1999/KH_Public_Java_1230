package 입출력스트림예제6번;
// Scanner 입력으로 파일을 읽기

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StreamEx6 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("src/입출력스트림예제6번/test.txt");
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fis); // 스캐너의 입력으로 파일을 읽어 들임
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
