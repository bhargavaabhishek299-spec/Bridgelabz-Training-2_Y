package String_Level_02;
import java.util.*;
public class VowelConsonantCount {
       public static void count(String s) {
    	   int c=0,v=0;
    	   for(int i=0;i<s.length();i++) {
    		   char ch=s.charAt(i);
    		   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
    			   v++;
    		   }
    		   else {
    			   c++;
    		   }
    	   }
    	   System.out.println("Consonant-> "+c+"Vowel-> "+v);
    	   
       }
       public static void main(String []args) {
    	   Scanner sc=new Scanner (System.in);
    	   System.out.println("Enter String");
    	   String s=sc.nextLine();
    	   System.out.println("Result");
    	   count(s);
       }
}
