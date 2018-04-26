
public class UnsortedDateList extends DateList{
	
	public void append(Date212 d) {
		DateNode node = new DateNode(d);
		last.next = node;
		last = node;
		++length;
	}

}
