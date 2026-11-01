package Arrays_01;
import java.util.*;
public class Binary_Search_Methord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,7,8,9,25,30};
		int target=sc.nextInt();
		int index=Arrays.binarySearch(arr,target);
            System.out.print(index);
	}
}