public class Test5 {

    class A {
        int a;

        public A(int a) {
            this.a = a;
        }

        void display() {
            System.out.println("a=" + a);
        }
    }

    class B extends A {
        public B(int a) {
            super(a);
            super.display();
        }
    }

    public static void main(String[] args) {
        Test5 outer = new Test5();       // 외부 클래스 객체 생성
        Test5.B obj = outer.new B(10);   // 내부 클래스 B 객체 생성
    }
}