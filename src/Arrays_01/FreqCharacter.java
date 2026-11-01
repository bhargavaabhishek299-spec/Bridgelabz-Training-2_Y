package Arrays_01;
import java.util.*;
public class FreqCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int freq[]=new int[26];
         for(int i=0;i<s.length();i++) {
        	 freq[s.charAt(i)-'a']++;
         }
         for(int i=0;i<s.length();i++) {
        	 char c=s.charAt(i);
        	 int b=freq[s.charAt(i)-'a'];
        	 if(b==1) {
        		 System.out.println(c);
        		 break;
        	 }
         }
         
         HashSet<Character> set=new HashSet<>();
         for(int i=0;i<s.length();i++) {
        	 char c=s.charAt(i);
        	 int b=freq[s.charAt(i)-'a'];
        	 if(!set.contains(c)) {
        		 System.out.println(c+" "+b);
        	 }
        	 set.add(c);
         }
	}

}
