package Recursion;
import java.util.*;
public class GCD {
public static int gcd(int a,int b) {
	if(b == 0) {
	return a;
	}
    return gcd(b,a%b);
}
public static int lcm(int a,int b) {
	if(b == 0) {
	return a;
	}
    return (a/b)*gcd(b,a%b);
}
	public static void main(String[] args) {
		System.out.print(gcd(12,16));
		System.out.println();
		System.out.print(gcd(12,16));
	}
}