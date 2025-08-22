
class Solution{
    public String gcdOfStrings(String str1, String str2){
       int len1 = str1.length();
       int len2 =str2.length();

       if(!(str1 + str2).equals(str2+str1))
         return "";
        
    String result = str1.substring(0, gcd(len1, len2));
    return result;
    }

    private int gcd(int num1, int num2){
        if(num2 == 0 )
            return num1;
        
        return gcd(num2, num1%num2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str1 = "ABCABC";
        String str2 = "ABC";
        String result = solution.gcdOfStrings(str1, str2);
        System.out.println("GCD String: " + result); // Output: "ABC"
        
        str1 = "ABABAB";
        str2 = "ABAB";
        result = solution.gcdOfStrings(str1, str2);
        System.out.println("GCD String: " + result); // Output: "AB"
        
        str1 = "LEET";
        str2 = "CODE";
        result = solution.gcdOfStrings(str1, str2);
        System.out.println("GCD String: " + result); // Output: ""
    }
}