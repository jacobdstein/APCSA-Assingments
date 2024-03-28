import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        int[][] testCases = {
                {6},
                {5, 1, 4, 2},
                {3, 6, 2, 8, 5},
                {10},
                {1, 3, 5, 7, 9, 2, 4, 6, 8},
                {7, 3, 9, 1},
                {20, 10, 30, 50, 40}

        };
        for (int[] list : testCases) {
            Arrays.sort(list);
            for (int i = 0; i < list.length - 1; i++) {
                System.out.print(list[i] + ", ");
            }
            System.out.println(list[list.length -1]);
        }
    }
}
