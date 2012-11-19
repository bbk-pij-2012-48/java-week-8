public class Script {
	public static void main(String[] args) {
		IntSet set = new TreeIntSet(1);
		for (int i=2 ; i<=10 ; i++) {
			set.add(i);
		}
		set.add(20);
		set.add(30);
		set.add(25);
		set.add(50);
		
		if(set.contains(25)) {
			System.out.println("25 is there");
		} else {
			System.out.println("25 is not there");
		}

		if(set.contains(100)) {
			System.out.println("100 is there");
		} else {
			System.out.println("100 is not there");
		}
		
		set.containsVerbose(25);
		set.containsVerbose(100);
		
		System.out.println(set.toString());
	}
}
