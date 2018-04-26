
public class MoneyMain {
   
   static String[] dataSource =  {"B5","Q","B20","Q","P","N","D"};
   static Money[] wallet = new Money[dataSource.length];
   
   public static void main (String[] args) {
            
      for (int i=0;i<dataSource.length;i++){
         char dataItem = dataSource[i].charAt(0);
         if (dataItem == 'B') {
            int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
            wallet[i]= new Bill(billValue);
         }//if   
         else
            if (dataItem == 'Q')
               wallet[i]=new Quarter();
         else
      		if(dataItem =='P')
      			wallet[i]=new Penny();
      	 else
      		if(dataItem == 'N')
      			wallet[i]=new Nickel();
      	 else
      		if(dataItem =='D')
      			wallet[i]=new Dime();
      }//for
      printWallet();
      sumWallet();
   }//main
   public static void printWallet () {
      for (int i=0;i<wallet.length;i++) {
            System.out.println(wallet[i]);
      }
   }//printWallet
   public static void sumWallet () {
	   float sum=0;
	   for(int i=0;i<wallet.length;i++) {
		   if(wallet[i] instanceof Coin) {
			   sum+=wallet[i].getValue()/100f;
		   }
		   else
		   sum+=wallet[i].getValue();
	   }//for
	   System.out.println("The total amount in the wallet is: $ "+sum);
   }//sumWallet
}//MoneyMain
