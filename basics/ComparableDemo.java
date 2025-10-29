import java.util.*;


class ComparableDemo {
	
	static PriorityQueue<Order> pq = new PriorityQueue<>(new OrderComparator());
	
	
	public static void main(String arg[]) {
		
		pq.add(new Order(78900, "IPhone"));
		pq.add(new Order(58900, "Samsung"));
		pq.add(new Order(68900, "Pixel"));
		pq.add(new Order(48900, "OnePlus"));
		pq.add(new Order(38900, "Motorola"));
		
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll().productName);
		}
	}
	
}
