

class Order implements Comparable<Order> {
	int price;
	String productName;
	
	public Order(int price, String prodName) {
		this.price = price;
		this.productName = prodName;
	}
	
	@Override
	public int compareTo(Order o) {
		//System.out.println("Compare to called");
		return (int)this.price - (int)o.price;
	}
}
