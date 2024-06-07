import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        Insertion(arr);
        
        System.out.println(Arrays.toString(arr));
    }

    static void SelctionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the maximum value in remaining array to swap it to the correct index
            int last = arr.length - i - 1;
            int mak = getmax(arr, 0, last);
            swapArray(arr,mak,last);
        }
    }

    static void Insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swapArray(arr,j,j-1);

                }else{
                    break;
                }
            }

        }
    }
     static void swapArray(int[]arr,int first,int second){
         int temp=arr[first];
         arr[first]=arr[second];
         arr[second]=temp;

        }

    private static int getmax(int[] arr,int start,int end){
            int m=start;
            for(int i=start;i<=end;i++){
                if(arr[m]<arr[i]){
                    m=i;
                }
            }
      return m;
    }

    static void BSort(int[] arr){
        boolean Swapped;
        // runs the steps n-1 times
        for(int i=0;i<arr.length-1;i++){
            Swapped=false;

          //for each step, max item will come at the end
          for(int j=1;j<=arr.length-i-1;j++){
              //swap if the element is smaller than the previous item
              if(arr[j]<arr[j-1]){
                  int temp=arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;
                  Swapped=true;
              }
          }
          //if  you did not swap for particular array te array is swapped already
            if(!Swapped){
                break;
            }
        }

    }
}
