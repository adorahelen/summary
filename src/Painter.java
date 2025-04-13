import java.util.Collection;

public class Painter {
    void print (Integer a){
        System.out.println("A" + "a");
    }
    void print (Object a){
        System.out.println("B" + "a");
    }
    void print(Number a){
        System.out.println("C" + "a");
    }

    public static void main(String[] args) {
        new Collection<>(0).print();
    }
    public static class Collection <T>{
        T value;
        public Collection(T t){
            value = t;
        }
        public void print(){
            new Painter().print(3.14);
            new Painter().print(value);
            new Painter().print(1);
            new Painter().print("3");
        }
    }
}


