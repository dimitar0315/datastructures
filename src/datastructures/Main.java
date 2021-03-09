package datastructures;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> test = new LinkedList<Integer>();
		
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(1);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		
		test.contains(8);
		test.get(5);
		test.isEmpty();
		test.insertAt(10, 8);
		test.removeFrom(4);
		test.remove(3);
		test.clear();
	}

}
