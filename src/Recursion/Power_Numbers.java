package Recursion;
import java.util.*;
public class Power_Numbers {
     public static int pow(int p,int q) {
    	 if(q==0) {
    		 return 1;
    	 }
    	 int small=pow(p,q-1);
    	 return p*small;
     }
	public static void main(String[] args) {
         System.out.print(pow(3,3));
	}

}
