import java.util.ArrayList;

public class LetterCombination17 {
    public static void main(String[] args) {
        System.out.println(LetterPadArray("","12"));
    }
    static void LetterPad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';//convert '2' to 2

        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            LetterPad(p+ch,up.substring(1));
        }
    }
    static ArrayList<String> LetterPadArray(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';//convert '2' to 2
        ArrayList<String> lt=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            lt.addAll(LetterPadArray(p+ch,up.substring(1)));
        }
        return lt;
    }

    static int LetterPadCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        int digit=up.charAt(0)-'0';//convert '2' to 2

        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            count=count+LetterPadCount(p+ch,up.substring(1));
        }
        return count;
    }


}
