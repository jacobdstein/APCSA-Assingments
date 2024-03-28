public class Problem9 {
    public static void main(String[] args) {
        int[] testCases = {6, 11, 25, 99, 7, 41, 63};

        for (int test : testCases) {
            findMinCoins(test);
        }
    }

    public static void findMinCoins(int num) {
        int numQuarters = 0;
        int numDimes = 0;
        int numNickels = 0;
        if (num >= 25) {
            numQuarters = num / 25;
            num %= 25;
        }
        if (num >= 10) {
            numDimes = num / 10;
            num %= 10;
        }
        if (num >= 5) {
            numNickels = num / 5;
            num %= 5;
        }
        int numPennies = num;

        boolean printed = print(numPennies, 1, false);
        printed = print(numNickels, 5, printed);
        printed = print(numDimes, 10, printed);
        print(numQuarters, 25, printed);
        System.out.println();
    }

    private static boolean print(int count, int value, boolean printed) {
        if (count == 0) {
            return printed;
        }
        if (printed) {
            System.out.print(", ");
        }
        System.out.print(count + " " + value);

        return true;
    }
}
