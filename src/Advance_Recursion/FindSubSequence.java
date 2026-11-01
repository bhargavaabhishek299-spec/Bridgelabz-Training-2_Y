package Advance_Recursion;
import java.util.*;
public class FindSubSequence {
public static ArrayList<String> ssq(String s){
	ArrayList<String> ans=new ArrayList<>();
	if(s.length()==0) {
		ans.add(" ");
		return ans;
	}
	char ch=s.charAt(0);
	ArrayList<String> smallans=ssq(s.substring(1));
	for(String ss:smallans) {
		ans.add(ss);
		ans.add(ch+ss);
	}
	return ans;
}
public static void ssqvoid(String s){
	ArrayList<String> ans=new ArrayList<>();
	if(s.length()==0) {
		ans.add(" ");
		System.out.println(ans);
		return;
	}
	char ch=s.charAt(0);
	ArrayList<String> smallans=ssq(s.substring(1));
	for(String ss:smallans) {
		ans.add(ss);
		ans.add(ch+ss);
	}
	System.out.println(ans);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println(ssq(a));
	ssqvoid("abc");
		
	}

}
