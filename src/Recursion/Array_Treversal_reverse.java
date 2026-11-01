package Recursion;
import java.util.*;
public class Array_Treversal_reverse {
  public static void treversal(int arr[],int index) {
	  if(index==arr.length) {
		  return;
	  }
	  System.out.print(arr[index]+" ");
	  treversal(arr,index+1);
  }
  public static void reverse(int arr[],int index) {
	  if(index==arr.length) {
		  return;
	  }
	  reverse(arr,index+1);
	  System.out.print(arr[index]+" ");
  }
public static void prefix(int arr[],int index) {
	if(index==0) {
		System.out.print(arr[0]+" ");
		  return;
	  }
	  prefix(arr,index-1);
	   int a=(arr[index]+arr[index-1]);
		  System.out.print(a+" ");
}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		treversal(arr,0);
		System.out.println();
		reverse(arr,0);
		System.out.println();
		prefix(arr,arr.length-1);

	}

}
