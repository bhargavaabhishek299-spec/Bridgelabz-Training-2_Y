package Advance_Recursion;
import java.util.*;
public class BasicLinkedList {
	public static void display(Node head) {
		while(head!=null) {
			System.out.print(head.data+" -> ");
			head=head.next;
		}
	}
	public static void recursive(Node head) {
		if(head==null) {
			return ;
		}
		System.out.print(head.data+" -> ");
		recursive(head.next);
	}
public static class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
	}
}
	public static void main(String[] args) {
		Node a=new Node(10);
		Node b=new Node(20);
		Node c=new Node(30);
		Node d=new Node(40);
		Node e=new Node(50);
		Node f=new Node(60);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		System.out.println("trick 1");
		System.out.print(a.data+" -> ");
		System.out.print(b.data+" -> ");
		System.out.print(c.data+" -> ");
		System.out.print(d.data+" -> ");	
		System.out.print(e.data+" -> ");
		System.out.print(f.data+" -> ");
		System.out.print(f.next+" -> ");
		System.out.println();
		System.out.println("trick 2");
		System.out.print(a.data+" -> ");
		System.out.print(a.next.data+" -> ");
		System.out.print(a.next.next.data+" -> ");
		System.out.print(a.next.next.next.data+" -> ");	
		System.out.print(a.next.next.next.next.data+" -> ");
		System.out.print(a.next.next.next.next.next.data+" -> ");
		System.out.print(a.next.next.next.next.next.next+" -> ");
		System.out.println();
		System.out.println("trick 3");
		Node temp=a;
		for(int i=0;i<6;i++) {
			System.out.print(temp.data+" -> ");
		      temp=temp.next;
		}
		System.out.println();
		System.out.println("trick 4");
		Node temp2=a;
	         while(temp2!=null){
			System.out.print(temp2.data+" -> ");
		      temp2=temp2.next;
		}
	         System.out.println();
	 		System.out.println("trick 5");
	 		display(a);
	 		 System.out.println();
		 		System.out.println("trick 6");
		 		recursive(a);
	}
}