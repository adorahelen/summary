public class Parent {
    class InParent {
        void show() {
            System.out.println("parent");
        }
    }

    class Child extends InParent {
        @Override
        void show() {
            System.out.println("child");
        }
    }

    public static void main(String[] args) {
//        InParent pa = new Child(); // ❌ 에러 발생
//        pa.show();
    }
}