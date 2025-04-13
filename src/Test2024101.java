public class Test2024101 {

    static String [] x = new String[3]; // 전역 문자 배열 x 3칸 짜리 객체 생성
    static void func (String[] x, int y) { // 전역이고 반환 값 정해지지 않은 함수 선언 (인자는 스트링 배열 하나, 인트 변수 하나)

        for (int i = 1; i < y; i++) {
            if (x[i-1].equals(x[i])) {
                System.out.println("O");
            }
            else {
                System.out.println("N");
            }
        }

        for (String z : x) {
            System.out.println(z);
        }
    }

    public static void main(String[] args) {
        x[0] = "A";
        x[1] = "A";
        x[2] = new String("A");
        func(x,3);
    }
}
