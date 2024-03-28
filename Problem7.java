public class Problem7 {
    public static void main(String[] args) {
        int[] testCases = {5, 6, 1, 10, 15, 20};

        for (int test : testCases) {
            getNthFib(test);
        }
    }

    public static void getNthFib(int n) {
        int[] fibonacci = new int[n + 1];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println(fibonacci[n - 1]);
    }
}
