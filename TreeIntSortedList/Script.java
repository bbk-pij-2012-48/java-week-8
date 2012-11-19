public class Script {
	public static void main(String[] args) {
		IntSortedList list = new TreeIntSortedList(10);
		list.add(12);
		list.add(17);
		list.add(54);
		list.add(2);
		list.add(2);
		list.add(7);
		list.add(3);
		list.add(8);
		list.add(12);
		
		if(list.contains(0)) {
			System.out.println("0 is there");
		} else {
			System.out.println("0 is not there");
		}

		if(list.contains(7)) {
			System.out.println("7 is there");
		} else {
			System.out.println("7 is not there");
		}
		
		if(list.contains(10)) {
			System.out.println("10 is there");
		} else {
			System.out.println("10 is not there");
		}
		
		System.out.println(list.toString());
	}
}
