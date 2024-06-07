import java.util.ArrayList;

public class SubSequencesUsingRecursion {
    public static void main(String[] args) {
        System.out.println(SubSequenceArray("","abc"));
    }
    static void SubSequence(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        SubSequence(p+ch,up.substring(1));
        SubSequence(p,up.substring(1));

    }

    static ArrayList<String> SubSequenceArray(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left = SubSequenceArray(p+ch,up.substring(1));
        ArrayList<String> right = SubSequenceArray(p,up.substring(1));

        left.addAll(right);
        return left;

    }
}
