public class SwapWithTemp {
    public static void main(String[] args) {
        int a = 5, b = 10, temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + ", b = " + b);
    }
}
