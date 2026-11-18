package Stack;
import java.util.*;
public class StackBasics {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		Stack<Integer> st=new Stack<>();
         st.push(100);
         st.push(200);
         st.push(300);
         st.push(400);
         st.push(500);
         System.out.println(st);
         st.pop();
         System.out.println(st);
         System.out.println(st.peek());
         System.out.println(st.isEmpty());
         while(!st.isEmpty()) {
        	 list.add(st.peek());
        	 st.pop();
         }
    
         System.out.println("Reverse Stack=>"+list);
	}
}