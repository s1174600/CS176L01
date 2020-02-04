import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {
		
		CashRegister input = new CashRegister();

		 final double Sentinel = -1;
		 Scanner in = new Scanner(System.in);
		 
		 System.out.println("Enter a purchase amount or -1 to stop: ");
		 
		  while(in.hasNextDouble()) {
			 double itemAmount = in.nextDouble();
			 
			  if(itemAmount != Sentinel) {
				  System.out.println("Enter a purchase amount or -1 to stop: ");
				  input.recordPurchase(itemAmount);
			  }
			  else {
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


