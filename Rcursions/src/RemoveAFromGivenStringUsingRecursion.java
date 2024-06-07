public class RemoveAFromGivenStringUsingRecursion {
    public static void main(String[] args) {
        System.out.println(SkipStringAppNotApple("applkehdh"));
    }
    static void Skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch == 'a'){
            Skip(p,up.substring(1));
        }else{
            Skip(p+ch,up.substring(1));
        }
    }

    static String SkipString(String up){
        if(up.isEmpty()){

            return " ";
        }

        if(up.startsWith("apple")){
            return SkipString(up.substring(5));
        }else{
            return up.charAt(0)+SkipString(up.substring(1));
        }
    }

    static String SkipStringAppNotApple(String up){
        if(up.isEmpty()){

            return " ";
        }

        if(up.startsWith("app")&& !up.startsWith("apple")){
            return SkipStringAppNotApple(up.substring(3));
        }else{
            return up.charAt(0)+SkipStringAppNotApple(up.substring(1));
        }
    }




}
