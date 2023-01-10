package 문자열다루기;
// String 다루기

public class StringEx1 {
    public static void main(String[] args) {
        // equals() : 2개의 문자열이 동일여부를 비교하여 결과를 반환
        String a = "hello";
        String b = "java";
        String c = "hello";

//        System.out.println(a.equals(b)); // a 문자열과 b 문자열을 비교해서 결과가 같으면 true
//        System.out.println(a.equals(c));
//        System.out.println(a.equalsIgnoreCase("HELLO")); // 대소문자 구분하지 않음//       System.out.println(a==c);

          // indexOf() : 문자열에서 특정 문자/문자열가 시작되는 인덱스를 반환한다. (인덱스는 0부터 시작)
         String d = "Hello Java";
         System.out.println(d.indexOf("Java"));

         // contains() : 문자열에서 특정 문자열 포함 여부 리턴(대소문자 구분)
        System.out.println(d.contains("java"));

        // charAt(인덱스) : 문자열에서 인덱스에 해당하는 문자를 반환
        String str = "Hello Java";
        System.out.println(str.charAt(6));

        String str1 = "Apple, Banana, Pineapple, Kiwi, Melon";

        // replace(), replaceAll() : 문자열에서 특정 문자열을 다른 문자열로 대체하고자 할 때 사용
        System.out.println(str1.replace("Pineapple", "Orange"));

        // substring(시작인덱스) : 문자열에서 특정 문자를 추출할 때 사용(시작인덱스부터 끝까지)
        // substring(시작인덱스, 종료인덱스) :
        System.out.println(str1.substring(7));
        System.out.println(str1.substring(7,12)); // 시작 인덱스 부터 종료 인덱스 미만까지

        // toUpperCase() / toLowerCase() : 문자열을 전부 대문자/소문자로 변경
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        // trim() : 문자열의 앞뒤의 공백 제거
        String str2 = "   자바 기반 공공데이터 과정    입니다.!!!! ";
        System.out.println(str2.trim());

        // split() : 문자열을 특정 구분자 기준으로 분리하는 메소드
        String str3 = "안유진/카즈하/유나/장원영";
        String[] result = str3.split("/"); // 입력 받은 이름을 공백 기준으로 나누어 담음
        for(String e : result) System.out.print(e+" ");
        System.out.println();

        // 문자열 포매팅 : String.format() / System.out.printf()
        // 문자열 내에서 서식을 이용해 값을 삽입하는 방법
        System.out.printf("오늘의 %s는 %d 입니다.\n", "온도", 10);
        String str4 = String.format("오늘의 %s는 %d 입니다.", "온도", 10);
        System.out.println(str4);

        // toCharArray() : 문자열을 문자 배열로 반환
        char[] word = str3.toCharArray();
        for(int i=0; i<word.length; i++){
            System.out.print(word[i]+",");
        }
    }

}
