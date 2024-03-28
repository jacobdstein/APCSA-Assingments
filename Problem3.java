public class Problem3 {
    public static void main(String[] args) {
        String[] testCases = {
                "radar",
                "race car",
                "hello",
                "A man a plan a canal Panama",
                "12321",
                "no lemon no melon",
                "not a palindrome"
        };

        for (String test : testCases) {
            isPalindrome(test);
        }
    }

    private static void isPalindrome(String text) {
        String reverseText = "";
        System.out.print(text);
        text = text.replaceAll("\\s", "");
        text = text.toLowerCase();
        for (int i = text.length() -1; i >= 0; i--) {
            reverseText += text.substring(i, i+1);
        }
        if (text.equals(reverseText)) {
            System.out.println(" is a palindrome");
        } else {
            System.out.println(" is not a palindrome");
        }

    }
}
