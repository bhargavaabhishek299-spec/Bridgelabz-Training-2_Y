package Arrays_01;
import java.util.*;
public class Replace {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String a=sc.nextLine();
		char[]b=a.toCharArray();
		System.out.println(Arrays.toString(b));
		a=a.replace("hello", "Abhishek");
		System.out.println(a);

	}

}
