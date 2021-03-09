package datastructures;

public interface List <T> {
	
	boolean isEmpty();
	
	boolean contains(T item);

		//returns the actiual insertion index
	int insertAt(T item, int index);
	
		//returns true if we managed to remove it  (e.g. index is not too out of range)
	boolean removeFrom(int index);
	
		//returns the number of nodes removes
	int remove(T item);
	
	T get(int index);
	
	void clear();
}
