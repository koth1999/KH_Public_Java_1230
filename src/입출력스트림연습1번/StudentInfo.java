package 입출력스트림연습1번;

public class StudentInfo implements Comparable<StudentInfo>{
    private String name;
    private int kor;
    private int eng;
    private int mat;

    public StudentInfo(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
    public int getTotal(){
        return kor+eng+mat;
    }

    String getName(){
        return name;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if(this.getTotal() == o.getTotal()) return this.name.compareTo(o.name);
        else if(this.getTotal() < o.getTotal()) return 1;
        else return -1;
    }
}
