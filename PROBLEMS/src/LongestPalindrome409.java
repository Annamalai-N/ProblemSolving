import java.util.HashMap;

public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>k=new HashMap<>();
        int odd=0;
        char[]j=s.toCharArray();
        for(char i:j){
            k.put(i,k.getOrDefault(i,0)+1);
            if(k.get(i)%2==1){
                odd++;
            }else{
                odd--;
            }
        }
        if(odd>1){
            return s.length()-odd+1;
        }
        return s.length();
    }
}
