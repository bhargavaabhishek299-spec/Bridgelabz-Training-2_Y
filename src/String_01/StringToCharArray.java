package String_01;
import java.util.*;
public class StringToCharArray {
	public static char[] getCharacters(String s) {
        char[] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }
    public static boolean compare(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        char[] arr1 = getCharacters(text);
        char[] arr2 = text.toCharArray();
        System.out.println("User-defined array:");
        for (char x : arr1) {
            System.out.print(x + " ");
        }
        System.out.println("\nBuilt-in array:");
        for (char x : arr2) {
            System.out.print(x + " ");
        }
        System.out.println("\nBoth arrays are same: " + compare(arr1, arr2));
    }
}