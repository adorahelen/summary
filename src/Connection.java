public class Connection {

    private static Connection _inst = null;
    private  int count = 0;
    public static Connection get() {
        if (_inst == null) {
            _inst = new Connection();
            return _inst;
        }
        return _inst;
    }// single tone

    public void count() {count++;}
    public int getCount() {return count;}

    public static void main(String[] args) {
        Connection con1 = Connection.get();
        con1.count();
        Connection con2 = Connection.get();
        con2.count();
        Connection con3 = Connection.get();
        con3.count();
        System.out.println(con1.getCount());
    }

}


