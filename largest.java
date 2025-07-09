public class Largest {
    public static void main(String[] args) {
        int a = 5, b = 20, c = 12;

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest: " + max);
    }
}
