package Advance_Recursion;
import java.util.*;
public class TowerOfHanoi {
public static void tho(int n,char source,char helper,char destination) {
	if(n==1) {
		System.out.println(" move disk 1from "+source+" to "+destination);
		return;
	}
	tho(n-1,source,destination,helper);
	System.out.println(" move disk "+n+" from "+source+" to "+destination);
	tho(n-1,helper,source,destination);
}
	public static void main(String[] args) {
		int n=3;
		tho(n,'a','b','c');

	}

}
