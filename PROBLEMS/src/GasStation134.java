public class GasStation134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int j=0;
        for (int i = 0; i < gas.length ; i++) {
            int k=gas[i]-cost[i]+gas[i+1];
            if(k>0){
                j=gas[i];
                return j+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []gas={1,2,3,4,5};
        int []cost={3,4,5,1,2};
        GasStation134 k=new GasStation134();
        System.out.println(k.canCompleteCircuit(gas,cost));

    }
}
