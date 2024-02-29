
public class Subarray_Sums_Divisible_by_K {

	  public int subarraysDivByK(int[] nums, int k) {
	        return divide(nums, k);
	        
	    }
	    public static int divide(int [] arr, int n){
	        long sum=0;
	        int count=0;
	        int [] frq=new int [n];
	        frq[0]=1;
	        for(int i=0 ; i<arr.length; i++){
	            sum =sum+arr[i];
	            int idx=(int) (sum%n);
	            if(idx<0){
	                idx=idx+n;
	            }
	            frq[idx]=frq[idx]+1;
	        }
	        for(int i=0; i<n ; i++){
	            if(frq[i]>=2){
	                int total=frq[i];
	                count=count+(total*(total-1)/2);
	            }

	        }
	        return count;

	    }

}
