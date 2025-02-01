import java.util.*;

public class PascalTriangle {
    public static int[][] pascal(int n) {
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];
            ans[i][0] = ans[i][i] = 1; 
            for (int j = 1; j < i; j++) { 
                ans[i][j] = ans[i - 1][j - 1] + ans[i - 1][j];
            }
        }
        
        return ans; 
    }

    public static void printTriangle(int[][] triangle) {
        for (int[] row : triangle) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        int[][] result = pascal(n);
        printTriangle(result);
    }
}
