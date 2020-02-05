import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {
		
		CashRegister input = new CashRegister();

		 final double Sentinel = -1;
		 final double DISCOUNT = .10;
		 final double MINIMUMPURCHASE = 50;
		 
		 Scanner in = new Scanner(System.in);
		 
		 System.out.println("Enter a purchase amount or -1 to stop: ");
		 
		  while(in.hasNextDouble()) {
			 double itemAmount = in.nextDouble();
			 
			  if(itemAmount != Sentinel) {
				  System.out.println("Enter a purchase amount or -1 to stop: ");
				  input.recordPurchase(itemAmount);
			  }
			  		else if(itemAmount == Sentinel) {
			  			input.calcDiscount();
			  			input.recordPurchasewithdiscount();
			  			input.printcalcPurchase();
			  			break;
			  }
		  }
			  
		 System.out.println("Enter a payment amount: ");
		 double amountReceived = in.nextDouble();
		 
		 input.receivePayment(amountReceived);
		 input.giveChange();
		 input.printChange();
		 }
		 

	}


