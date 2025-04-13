class Static {
    public int a = 20;
    public static int b = 0;
}

public class SequenceDif {

    public static void main(String[] args) {
        int a = 10;
        Static.b = a;
        Static st = new Static();
        System.out.println(Static.b++);  // 10 출력
        System.out.println(st.b);       // 11 출력
        System.out.println(st.a);       // 20 출력
    }
}