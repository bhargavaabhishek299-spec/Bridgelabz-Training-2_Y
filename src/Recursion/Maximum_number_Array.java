package Recursion;
import java.util.*;
public class Maximum_number_Array {
public static int max(int[]arr,int index) {
	if(index==arr.length-1) {
		return arr[index];
	}
	int small=max(arr,index+1);
	return Math.max(arr[index], small);
}
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,9,6,8,3};
	System.out.print(max(arr,0));

	}

}
