//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class TwoStacks{
    static int twoStacks(int x,int[] a, int[] b){
        return twoStacksB(x,a,b,0,0)-1;
    }
    private static int twoStacksB(int x,int[] a, int[] b, int sum, int count){
        if(sum>x){
            return count;
        }
        if(a.length==0||b.length==0){
            return count;
        }
        int ans1=twoStacksB(x,Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);
        int ans2=twoStacksB(x,a,Arrays.copyOfRange(b,1,b.length),sum+b[0],count+1);
        return Math.max(ans1,ans2);
    }
}