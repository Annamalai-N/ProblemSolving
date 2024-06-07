public class KarpRabinAlgorithm {
    private final int k=101;
    private double CalculateHashOfAString(String str){
        double hash=0;
        for (int i = 0; i < str.length(); i++) {
            hash= hash+str.charAt(i)*Math.pow(k,i);

        }
        return hash;
    }
    private double UpdateHash(double prevHash,char oldc,char newc,int patternLength){
        double Newhash= (prevHash-oldc)/k;
        Newhash=Newhash+newc*Math.pow(k,patternLength-1);
        return Newhash ;
    }
    public void SearchFor(String text,String Pattern){
        int patternLength=Pattern.length();
        double PatternHash=CalculateHashOfAString(Pattern);
        double TextHash=CalculateHashOfAString(text.substring(0,patternLength));
        for (int i = 0; i < text.length()-patternLength; i++) {
            if (TextHash==PatternHash){
                if(text.substring(i,i+patternLength).equals(Pattern)){
                    System.out.println("pattern found at index:"+i);

                }
            }
            if (i <text.length()-patternLength) {
                TextHash=UpdateHash(TextHash,text.charAt(i),text.charAt(i+patternLength),patternLength);
            }
        }
    }
}
