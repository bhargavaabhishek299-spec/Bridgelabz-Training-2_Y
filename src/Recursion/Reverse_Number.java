package Recursion;
import java.util.*;
public class Reverse_Number {
	 public static void printA(int n) {
	    	//Base case
	    	if(n==1) {
	    		 System.out.print(n+" ");
	    		 return;
	    	}
	    	//self work
	    	System.out.print(n+" ");
	    	//Recursive work[next step this methord]
	    	printA(n-1);
	    }
		public static void main(String[] args) {
	          printA(6);
		}
}
