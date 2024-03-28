public class Problem4 {
    public static void main(String[] args) {
        int[] testCases = {
                5,
                12345,
                4068,
                11111,
                8642,
                907513
        };

        for (int test : testCases) {
            sumEvens(test);
        }
    }
    private static void sumEvens(int num) {
        int sum = 0;
        while (num > 0) {
            int nextNum = num / 10;
            int lastDigit = num - nextNum * 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            num = nextNum;
        }
        System.out.println(sum);
    }
}
