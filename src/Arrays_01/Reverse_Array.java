package Arrays_01;
import java.util.*;
public class Reverse_Array {
public static int[] swap(int[] a) {
	int i=0;
	int j=a.length-1;
	while(i<j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}
	return a;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int []arr=new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		swap(arr);
          System.out.println(Arrays.toString(arr));
	}

}
