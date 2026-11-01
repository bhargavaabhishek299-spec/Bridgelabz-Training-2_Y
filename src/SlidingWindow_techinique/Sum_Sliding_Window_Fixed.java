package SlidingWindow_techinique;
import java.util.*;
public class Sum_Sliding_Window_Fixed {   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
       int b=sc.nextInt();
       int sum=0;
       for(int i=0;i<b;i++) {
    	   sum=sum+arr[i];//6
       }
       System.out.println(sum);
       for(int i=1;i<=arr.length-b;i++) {
    	   sum=sum-arr[i-1]+arr[i+b-1];//=6-1+4|9-2+5
       System.out.println(sum);
       }
	}

}