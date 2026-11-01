package String_Level_03;
import java.util.*;
public class CharacterFrequency {
	 public static String[][] findFrequency(String s){
	        int[] freq=new int[256];
	        for(int i=0;i<s.length();i++){
	            freq[s.charAt(i)]++;
	        }
	        int count=0;
	        for(int i=0;i<256;i++){
	            if(freq[i]>0)count++;
	        }
	        String[][] result=new String[count][2];
	        int index=0;
	        for(int i=0;i<256;i++){
	            if(freq[i]>0){
	                result[index][0]=String.valueOf((char)i);
	                result[index][1]=String.valueOf(freq[i]);
	                index++;
	            }
	        }
	        return result;
	    }
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter text: ");
	        String s=sc.nextLine();
	        String[][] result=findFrequency(s);
	        System.out.println("Character\tFrequency");
	        for(int i=0;i<result.length;i++){
	            System.out.println(result[i][0]+"\t\t"+result[i][1]);
	        }
	    }
}
