package datastructures;

public class LinkedList<T> implements List<T> {

	public LinkedList()
	{
		head = null;
	}
	
	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public boolean contains(T item) {
		
		for (Node<T> current = head; current!=null; current = current.next)
			if (item == current.data)
				return true;
		
		return false;
	}

	@Override
	public int insertAt(T item, int index) {
		if (index==0 || head==null) {
			head =  new Node<T>(item, head);
			return 0;
		} else {
			int insIdx = 1;
			Node<T> pred = head;
			while (index > insIdx && pred.next!=null) {
				pred = pred.next;
				--insIdx;
			}
			pred.next =  new Node<T>(item, pred.next);
			return insIdx;
		}
	}

	@Override
	public boolean removeFrom(int index) {
		if (head==null){
			//nothing to do. except maybe throw an exception
			return false;
		} else if (index==0) {
			head = head.next;
			return true;
		} else {
			Node<T> pred = head;
			while (index > 1 && pred.next!=null) {
				pred = pred.next;
				--index;
			}
			if (pred.next!=null) {
				pred.next = pred.next.next;
				return true;
			} else {
				//nothing to do. except maybe throw an exception
				return false;
			}
		}
	}

	@Override
	public int remove(T item) {
		if (head == null) {
			return 0;
		} else {
			int nRemoved = 0;
			while (head!=null && head.data==item) {
				head = head.next;
				++nRemoved;
			}
			
			if (head!=null) {
				Node<T> pred = head;
				while(pred.next!=null) {
					if (pred.next.data==item) {
						pred.next =pred.next.next;
						++nRemoved;
					} else {
						pred = pred.next;
					}
				}
			}
			return nRemoved;
		}
	}

	@Override
	public T get(int index) {
		Node<T> current = head;
		while(current!=null && index>0) {
			current = current.next;
			--index;
		}
		return current==null ? null : current.data;
	}

	@Override
	public void clear() {
		head = null;
	}

	private static class Node<T> {
		 public Node<T> next;
		 public T data;
		 
		 public Node(T _data, Node<T> _next){
			 data = _data;
			 next = _next;
		 }
	}

	private Node<T> head;
}
