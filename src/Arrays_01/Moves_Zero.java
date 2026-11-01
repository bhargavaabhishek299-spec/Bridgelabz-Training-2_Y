package Arrays_01;
import java.util.*;
public class Moves_Zero {
public static void main(String[]args) {
	 int []a= {0,2,0,3,0,4};
	 int j=0;
	 int []arr=new int[a.length];
	 for(int i=0;i<arr.length;i++) {
		 if(a[i]!=0) {
			 arr[j]=a[i];
			 j++;
		 }
	 }
	 for(int i:arr) {
		System.out.print("\t"+i); 
	 }
}
}
