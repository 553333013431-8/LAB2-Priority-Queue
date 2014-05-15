package priority_queue;

import java.util.Scanner;

public class PriorityTest {
	public static void main(String[] args) {
		BinaryHeapI bh = new BinaryHeapI();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print(" Input : ");
			Object a = scan.nextLine();
			if (a.equals("-")) {
				bh.deQueue();
			} else {
				bh.enQueue(Integer.parseInt((String) a));
			}
			System.out.println(bh);

		}
	}
}
