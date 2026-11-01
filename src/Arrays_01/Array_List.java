package Arrays_01;
import java.util.*;
public class Array_List {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> list=new LinkedList<>();
    list.add(20);
    list.add(30);
    System.out.print(list);
    Collections.reverse(list);
    System.out.print(list);
    list.add(1,70);
    System.out.print(list);
    System.out.print(list.get(1));
    list.set(0, 100);
    System.out.print(" "+list);
    list.remove(0);
    System.out.print(" "+list);
    System.out.print(" "+list.size());
    System.out.print(" "+list.contains(70));
    Collections.sort(list);
    System.out.print(" "+list);
    list.clear();
    System.out.print(" "+list);
    
	}
}