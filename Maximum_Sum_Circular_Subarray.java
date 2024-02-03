
public class Maximum_Sum_Circular_Subarray {

	public int maxSubarraySumCircular(int[] nums) {
	       return maximumsum(nums);
	        
	    }
	    public static int maximumsum(int [] arr){
	        int linear_kadane=kadane(arr);
	        int sum=0;

	        for(int i=0;i<arr.length; i++){
	            sum+=arr[i]; //total sum
	            arr[i]=arr[i]* -1; //inverted array
	        }
	        int Inverted_array=kadane(arr);//max of inverted array
	        if(Inverted_array != sum * -1){ //if it gets equal than if the  ///array has all negative value the ans=0;
	            sum=sum+Inverted_array; 
	        } 
	        return Math.max(sum, linear_kadane);


	    }
	    public static int kadane(int [] arr){
	        int prevsum=0;
	        int ans=Integer.MIN_VALUE;
	        for(int i=0;i<arr.length; i++){
	            prevsum+=arr[i];
	            ans=Math.max(prevsum,ans);
	            if(prevsum<0){
	                prevsum=0;
	            }
	        }
	        return ans;
	    }

	}
