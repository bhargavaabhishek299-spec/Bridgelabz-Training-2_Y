package String_Level_03;
import java.util.*;
public class UniqueCharacters {
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
    public static char[] uniqueCharacters(String s){
        int n=findLength(s);
        char[] temp=new char[n];
        int count=0;
        for(int i=0;i<n;i++){
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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String s=sc.nextLine();
        char[] result=uniqueCharacters(s);
        System.out.println("Unique characters:");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
