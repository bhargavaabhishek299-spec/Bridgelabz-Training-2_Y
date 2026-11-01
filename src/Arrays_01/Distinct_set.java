package Arrays_01;
import java.util.*;
public class Distinct_set {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		HashSet<Integer> set =new HashSet<>();
		int a=sc.nextInt();
		for(int i=0;i<a;i++) {
			set.add(sc.nextInt());
		}
		Integer[] arr=set.toArray(new Integer[0]);
		System.out.println(Arrays.toString(arr));
	}

}
