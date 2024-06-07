import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
      int[][] arr={
              {1,2,3},
              {4,5,6},
              {7,8,9}
      };
        System.out.println(Arrays.toString(SearchMatrix(arr,6)));
    }

    // search in the row provided in the column with start and end
    static int[] BinarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
            while(cStart<=cEnd){
                int mid= cStart+(cEnd-cStart)/2;
                if(matrix[row][mid]==target){
                    return new int[]{row,target};

                }
                if(matrix[row][mid]<target){
                    cStart=mid+1;
                }else{
                    cEnd=mid-1;
                }

            }
            return new int[]{-1,-1};
    }
    static int[] SearchMatrix(int[][] matrix, int target){
        int r=matrix.length-1;
        int col= matrix[0].length;

        if(r==1){
            return BinarySearch(matrix,0,0,col,target);
        }
        int rstart=0;
        int rend=r;
        int cmid=col/2;

        while(rstart<rend-1){ //while this is true it will have more than 2 rows
            int rMid=rstart+(rend-rstart);
            if (matrix[rMid][cmid]==target){
                return new int[]{rMid,cmid};
            }
            if(matrix[rMid][cmid]<target){
                rstart=rMid;
            }else{
                rend=rMid;
            }


        }
        if(matrix[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        if(matrix[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
        }
        if(target<=matrix[rstart][cmid-1]){
            // search in first half
            return BinarySearch(matrix,rstart,0,cmid-1,target);
        }
        if(target>=matrix[rstart][cmid+1] && target <=matrix[rstart][col-1]){
            // search in second  half
            return BinarySearch(matrix,rstart,cmid+1,col-1,target);
        }
        if(target<=matrix[rstart+1][cmid-1] ){
            // search in 3rd half
            return BinarySearch(matrix,rstart+1,0,cmid-1,target);
        }else{
            return BinarySearch(matrix,rstart+1,cmid+1,col-1,target);
        }


    }
}
