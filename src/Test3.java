public class Test3 {

    static class Parent {
        int computer(int num) {
            if (num == 1) {
                return num;
            }
            return computer(num - 1) + computer(num - 2);
        }
    }

    static class Child extends Parent {
        @Override
        int computer(int num) {
            if (num <= 1) {
                return num;
            }
            return computer(num - 1) + computer(num - 3);
        }
    }

    public static void main(String[] args) {
        Parent obj = new Child();
        System.out.println(obj.computer(4));
    }
}