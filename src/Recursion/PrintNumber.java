package Recursion;
import java.util.*;
public class PrintNumber {
    public static void printA(int n) {
    	//Base case
    	if(n==1) {
    		 System.out.print(n+" ");
    		 return;
    	}
    	//Recursive work[next step this methord]
    	printA(n-1);
    	//self work
    	System.out.print(n+" ");
    
    }
	public static void main(String[] args) {
          printA(6);
	}

}
