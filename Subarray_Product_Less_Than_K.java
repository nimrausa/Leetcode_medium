
public class Subarray_Product_Less_Than_K {

	class Solution {
	    public int numSubarrayProductLessThanK(int[] nums, int k){
	        return product(nums,k);
	        
	    }
	    public static int product(int [] arr, int k){
	        int si=0;
	        int ei=0;
	        int ans=0;
	        int p=1;
	        while(ei<arr.length){
	            p=p*arr[ei];
	            while(p>=k && si<=ei){
	                p=p/arr[si];
	                si++;
	            }
	            ans=ans+(ei-si+1);
	            ei++;

	        }
	        return ans;
	    } 
	}

}
