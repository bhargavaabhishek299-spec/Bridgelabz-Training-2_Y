package Linked_List;

public class Constructor {
	   String name;//instance variable
       public Constructor(String name){
    	   this.name=name;
       }
	public static void main(String[] args) {
		Constructor s1=new Constructor("Abhishek");
		System.out.println(s1.name);

	}
}