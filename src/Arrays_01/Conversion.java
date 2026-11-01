package Arrays_01;
import java.util.*;
public class Conversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<5;i++) {
			set.add(sc.nextInt());
		}
		ArrayList<Integer> list=new ArrayList<>(set);
		Collections.sort(list);
		System.out.print(list);
		

	}

}
