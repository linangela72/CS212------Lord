
public class BadWalletMain {
   
   static String[] dataSource =  {"B5","Q","B18","Q","B10","P","N","BAD","D","Q","D"};
   static Wallet myWallet = new Wallet();
   
   public static void main (String[] args) {
      for (int i=0;i<dataSource.length;i++){
         char dataItem = dataSource[i].charAt(0);
         if (dataItem == 'B') {
        	 try {
        		 int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
                 myWallet.addToWallet(new Bill(billValue)); 
        	 }
            catch(IllegalBillException ibe) {
            		System.err.print(ibe.getMessage());
            }
        	 	catch(NumberFormatException nfe) {
        	 		System.err.println(nfe.getMessage());
        	 	}
         }   
         else
            if (dataItem == 'Q')
               myWallet.addToWallet(new Quarter());
            else
            if (dataItem == 'D')
               myWallet.addToWallet(new Dime());
            else
            if (dataItem == 'N')
               myWallet.addToWallet(new Nickel());
            else
            if (dataItem == 'P')
               myWallet.addToWallet(new Penny());
         }
      
	  myWallet.print();
	  System.out.println("My wallet contains: $"+myWallet.getValue());
   }
   
   
}
