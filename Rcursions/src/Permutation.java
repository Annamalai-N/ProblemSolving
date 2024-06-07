import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(PermutationSubsetsArrays("","abc"));
    }
    static void PermutationSubsets(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String Second=p.substring(i,p.length());
            PermutationSubsets(first+ch+Second,up.substring(1));

        }
    }
    static ArrayList<String> PermutationSubsetsArrays(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String Second=p.substring(i,p.length());
            ans.addAll(PermutationSubsetsArrays(first+ch+Second,up.substring(1))) ;

        }
        return ans;
    }
}
