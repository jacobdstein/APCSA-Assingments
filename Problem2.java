public class Problem2 {
    public static void main(String[] args) {
        String[] testCases = {
                "12,13",
                "5,5",
                "4,56",
                "1234,5678",
                "0,15",
                "-10,-20",
                "-5,10"
        };
        for (String test : testCases) {
            solve(test);
        }
    }
    private static void solve(String text) {
        int index = text.indexOf(',');
        System.out.println(text.substring(index + 1) + "," + (text.substring(0, index)));
    }
}
