import java.util.Locale;

public class palindromeString {
    public static void main(String[] args) {
        String k="racecar";
        System.out.println(is_palindrome(k));

    }
    static boolean is_palindrome(String str){
        str=str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++){
            char start= str.charAt(i);
            char end= str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }


        }
        return true;
    }
}
