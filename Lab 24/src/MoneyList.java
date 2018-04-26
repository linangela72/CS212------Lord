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

/**
 * Encapsulates a linked list of <code>String</code>.
 */
public class MoneyList {

	/** First node in linked list - dummy node */
	private MoneyNode first = new MoneyNode(null);

	/** Last node in linked list */
	private MoneyNode last = first;

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
	 *            the data element to be appended.
	 */
	public void append(Money m) {
		// TODO Code here for append
		MoneyNode node = new MoneyNode(m);
		last.next = node;
		last=node;
		++length;
	} // method append(String)

	/**
	 * Prepends (adds to the beginning) a String data element to this
	 * LinkedList.
	 * 
	 * @param data
	 *            the data element to be prepended.
	 */
	public void prepend(Money d) {
		// TODO Code here for prepend
		MoneyNode node = new MoneyNode(d);
		node.next = first.next;
		first.next = node;
		if(first==last) {
			last = node;
		}
		++length;
	} // method append(Money)

	/**
	 * @return String representation of elements in linked list delimited by a
	 *         space character
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

	public void print() {
		print(first.next);
		System.out.println();
	}

	private static void print(MoneyNode n) {
		if(n==null) {
			return;
		}
		System.out.println(n.data + " ");
		print(n.next);
	}
	
	public void reversePrint() {
		reversePrint(first.next);
		System.out.println();
	}

	private static void reversePrint(MoneyNode n) {
		if(n==null) {
			return;
		}
		reversePrint(n.next);
		System.out.println(n.data+" ");	
	}
	public float sum() {
		return sum(first.next);
	}

	private static float sum(MoneyNode n) {
		if(n==null) {
			return 0;
		}
		float total;
		if(n.data instanceof Bill) {
			total = n.data.getValue();
		}
		else {
			total = n.data.getValue()/100f;
		}
		return total + sum(n.next);
	}
	public float sumQuarters() {
		return sumQuarters(first.next);
	}

	private static float sumQuarters(MoneyNode n) {
		if(n==null) {
			return 0;
		}
		if(n.data instanceof Quarter) {
			return .25f + sumQuarters(n.next);
		}
		return sumQuarters(n.next);
	}
	
	

} // class LinkedList

