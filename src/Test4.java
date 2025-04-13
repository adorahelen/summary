public class Test4 {
    public static String rf (String str, int index, boolean[] seen) {
        if (index < 0) return "";
        char c = str.charAt(index);
        String result = rf(str, index-1, seen);
        if (!seen[c]) {
            seen[c] = true;
            return c + result;

        }
        return result;
    }
}
