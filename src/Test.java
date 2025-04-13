class Person { // public 제거: 하나의 파일에 public class는 하나만 가능
    private String name;

    public Person(String val) {
        name = val; // 생성자에서 name 초기화
    }

    public String print() {
        return name; // 이름을 문자열로 반환함 (출력은 아님)
    }
}

public class Test { // 파일명은 반드시 Test.java
    public static void main(String[] args) {
        Person obj = new Person("John"); // 객체 생성

        obj.print(); // ❗ 이 줄에서 반환된 값은 사용되지 않음!
        // 즉, "John"이라는 문자열이 반환되었지만 어디에도 저장하거나 출력하지 않음
        // 그래서 콘솔에는 아무것도 출력되지 않음
    }
}