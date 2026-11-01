package Recursion;
import java.util.*;
public class Print_String {
	public static void print(String a,int i) {
		if(i==a.length()) {
			return;
		}
		System.out.print(a.charAt(i));
		print(a,i+1);
	}
	public static void printreverse(String a,int i) {
		if(i==a.length()) {
			return;
		}
		printreverse(a,i+1);
		System.out.print(a.charAt(i));
	}
	public static boolean palindrom(String a,int start,int end) {
		if(start>=end) {
			return true;
		}
		if(a.charAt(start)!=a.charAt(end)) {
			return false;
		}
		return palindrom(a,start+1,end-1);
		
	}
	public static  String remove(String a,int i) {
		if(i==a.length()) {
			return "";
		}
		String small=remove(a,i+1);
		char ch=a.charAt(i);
		if(ch!='a') {
			return ch+small;
		}
        return small;
	}
	public static int binarysearch(int []arr,int start,int end,int target) {
		if(start>end) {
			return -1;
		}
		int mid=start+(end-start)/2;
		if(arr[mid]==target) {
			return mid;
		}
		if(arr[mid]>target) {
			return binarysearch(arr,start,end-1,target);
		}
		return binarysearch(arr,start+1,end,target);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		print(a,0);
		System.out.println();
        printreverse(a,0);
        System.out.println();
        System.out.println(palindrom(a,0,a.length()-1));
        System.out.println();
        System.out.println(remove(a,0));
        int []arr= {1,10,15,100};
		int target=15;
		System.out.println(binarysearch(arr,0,arr.length-1,target));
	}
}
