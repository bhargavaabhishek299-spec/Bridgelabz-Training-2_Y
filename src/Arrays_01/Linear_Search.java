package Arrays_01;
import java.util.*;
public class Linear_Search {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int []arr= {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			if(a==arr[i]) {
				System.out.println(i);
			}
		}
	}

}
