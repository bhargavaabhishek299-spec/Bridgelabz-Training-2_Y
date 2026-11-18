package Stack;
class stackops {
    int[] arr = new int[5];
    int top = -1;
    // Push operation
    public void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = data;
    }
    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = arr[top];
        arr[top] = 0;
        top--;
        return value;
    }
    // Peek operation
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }
    // Display operation
    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class StackOperation2 {
    public static void main(String[] args) {
        stackops st = new stackops();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Stack Elements:");
        st.display();
        System.out.println("Deleted: " + st.pop());
        System.out.println("Top Element: " + st.peek());
        System.out.println("Updated Stack:");
        st.display();
    }
}