
public class Largest_Number {

	 public String largestNumber(int[] nums) {
	        String s="";
	         largest(nums);
	         for(int i=0 ; i<nums.length; i++){
	           s=s+nums[i];
	        }
	         if (s.substring(0,1).equals("0")) {
	             return "0";
	         }

	        return s;

	         
	    }
	    public static void largest(int [] arr){
	        for(int turn=1; turn<arr.length; turn++){
	        for(int i=0; i<arr.length-turn; i++){
	           
	                if(compare(arr[i],arr[i+1])>0){
	                    int t=arr[i];
	                    arr[i]=arr[i+1];
	                    arr[i+1]=t;
	                     
	                }
	            
	        }
	        
	        }
	     
	    }
	    public static int compare(int x1, int x2){
	        String s1="" + x1+x2;
	        String s2=""+ x2+x1;
	        if(Long.parseLong(s2)>Long.parseLong(s1)){
	            return 1;
	        }
	            else{
	                return -1;
	            }
	        

	    }
}
