package Advance_Recursion;
import java.util.*;
public class DoubleLinkedList {
        public class Node{
        	int data;
        	Node next;
        	Node prev;
        	public Node(int data) {
        		this.data=data;
        		this.next=next;
        	}
        }
        Node head;
           public static void add(int data) {
        	   Node newnode=new Node(data);
        	   if(head==null) {
        		   head=newnode;
        		   return;
        	   }
           }
//        public static void display() {
//    		if(head==null) {
//    			return;
//    		}
//    	}
	public static void main(String[] args) {
		DoubleLinkedList a=new DoubleLinkedList();
		
	}

}
