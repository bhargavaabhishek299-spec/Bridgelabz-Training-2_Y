package Arrays_01;
import java.util.*;
public class Minimum_Element_Array {
public static int min(int[]a) {
	int min=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++) {
		if(min>a[i]) {
			min=a[i];
		}
	}
	return min;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int []arr=new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
       System.out.println(min(arr));
	}

}