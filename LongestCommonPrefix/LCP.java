
import java.util.Arrays;

class LCP{
    public String longestCommonPrefix(String[] strs){
        StringBuilder result = new StringBuilder();

        //Sort the array first
        Arrays.sort(strs);

        //Get first and last strings
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        //Start Comparing

        for(int i = 0; i < first.length; i++){
            if(first[i] != last[i])
                break;
            result.append(first[i]);
        }

        return result.toString();
    }
}