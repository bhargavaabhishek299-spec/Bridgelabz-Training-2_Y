package Stack;
 class StackOps{
	int arr[]=new int[5];
	int top=0;
	public void push(int data) {
		arr[top]=data;
		top++;
	}
	public void display() {
		for(int n:arr) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	public void pop() {
		arr[--top]=0;
		top--;
	}
	public void peek() {
		
	}
}
public class StackOperations {

	public static void main(String[] args) {
		StackOps st=new StackOps();
		st.push(10);
		st.push(20);
		st.display();
		st.pop();
		st.display();
		st.push(10);
		st.push(20);
		st.push(30);
		st.display();
		st.pop();
		st.display();
//		st.pop();
//		st.display();
	}

}
