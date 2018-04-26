public class iterator {
	private DateNode node;
	
	public iterator(DateNode first) {
		node = first;
	}
	
	public boolean hasNext() {
		return(node!=null);
	}
	
	public Date212 next() {
		if(node == null) {
			throw new NullPointerException("empty");
		}
		Date212 currentData = node.data;
		node=node.next;
		return currentData;
	}
}
