package Leetcode_Problems;
import java.util.*;
public class Two_Sum_II_167 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int t=sc.nextInt();
        int start=0;
        int end=arr.length-1;
        while(start<end){
        	int sum=arr[start]+arr[end];
        	if(sum<t) {
        		start++;
        	}
        	if(sum>t) {
        		end--;        	}
        	if(sum==t) {
        		int n[]= {start+1,end+1};
        		System.out.println(n);
        	}
        	
        }
        
	}

}
