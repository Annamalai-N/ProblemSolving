public class FlippingImageGoogle832 {
    public static void main(String[] args) {

    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row:image){
            for (int i=0;i<(image[0].length)/2;i++){
                int temp=row[i]^1;
                row[i]=row[image[0].length-i-1]^1;
                row[image[0].length-i-1]=temp;

            }
        }
        return image;
    }
}
