package Class클래스;
//
public class ClassMainEx {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class pCls1 = person.getClass(); // Object의 getClass() 메소드 사용
        System.out.println(pCls1.getName());

        Class pCls2 = Person.class; // 직접 class 대입 하기
        System.out.println(pCls2.getSimpleName());
    }
}

class Person{
    private String name;
    private int age;
    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}