
public class Product_of_Array_Except_Self {

	class Solution {
	    public int[] productExceptSelf(int[] nums) {
	        return product(nums);
	    }
	    public static int [] product(int [] arr){
	        int [] left=new int [arr.length];
	        left[0]=1;
	        int [] right=new int [arr.length];
	        right[arr.length-1]=1;
	        for(int i=1 ;i<arr.length; i++){
	            left[i]=arr[i-1]*left[i-1];
	        }
	        for(int i=arr.length-2 ;i>=0; i--){
	            right[i]=right[i+1]*arr[i+1];
	        }
	        for(int i=0 ;i<arr.length; i++){
	            arr[i]=right[i]*left[i];
	        }
	        return arr;
	    }
	}
}