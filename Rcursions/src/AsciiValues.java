import java.util.ArrayList;

public class AsciiValues {
    public static void main(String[] args) {

        System.out.println(SubSequenceAsscii("","abc"));
    }

    static void SubsequenceAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        SubsequenceAscii(p+ch,up.substring(1));
        SubsequenceAscii(p,up.substring(1));
        SubsequenceAscii(p+ (ch+0),up.substring(1));
    }

    static ArrayList<String> SubSequenceAsscii(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> first = SubSequenceAsscii(p+ch,up.substring(1));
        ArrayList<String> second = SubSequenceAsscii(p,up.substring(1));
        ArrayList<String> third = SubSequenceAsscii(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;

    }
}
