package 싱글톤응용;

import 싱글톤.Singleton;

public class SingletonEx2 {
    String name;
    int id;
    private static SingletonEx2 singleton = new SingletonEx2();
    private SingletonEx2(){
        name = "test";
        id = 100;
    }
    // getSingleton() 메소드 호출 시 미리 만들어져 있는 싱글톤 객체의 참조변수를 반환
    static public SingletonEx2 getSingleton(){
        return singleton;
    }
}

