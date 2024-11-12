// LinkedList.java
// 
// This version uses three instance variables,
// a pointer to the first node, a pointer to
// the last node, and length, to make our
// append and getLength methods more efficient
// than the would be if our only instance
// variable were a pointer to the first node.
//
// This version uses a dummy first node.  Hence
// it needs less decision-making than it would
// need if a dummy first node were not used.
//
package lab18;

/**
 * Encapsulates a linked list of <code>String</code>.
 */
public class MoneyList {

	/** First node in linked list - dummy node */
	public MoneyNode first = new MoneyNode(null);
	/** Last node in linked list */
	public MoneyNode last = first;
	/** Number of data items in the list. */
	private int length = 0;
	/**
	 * Gets the number of data values currently stored in this LinkedList.
	 *
	 * @return the number of elements in the list.
	 */
	public int getLength() {
		return length;
	}
	/**
	 * Appends a String data element to this LinkedList.
	 *
	 * @param data
	 * the data element to be appended.
	 */
	public void append(Money d) {
		// TODO Code here for append
		MoneyNode newNode = new MoneyNode(d); // Create a new node
		last.next = newNode; // Set the next of the current last node to the new node
		last = newNode; // Update the last node pointer to the new node
		length++; // Increase the length of the list
	} // method append(String)
	/**
	 * Prepends (adds to the beginning) a String data element to this
	 * LinkedList.
	 *
	 * @param data
	 * the data element to be prepended.
	 */
	public void prepend(Money d) {
		// TODO Code here for prepend
		MoneyNode newNode = new MoneyNode(d); // Create a new node
		newNode.next = first.next; // Set the new node's next to point to the first data node
		first.next = newNode; // Set the dummy node's next to point to the new node
		if (last == first) { // If the list was empty, update the last node
			last = newNode;
	 }
	 length++; // Increase the length of the list
	} // method append(String)
	/**
	 * @return String representation of elements in linked list delimited by a
	 * space character
	 */
	public String toString() {
		MoneyNode p = first.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data + " ";
			p = p.next;
		}
		return returnString;

	}
	
	public boolean equals(Object other) {
		if (other == null || getClass() != other.getClass()
				|| length != ((MoneyList) other).length)
			return false;
		MoneyNode nodeThis = first;
		MoneyNode nodeOther = ((MoneyList) other).first;
		while (nodeThis != null) {
			// Since the two linked lists are the same length,
			// they should reach null on the same iteration.
			if (nodeThis.data != nodeOther.data)
				return false;
			nodeThis = nodeThis.next;
			nodeOther = nodeOther.next;
		} // while
		return true;
	}
	
	public void printList() {
		MoneyNode p = first.next;
		while(p != null) {
			System.out.println(p.data);
			p = p.next;
		}
	}
}

