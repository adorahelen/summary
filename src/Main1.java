public class Main1 {
    static String [] x = new String[3];
    static void funcs (String[] x, int y){
        for (int i = 1; i < y; i++) {
            if (x[i-1].equals(x[i])) {
                System.out.print("o");
            }
            else {
                System.out.print("x");
            }
            for (String z : x){
                System.out.print(z);
            }
        }

    }

    public static void main(String[] args) {
        x[0] = "x";
        x[1] = "x";
        x[2] = new String("x");
        funcs(x,3);
    }
}
