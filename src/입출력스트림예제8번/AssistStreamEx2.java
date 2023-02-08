package 입출력스트림예제8번;

import java.io.*;

public class AssistStreamEx2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        int data = -1; // 더이상 값이 없는 상태
        long start = 0;
        long end = 0;
        fis = new FileInputStream("src/입출력스트림예제8번/cloneBear.png");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("src/cloneX2Bear.png");
        start = System.currentTimeMillis();
        while((data = bis.read())!= -1){
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("버퍼를 사용하지 않는 경우에 대한 시간 : "+(end-start)+"ms");

        fis = new FileInputStream("src/입출력스트림예제8번/cloneBear.png");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("src/cloneX2Bear.png");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while((data = bis.read())!= -1){
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        bos.close();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("버퍼를 사용하는 경우에 대한 시간 : "+(end-start)+"ms");
    }
}
