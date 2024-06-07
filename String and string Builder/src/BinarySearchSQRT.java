public class BinarySearchSQRT {
    public static void main(String[] args) {
        int p=40;
        int d=2;
        System.out.println(sqrt(p,d));
    }
    static double sqrt(int n, int d){
        int s=0;
        int e=n;
        double root=0.0;

        while(s<=e){
            int m=s+(e-s)/2;
            if(m*m ==n){
                root=m;
                return root;
            }
            if(m*m>n){
                e=m-1;
            }
            else{
                s=m+1;
            }

        }
        double incr=0.1;
        for(int i=0;i<d;i++){
            while(root*root<=n){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;

    }
}
