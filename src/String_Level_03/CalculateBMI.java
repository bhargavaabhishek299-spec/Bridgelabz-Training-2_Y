package String_Level_03;
import java.util.*;
public class CalculateBMI {
	 public static String[] findBMI(double weight,double height){
	        String[] result=new String[2];
	        double h=height/100;
	        double bmi=weight/(h*h);
	        result[0]=String.valueOf(bmi);
	        if(bmi<18.5)result[1]="Underweight";
	        else if(bmi<25)result[1]="Normal";
	        else if(bmi<30)result[1]="Overweight";
	        else result[1]="Obese";
	        return result;
	    }
	    public static String[][] calculate(double[][] arr){
	        String[][] result=new String[10][4];
	        for(int i=0;i<10;i++){
	            String[] a=findBMI(arr[i][0],arr[i][1]);
	            result[i][0]=String.valueOf(arr[i][1]);
	            result[i][1]=String.valueOf(arr[i][0]);
	            result[i][2]=a[0];
	            result[i][3]=a[1];
	        }
	        return result;
	    }
	    public static void display(String[][] arr){
	        System.out.println("Height\tWeight\tBMI\tStatus");
	        for(int i=0;i<arr.length;i++){
	            System.out.println(arr[i][0]+"\t"+arr[i][1]+"\t"+arr[i][2]+"\t"+arr[i][3]);
	        }
	    }
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        double[][] arr=new double[10][2];
	        for(int i=0;i<10;i++){
	            System.out.print("Enter weight in kg: ");
	            arr[i][0]=sc.nextDouble();
	            System.out.print("Enter height in cm: ");
	            arr[i][1]=sc.nextDouble();
	        }
	        String[][] result=calculate(arr);
	        display(result);
	    }
}
