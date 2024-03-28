import java.util.ArrayList;

public class Problem10 {
    public static void main(String[] args) {
        String[] testCases = {"listen, silent, enlist, inlets, cat, act, tac, dog",
                "apple, leap, pale, plee, lap, peal, dog, god",
                "race, care, acre, scare, car, arc",
                "pots, spot, tops, opts, stop, post",
                "hello, below, elbow, bow, owl"
        };

        for (String test : testCases) {
            getAnagrams(test);
        }
    }

    public static void getAnagrams(String input) {
        String[] splitInput = input.split(", ");
        ArrayList<int[]> countsList = new ArrayList<>();
        ArrayList<ArrayList<String>> foundAnagrams = new ArrayList<>();
        for (String s : splitInput) {
            ArrayList<String> anagrams = new ArrayList<>();
            anagrams.add(s);
            foundAnagrams.add(anagrams);
        }

        for (String word : splitInput) {
            int[] counts = convertString(word);

            boolean found = false;
            for (int j = 0; j < countsList.size(); j++) {
                int[] otherCounts = countsList.get(j);
                if (otherCounts == null) {
                    continue;
                }
                if (arraysEqual(counts, otherCounts)) {
                    foundAnagrams.get(j).add(word);
                    found = true;
                    break;
                }
            }
            if (found) {
                countsList.add(null);
            } else {
                countsList.add(counts);
            }
        }

        boolean first = true;
        for (ArrayList<String> anagrams : foundAnagrams) {
            if (anagrams.size() > 1) {
                if (first) {
                    System.out.print("[");
                    first = false;
                } else {
                    System.out.print(",");
                }
                System.out.print(anagrams);
            }
        }
        System.out.println("]");
    }

    public static int[] convertString(String input) {
        int[] letterCounts = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            c = Character.toLowerCase(c);
            letterCounts[c-'a']++;
        }
        return letterCounts;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}
