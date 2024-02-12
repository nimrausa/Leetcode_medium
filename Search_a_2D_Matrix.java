
public class Search_a_2D_Matrix {

	public boolean searchMatrix(int[][] arr, int target) {
        int row=0;
        int col=arr[0].length-1;

        while(row<=arr.length-1 && col>=0){
            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col]>target){
                    col--;
                }
            else{
                row++;
            }
            
           
        }
         return false;
        
    }

}
