
public abstract class DateList {

	public DateNode first = new DateNode(null);
	public DateNode last = first;
	public int length = 0;
	
	public int getLength() {
		return length;
	}

	abstract void append(Date212 d); 
	
	
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
