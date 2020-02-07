package converter;

public class Converter {
    public static int sqArea(int p, int k) {
        int h = (p - 2 * k) / 2;
        int l = h * k;
        return l * h;
    }
}
