
public class Palindromic_Substrings {

	public int countSubstrings(String s) {
        int count=0;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
               String str=s.substring(i,j);
                if(ispalindrome(str)==true){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean ispalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
