import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list=new LinkedList();
		list.add(3000);
		list.add(1000);
		list.add(2000);
	
		list.add(1, "Arun");
		System.out.println(list.size());
		System.out.println(list.get(1));
		
		Set set =new TreeSet();
		set.add(1000);
		set.add(100);
		set.add(1400);
		set.add(200);
		set.add(600);
		System.out.println(set);
		
	}

}
