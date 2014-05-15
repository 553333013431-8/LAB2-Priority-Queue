package priority_queue;

public class CarI implements Comparable {
	private String name;
	private String type;
	private int price;

	public CarI(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public int compareTo(Object e) {
		CarI c = (CarI) e;
		if (this.price > c.price) {
			return 1;
		} else if (this.price == c.price) {
			return 0;
		} else {
			return -1;
		}

	}

	@Override
	public String toString() {
		return String.format("[name = %s , type = %s, price = %d]", name, type,
				price);
	}
}
