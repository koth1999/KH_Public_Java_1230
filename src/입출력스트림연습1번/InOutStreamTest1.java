package 입출력스트림연습1번;
// 파일을 읽어서 총점을 구하고 총점이 높은 사람 순으로 정렬(총점이 같은 경우 이름순 정렬)


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class InOutStreamTest1 {
    public static void main(String[] args) throws IOException {
        // 파일을 만들어서 특정 위치에 저장
        // FileInputStream을 이용해서 파일에 대한 스트림 생성
        // 파일의 내용은 스캐너를 사용해서 읽어들이고, 문자열을 split(" ")으로 잘라서 문자열 배열에 저장
        // 성적은 Integer.parseInt()를 이용해 변환
        // 여기서 필요한게 학생과 성적을 입력 받을 클래스를 만들고 split()으로 생성된 문자열을 클래스로부터 생성된 객체에 저장
        // 클래스를 만들 때 정렬을 위해서 Comparable 이나 Comparator 사용
        // TreeSet 컬렉션 사용 필요
        FileInputStream fis = null;
        TreeSet<StudentInfo> ts = new TreeSet<>();
        try{
            fis = new FileInputStream("src/입출력스트림연습1번/test1.txt");
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fis);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] strArr = line.split(" ");
            ts.add(new StudentInfo(strArr[0],
                    Integer.parseInt(strArr[1]),
                    Integer.parseInt(strArr[2]),
                    Integer.parseInt(strArr[3])));
        }
        for(StudentInfo e : ts) {
            System.out.println(e.getName()+" : "+e.getTotal());
        }
        fis.close();
    }
}

