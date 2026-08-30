package Arrays_01;
import java.util.*;
public class Maximum_Element_Array {
public static int max(int[]a) {
	int max=Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
		}
	}
	return max;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int []arr=new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
       System.out.println(max(arr));
	}

}