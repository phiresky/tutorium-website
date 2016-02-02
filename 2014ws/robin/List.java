package test;

class ListCell {
	int value;
	ListCell next;

	public ListCell(int value) {
		this.value = value;
	}
}

public class List {
	ListCell head;

	/**
	 * Adds an element to the end of the list
	 * 
	 * @param value
	 *            the value to add
	 */
	public void append(int value) {
		if (head == null) {
			head = new ListCell(value);
		} else {
			ListCell last = head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = new ListCell(value);
		}
	}

	/**
	 * Get item at index
	 */
	public int get(int index) {
		ListCell current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.value;
	}

	public static void main(String[] args) {
		List list = new List();
		list.append(5);
		list.append(3);
		
		System.out.println(list.get(1));
		System.out.println(list.get(0));
	}
}
