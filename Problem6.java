public class Problem6 {
    public static void main(String[] args) {
        int[] testCases = {5, 1, 10, 15, 20, 100};

        for (int num : testCases) {
            findNthPrime(num);
        }
    }

    public static void findNthPrime(int n) {
        int[] primes = new int[n + 1];
        primes[0] = 2;
        primes[1] = 3;
        int nextPrimeNum = primes[1] + 2;
        for (int i = 2; i < n; i++) {
            while (!isPrime(nextPrimeNum, primes)) {
                nextPrimeNum += 2;
            }
            primes[i] = nextPrimeNum;
            nextPrimeNum += 2;
        }
        System.out.println(primes[n - 1]);
    }

    private static boolean isPrime(int x, int[] primes) {
        int max = x / 2;
        for (int p : primes) {
            if (p == 0 || p > max) {
                return true;
            }

            if (x % p == 0) {
                return false;
            }
        }

        return true;
    }
}
