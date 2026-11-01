package String_Level_02;
import java.util.*;
public class TrimString {
	public static int[] findTrimIndex(String s){
        int start=0,end=s.length()-1;
        while(start<s.length()&&s.charAt(start)==' ')start++;
        while(end>=start&&s.charAt(end)==' ')end--;
        return new int[]{start,end+1};
    }
    public static String getSubstring(String s,int start,int end){
        String result="";
        for(int i=start;i<end;i++){
            result+=s.charAt(i);
        }
        return result;
    }
    public static boolean compare(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String s=sc.nextLine();
        int[] index=findTrimIndex(s);
        String result1=getSubstring(s,index[0],index[1]);
        String result2=s.trim();
        System.out.println("User-defined trim: "+result1);
        System.out.println("Built-in trim: "+result2);
        System.out.println("Both are same: "+compare(result1,result2));
    }
}