package String_Level_03;
import java.util.*;
public class FrequencyUsingUnique {
	public static char[] uniqueCharacters(String s){
        char[] temp=new char[s.length()];
        int count=0;
        for(int i=0;i<s.length();i++){
            boolean found=false;
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    found=true;
                    break;
                }
            }
            if(!found){
                temp[count]=s.charAt(i);
                count++;
            }
        }
        char[] result=new char[count];
        for(int i=0;i<count;i++){
            result[i]=temp[i];
        }
        return result;
    }
    public static String[][] findFrequency(String s){
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        char[] unique=uniqueCharacters(s);
        String[][] result=new String[unique.length][2];
        for(int i=0;i<unique.length;i++){
            result[i][0]=String.valueOf(unique[i]);
            result[i][1]=String.valueOf(freq[unique[i]]);
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
