package Person상속;

import java.util.Scanner;

// 인간(Person) 클래스 만들기
// - age(정수값 : 나이) : 필드와 세터/게터
// - sleep (정수값 : 시간) : 필드와 세터/게터
// 인간의 특성을 상속 받아서 직장인 만들기
// - worker(정수값 : 일하는 시간) : 필드와 세터/게터
// 인간의 특성을 상속받아 학생 만들기
// - 공부한다(열심히/적당히/놀면서) : 필드와 세터/게터
public class PersonInheritance {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setWork(12);
        worker.setAge(25);
        worker.setSleep(6);
        System.out.println("직장인이 "+worker.getWork()+"시간 동안 일 합니다.");
        System.out.println("직장인의 나이는 "+worker.getAge()+"입니다.");
        System.out.println("직장인은 "+worker.getSleep()+"시간 동안 잠을 잡니다.");

        Student student = new Student();
        student.setStudy(1);
        student.setAge(18);
        student.setSleep(5);
        System.out.println("학생이 "+student.getStudy()+" 공부 합니다.");
        System.out.println("학생의 나이는 "+student.getAge()+"입니다.");
        System.out.println("학생은 "+student.getSleep()+"시간 동안 잠을 잡니다.");
    }
}

class Person{
    private int age;
    private int sleep;

    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }

    void setSleep(int sleep){
        this.sleep = sleep;
    }
    int getSleep(){
        return sleep;
    }
}

class Worker extends Person{
    private int work;
    void setWork(int work){
        this.work = work;
    }

    int getWork(){
        return work;
    }
}

class Student extends Person{
    int study;

    void setStudy(int study){
        this.study = study;
    }

    String getStudy(){
        String[] studyStr= {"", "\"열심히\"", "\"적당히\"", "\"놀면서\""};
        return studyStr[study];
    }

}