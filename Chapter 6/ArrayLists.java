import java.util.ArrayList;

public class ArrayLists{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("John");
		list.add("Henry");
		list.add("Mary");
		list.add("Jack");
		list.add("Blessing");
		
		list.add(2,"Clinton");
		list.set(3,"Peter");
		
		System.out.println(list.get(3));
		
		for(String name : list){
			System.out.printf("%s%n",name);
		}
	}
}