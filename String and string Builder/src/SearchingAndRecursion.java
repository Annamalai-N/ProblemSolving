import java.util.ArrayList;

public class SearchingAndRecursion {
    public static void main(String[] args) {
            int[]arr={5,6,7,8,9,1,2,3};
        System.out.println(RotatedBinarySearch(arr,4,0,arr.length-1) );
    }
    static boolean find(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }

    static int findi(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return findi(arr,target,index+1);
        }
    }

    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(index==arr.length){
            return list;
        }
        //this will contain answer for only that function call only
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> AnswerFromBelowCalls= findAllIndex(arr,target,index+1);
        list.addAll(AnswerFromBelowCalls);
        return list;

    }

    static int RotatedBinarySearch(int[]arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;

        }
        if(arr[s]<=arr[m]){
            if(target>=arr[s] && target<=arr[m]){
                return RotatedBinarySearch(arr,target,s,m-1);
            }else{
                return RotatedBinarySearch(arr,target,m+1,e);
            }
        }
        if(target>=arr[m] && target<=arr[e]){
            return RotatedBinarySearch(arr,target,m+1,e);
        }
        return RotatedBinarySearch(arr,target,s,m-1);
    }
}
