public class GCDAndLCM {
    public static void main(String[] args) {
        System.out.println(Lcm(4,9));
    }
    static int gcd(int a ,int b){
        if(a==0){
            return b;
        }

        return gcd(b%a,a);
    }

    static int Lcm(int a , int b){

        return a*b/gcd(a,b);
    }
}
