public class OddEvenusingbinary {
    public static void main(String[] args) {
        int n=67;
        System.out.println(isodd(n));
    }
    private  static boolean isodd(int n){
        return (n&1)==1;
    }
}
