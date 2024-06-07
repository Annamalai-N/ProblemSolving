import java.util.ArrayList;

public class PrefixXOR2433 {
    public int[] findArray(int[] pref) {
        int[] newArray = new int[pref.length];
        newArray[0]=pref[0];

        for (int i = 0; i < pref.length-1; i++) {
            int k=pref[i];
            newArray[i+1]=k^pref[i+1];
        }
        return newArray;
    }
}
