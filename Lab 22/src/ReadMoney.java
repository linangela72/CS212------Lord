
import java.io.*;

public class ReadMoney {

  public static void main(String argv[]) throws Exception {
    FileInputStream fis = new FileInputStream("money.out");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Quarter quarter = (Quarter) ois.readObject();
    System.out.println("Quarter: "+quarter);
    int amountOfObjects = ois.readInt();
    for(int i=0;i<amountOfObjects;i++) {
    		Money m = (Money)ois.readObject();
    		System.out.println("Money object retrieved: " + m);
    }
    ois.close();
    fis.close();
  }
}