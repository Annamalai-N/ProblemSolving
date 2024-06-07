class LeetcodeMediumLongestSubstringWithoutRepeatingCharcters {
    public int lengthOfLongestSubstring(String s){

        String k= SkipString(s);
        return k.length();
    }
    static String SkipString(String up){
    
        if(up.isEmpty()){

            return " ";
        }
        
        String mak="";
        for(int i=0;i<up.length();i++){
            String ch=up.substring(0,1);
            if(!ch.equals(up.substring(i,i+1))){
                mak+=ch;
                up=up.substring(i);
            }
            
        }
        return mak;
        
    }
}  