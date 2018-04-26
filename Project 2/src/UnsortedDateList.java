
public class UnsortedDateList extends DateList{
	public void add(Date212 d) {
		DateNode node = new DateNode(d);
		last.next = node;
		last = node;
		++length;
	}
}
