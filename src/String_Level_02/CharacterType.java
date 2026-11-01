package String_Level_02;
import java.util.*;
public class CharacterType {
    public static String checkCharacter(char ch){
        if(ch>='A'&&ch<='Z')ch=(char)(ch+32);
        if(ch<'a'||ch>'z')return "Not a Letter";
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')return "Vowel";
        return "Consonant";
    }
    public static String[][] getCharacterTypes(String s){
        String[][] result=new String[s.length()][2];
        for(int i=0;i<s.length();i++){
            result[i][0]=String.valueOf(s.charAt(i));
            result[i][1]=checkCharacter(s.charAt(i));
        }
        return result;
    }
    public static void display(String[][] arr){
        System.out.println("Character\tType");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+"\t\t"+arr[i][1]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String s=sc.nextLine();
        String[][] result=getCharacterTypes(s);
        display(result);
    }
}
