
public class Maximum_Subarray {

	public int maxSubArray(int[] nums) {
	       return maximum(nums);
	    }
	    public static int maximum(int [] arr){
	        int ans=Integer.MIN_VALUE;
	        int sum=0;
	        for(int i=0; i<arr.length; i++){
	                sum=sum+arr[i];
	            ans=Math.max(ans,sum);
	            if(sum<0){
	                sum=0;
	            }
	        }
	    
	        return ans;
	    }
}
