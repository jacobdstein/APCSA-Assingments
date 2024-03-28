import java.util.Arrays;

public class Problem8 {
    public static void main(String[] args) {
        String[] testCases = {"potion", "example", "character", "arrange", "programming"};

        for (String test : testCases) {
            alphabetize(test);
        }
    }

    public static void alphabetize(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        string = new String(chars);
        System.out.println(string);
    }
}
