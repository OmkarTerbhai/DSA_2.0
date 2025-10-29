import java.util.List;
import java.util.*;

class ArrayListDemo {
	public static void main(String arg[]) {
		List<String> ls = new ArrayList<>();
		
		ls.add("Demo");
		ls.addFirst("Memo");
		ls.addLast("Lemo");
		
		ListIterator<String> listIterator = ls.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}
}
