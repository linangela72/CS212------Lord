
import java.io.*;

public class SaveMoney {

  public static void main(String argv[]) throws Exception {
    FileOutputStream fos = new FileOutputStream("Money.out");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    Quarter q= new Quarter();
    oos.writeObject(q);
    Money[] wallet = {new Penny(), new Nickel(), new Dime(), new Bill(5)}; 
    oos.writeInt(wallet.length);
    for(int i=0; i<wallet.length;i++) {
    		oos.writeObject(wallet[i]);
    }
    oos.flush();
    oos.close();
    fos.close();
  }
}