
public class CashRegister {
	
		private double purchase;
		private double purchaseWithdiscount;
		private double payment;
		private double minimumpayment;
		private double discount;
	
		public CashRegister() {
			purchase = 0;
			purchaseWithdiscount = 0;
			payment = 0;
			minimumpayment = 50;
			discount = 0;
		}
	
		public void recordPurchase(double itemAmount) {
			purchase = purchase + itemAmount;
		}
	
			public void receivePayment(double amountReceived) {
				payment = payment + amountReceived;
			}
			
			public void calcDiscount() {
			if(purchase > minimumpayment) {
				discount = purchase * .10;
			}
			}
			
			public void recordPurchasewithdiscount() {
				if(purchase > minimumpayment) {
					purchaseWithdiscount = purchase - discount;
				}
			}
			
			public void printcalcPurchase() {
				System.out.println("Your total purchases were $" + purchase + " and because you spent over $" + minimumpayment + ", you are entitled to a 10% discount of $" + discount + " reducing your balance to $" + purchaseWithdiscount + "");
			}
			
			public double giveChange() {
				if(purchase > minimumpayment) {
					return (payment - purchaseWithdiscount);
				}
				else
					return(payment - purchase);
				
			}
	
			public void printChange() {
			System.out.printf("Your change is: $%.2f", giveChange());
			}
			
			
	
	
	
		}
	
	
