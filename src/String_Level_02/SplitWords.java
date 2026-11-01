package String_Level_02;
import java.util.*;
public class SplitWords {
	public static int findLength(String s){
        int count=0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }
        }
        catch(StringIndexOutOfBoundsException e){
            return count;
        }
    }
    public static String[] getWords(String s){
        int n=findLength(s);
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        String[] words=new String[count+1];
        int start=0,index=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                if(i>start){
                    String word="";
                    for(int j=start;j<i;j++){
                        word+=s.charAt(j);
                    }
                    words[index++]=word;
                }
                start=i+1;
            }
        }
        if(start<n){
            String word="";
            for(int j=start;j<n;j++){
                word+=s.charAt(j);
            }
            words[index++]=word;
        }
        String[] result=new String[index];
        for(int i=0;i<index;i++){
            result[i]=words[i];
        }
        return result;
    }
    public static boolean compare(String[] a,String[] b){
        if(a.length!=b.length)return false;
        for(int i=0;i<a.length;i++){
            if(!a[i].equals(b[i]))return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String s=sc.nextLine();
        String[] a=getWords(s);
        String[] b=s.trim().split("\\s+");
        System.out.println("result:");
        for(String x:a)System.out.println(x);
        System.out.println("result:");
        for(String x:b)System.out.println(x);
        System.out.println("Both are same: "+compare(a,b));
    }
}
