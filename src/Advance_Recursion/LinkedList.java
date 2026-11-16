package Advance_Recursion;
import java.util.*;
public class LinkedList {
	Node head;
     class Node{
    	 int data;
    	 Node next;
    	 public Node(int data) {
    		 this.data=data;
    		 this.next=next;
    	 }
     }
    	 //Add At first
    	 public void addfirst(int data) {
    		 Node newnode=new Node(data);
    		 if(head==null) {
    			 head=newnode;
    			 return;
    		 }
    		 newnode.next=head;
    		 head=newnode;
    	 }
    	 //Add at last
    	 public void addlast(int data) {
    		 Node newnode=new Node(data);
    		 if(head==null) {
    			 head=newnode;
    		 return;
    		 }
    		 Node curr=head;
    		 while(curr.next!=null) {
    			curr=curr.next;
    		 }
    		 curr.next=newnode;
    	 }
    	 //display
    	 public void printlist() {
    		if(head==null) {
    			System.out.print("null");
    			return;
    		}
    	   Node curr=head;
    	   while(curr!=null) {
    		   System.out.print(curr.data+" -> ");
    		   curr=curr.next;
    	   }
    	   System.out.print("null");
    	 }
    	 //delete first
    	 public void firstremove() {
    		 if(head==null) {
    			 return;
    		 }
    			 head=head.next;
    	 }
    	 //delete last 
    	 public void lastremove() {
    		 if(head==null) {
    			 return;
    		 }
    		 Node last=head.next;
    		 Node secondlast=head;
    		 while(last.next!=null) {
    			 last=last.next;
    			 secondlast=secondlast.next;
    		 }
    		 secondlast.next=null;
    	 }
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addfirst(10);
		list.addlast(200);
		list.addfirst(20);
		list.addfirst(40);
		list.firstremove();
		list.lastremove();
		list.printlist();
	}

}
