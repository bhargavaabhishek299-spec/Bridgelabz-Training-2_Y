package Arrays_01;
import java.util.*;
public class Palindrome {
	public static void pali(int n) {
		int b=n;
		int c=0;
		while(n!=0) {
			c=(c*10)+n%10;
			n=n/10;
		}
		if(c==b) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args) {
	
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         pali(a);
	}

}
