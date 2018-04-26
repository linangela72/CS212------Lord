
	public class lab24{
		public static void main(String[] args) {
			Money []money = {new Bill(100), new Bill(1), new Quarter(), new Quarter(), new Dime(), new Dime(), new Nickel(), new Penny()};
			MoneyList ml = new MoneyList();
			
			for (int i = 0; i < money.length; ++i)
				ml.append(money[i]);
			
			System.out.print("Forward Print: ");
			ml.print();
			
			System.out.print("Reverse Print: ");
			ml.reversePrint();
			
			System.out.println("Sum: $" + ml.sum());
			System.out.println("Sum of all Quarters: $" + ml.sumQuarters());
		}
	}


