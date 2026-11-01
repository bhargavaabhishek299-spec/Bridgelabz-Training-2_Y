package Recursion_03;
import java.util.*;
public class Methords_Stack {
   public static void function1() {
	   int x=1;
	   function2();
	   System.out.print("\n"+x);
   }
   public static void function2() {
	   int x=2;
	   function3();
	   System.out.print("\n"+x);
   }
   public static void function3() {
	   int x=3;
	   System.out.print("\n"+x);
   }
	public static void main(String[] args) {
		
        function1();
	}

}
