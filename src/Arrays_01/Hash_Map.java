package Arrays_01;
import java.util.*;
public class Hash_Map {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 10);
		map.put(4, 20);
		map.put(5, 10);
		HashMap<Integer,Integer> freq=new HashMap<>();
		for(int i:map.keySet()) {
			freq.put(i, freq.getOrDefault(i,0)+1);
			
		}
		System.out.print(freq);
	}
}