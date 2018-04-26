
public class SortedDateList extends DateList{
	
	public void append(Date212 d) {
		DateNode node = new DateNode(d);
		if(first.next == null) {
			last.next = node;
			last = node;
			length ++;
			return;
		}
		DateNode i = first;
		while(i.next !=null && i.next.data.compareTo(d)<0)
			i = i.next;
		if(i.next == null) {
			last.next = node;
			last = node;
			length++;
		}
		else {
			node.next = i.next;
			i.next = node;
			length++;
		}
	}

}
