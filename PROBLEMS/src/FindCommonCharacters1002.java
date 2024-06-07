import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters1002 {
    public List<String> commonChars(String[] words) {
        List<Character> k=words[0].toCharArray();
        List<String>news=new ArrayList<>();
        for (int i = 1; i < words.length; i++) {
            String l= String.valueOf(words[i].length());
            int start=0;
            while(start<l.length()){
             if(l[start]==k) {
                 news.add(l[start]);
             } else if (l[start]!=k) {
                 news.remove(l[start]);
             }
             start++;
            }
        }
        return news;

    }

    public static void main(String[] args) {
        List<String> arr= List.of(new String[]{"bella", "label", "roller"});
        FindCommonCharacters1002 lm=new FindCommonCharacters1002();
        System.out.println(Arrays.toString(lm.commonChars(arr)));
    }
}
