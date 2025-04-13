import java.util.Collection;

class Printer {
    void print (Integer a){
        System.out.println("A" + a);
    }
    void print (Object a){
        System.out.println("B" + a);
    }
    void print(Number a) {
        System.out.println("C" + a);
    }
}


public class Test20241018 {
    public static void main(String[] args) {
        new Collection<>(0).print();
    }
    public static class Collection<T> {
        T value;
        public Collection(T t) {
            value = t;
        }
        public void print() {
            new Printer().print(value);
        }
    }
}
