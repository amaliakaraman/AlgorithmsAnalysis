// Name: Amalia Karaman
// Assignment: Algorithms Analysis
// Professor: Esteban Parra Rodriguez
// This program calculates the longest common subsequence (LCS) between two input strings.

public class CommonSubsequence {
    public static void main(String[] args) {
        // Input strings
        String text1 = "chocolate";
        String text2 = "latte";
        // Calculates longest common subsequence length
        int lcsLength = longestCommonSubsequence(text1, text2);
        // Prints results
        System.out.println("INPUT: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"");
        System.out.println("OUTPUT (LCS): " + lcsLength);
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        // Fills the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        // The value of dp[m][n], longest common subsequence length
        return dp[m][n];
    }
}
