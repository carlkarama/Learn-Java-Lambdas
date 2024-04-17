public class Main {

    public static void main(String[] args) {
        int a = 3, b = 4;

        Addable add = (x, y) -> x + y;

        System.out.println(add.add(a, b));

        Multiplyable multiply = (x, y) -> x * y;
    }
}