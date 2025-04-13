public class Test0410 {

    static class Connection {  // static으로 수정
        private static Connection con_instance = null;
        private int count = 0;

        private Connection() {}  // 생성자도 private

        public static Connection get() {
            if (con_instance == null) {
                con_instance = new Connection();
            }
            return con_instance;
        }

        public void count() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        Connection conn1 = Connection.get();
        conn1.count();

        Connection conn2 = Connection.get();
        conn2.count();

        Connection conn3 = Connection.get();
        conn3.count();

        System.out.println(conn1.getCount());  // 결과: 3
    }
}