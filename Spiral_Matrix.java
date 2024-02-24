import java.util.*;

public class Spiral_Matrix {

	class Solution {
	    public List<Integer> spiralOrder(int[][] matrix) {
	        List<Integer> list=new ArrayList<>();
	        spiral(matrix,list);
	        return list;
	        
	    }
	    public static void spiral(int [] [] arr, List<Integer> list){
	        int minr=0;
	        int maxr=arr.length-1;
	        int minc=0;
	        int maxc=arr[0].length-1;
	        int c=0;
	        int te=arr.length*arr[0].length;
	        while(c<te){
	            for(int i=minc; i<=maxc && c<te ; i++){
	                list.add(arr[minr][i]);
	                c++;
	            }
	            minr++;
	            
	            for(int i=minr; i<=maxr && c<te; i++){
	                list.add(arr[i][maxc]);
	                c++;
	            }
	            maxc--;
	            for(int i=maxc; i>=minc && c<te; i--){
	                list.add(arr[maxr][i]);
	                c++;
	            }
	            maxr--;
	            for(int i=maxr; i>=minr && c<te; i--){
	                list.add(arr[i][minc]);
	                c++;
	            }
	            minc++;
	        }
	        
	    }
	}
}
