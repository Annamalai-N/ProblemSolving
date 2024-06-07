import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factor3(20);
    }
    static void factor2(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }

    }
    static void factor3(int n){
        ArrayList<Integer> k=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" ");
                    k.add(n/i);
                }
            }
        }
        for(int i=k.size()-1;i>=0;i--){
            System.out.print(k.get(i)+" ");
        }
    }
}
