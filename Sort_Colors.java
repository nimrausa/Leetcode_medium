public class Sort_Colors {
	class Solution {
    public void sortColors(int[] nums) {
        sort(nums);
    }
    public static void sort(int [] arr){
        int i=0;
        int k=0;
        int j=arr.length-1;

        while(k<=j){
            if(arr[k]==2){
                int temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
                j--;
                
            }
           else if(arr[k]==0){
               int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
                i++;
                k++;
           }
           else{
               k++;
           }
        }
    }

}
}