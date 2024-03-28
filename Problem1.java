public class Problem1 {
    public static void main(String[] args) {
        int[][] testCases = {
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 10},
                {1, 2, 3, 4, 100},
                {1000, 2000, 3000, 4000, 5000},
                {10, 8, 6, 4, 2}
        };

        for (int[] test : testCases) {
            solve(test);
        }
    }

    private static void solve(int[] array) {
        int min = array[0];
        int max = array[0];
        int sum = 0;
        for (int x :  array) {
            sum += x;
            if (x < min) {
                min = x;
            } else if (x > max) {
                max = x;
            }
        }
        System.out.println("min: " + (sum - max) + ", max: " + (sum - min));
    }
}
