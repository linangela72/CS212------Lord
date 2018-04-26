
public class Bill extends Money{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int dollars;
   
   public Bill (int d) {
      dollars = d;
   }
   public int getValue () {
      return dollars;
   }
   public String toString() {
	   return ("$ "+getValue()+".00");
   }
}
