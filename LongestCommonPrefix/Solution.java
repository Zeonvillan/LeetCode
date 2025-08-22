public class Solution {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        LCP lcp = new LCP();

        String ans = lcp.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + ans);

    }
}
