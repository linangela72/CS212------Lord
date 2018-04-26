
public abstract class DateList {

	public DateNode first = new DateNode(null);
	public DateNode last = first;
	public int length = 0;
	
	public int getLength() {
		return length;
	}

	public void append(Date212 d) {
		DateNode node = new DateNode(d);
		last.next = node;
		last = node;
		++length;
	}//append 
	
	public String toString() {
		// create p to check through list.
		DateNode p = first.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data + " \n";
			p = p.next; 
		}
		return returnString;
	}//toString
}//DateList
