package String_Level_03;
import java.util.*;
public class PalindromeCheck {
	   public static boolean check1(String s){
	        int i=0,j=s.length()-1;
	        while(i<j){
	            if(s.charAt(i)!=s.charAt(j)){
	                return false;
	            }
	            i++;
	            j--;
	        }
	        return true;
	    }
	    public static boolean check2(String s,int i,int j){
	        if(i>=j)return true;
	        if(s.charAt(i)!=s.charAt(j))return false;
	        return check2(s,i+1,j-1);
	    }
	    public static char[] reverse(String s){
	        char[] arr=new char[s.length()];
	        int index=0;
	        for(int i=s.length()-1;i>=0;i--){
	            arr[index]=s.charAt(i);
	            index++;
	        }
	        return arr;
	    }
	    public static boolean check3(String s){
	        char[] arr=s.toCharArray();
	        char[] rev=reverse(s);
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]!=rev[i]){
	                return false;
	            }
	        }
	        return true;
	    }
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter text: ");
	        String s=sc.nextLine();
	        System.out.println("Using loop: "+check1(s));
	        System.out.println("Using recursion: "+check2(s,0,s.length()-1));
	        System.out.println("Using character array: "+check3(s));
	    }
}
