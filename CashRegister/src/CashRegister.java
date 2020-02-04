
public class CashRegister {

		private double purchase;
		private double payment;

		public CashRegister() {
			purchase = 0;
			payment = 0;
		}

		public void recordPurchase(double itemAmount) {
			purchase = purchase + itemAmount;
		}

			public void receivePayment(double amountReceived) {
				payment = payment + amountReceived;
			}
			public double giveChange() {
				return (payment - purchase);
			}

			public void printChange() {
			System.out.printf("Your change is: %.2f", giveChange());
			}



			
}
