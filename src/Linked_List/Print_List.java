package Linked_List;
import java.util.*;
public class Print_List {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			Node ai=new Node(sc.nextInt());
			ai.next=ai;
		}
//		Node a=new Node(1);
//		Node b=new Node(2);
//		Node c=new Node(3);
//		Node d=new Node(4);
//		Node e=new Node(5);
//		a.next=b;
//		b.next=c;
//		c.next=d;
//		d.next=e;
//		System.out.println("Trick 1");
//		System.out.print(a.data+" -> ");
//		System.out.print(b.data+" -> ");
//		System.out.print(c.data+" -> ");
//		System.out.print(d.data+" -> ");
//		System.out.print(e.data+" -> ");
//		System.out.print(e.next);
//		System.out.println();
//		System.out.println("Trick 2");
//		System.out.print(a.data+" -> ");
//		System.out.print(a.next.data+" -> ");
//		System.out.print(a.next.next.data+" -> ");
//		System.out.print(a.next.next.next.data+" -> ");
//		System.out.print(a.next.next.next.next.data);
	}
}