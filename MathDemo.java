package week06;

public class MathDemo {

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 25;

        System.out.println(min(a, b));
        System.out.println(max(a, b));

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(sum(numbers));
    }
}
