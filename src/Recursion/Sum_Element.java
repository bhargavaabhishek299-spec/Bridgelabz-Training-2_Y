package Recursion;
import java.util.*;
public class Sum_Element {
   public static int sum(int []arr,int index) {
	   if(index==arr.length) {
		   return 0;
	   }
	   int add=sum(arr,index+1);
	   return add+arr[index];
   }
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7,8,9,10};
	  System.out.print(sum(arr,0));
	}
}