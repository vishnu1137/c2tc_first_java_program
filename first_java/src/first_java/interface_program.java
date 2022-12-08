package first_java;
import java.util.*;

interface net_banking{
	abstract void way_of_pay();
	abstract void process();
	abstract void view_balance();
	abstract void additional_usage();
}
class google_pay implements net_banking{
	public void way_of_pay() {
		
		System.out.println("Scan QR Code");
		System.out.println("Pay contacts");
		System.out.println("Pay phone Number");
		System.out.println("Pay UPI iD");
			
	}
	public void process() {
		System.out.println("Successfull Paid");
		System.out.println("some network issue");
	}
	public void view_balance() {
		System.out.println("Your balance is : 22000");
	}
	public void additional_usage() {
		System.out.println("Bills,Recharges and more");
		System.out.println("Promotions");
		System.out.println("Businesses");
	}
	
}

class phone_pay implements net_banking{
	public void way_of_pay() {
		
		System.out.println("Self Account");
		System.out.println("Pay contacts");
		System.out.println("Pay phone Number");
		System.out.println("Pay UPI iD");
			
	}
	public void process() {
		System.out.println("Successfull Paid");
		System.out.println("some network issue");
	}
	public void view_balance() {
		System.out.println("Your balance is : 22000");
	}
	public void additional_usage() {
		System.out.println("Recharge & pay bills");
		System.out.println("Insurance");
		System.out.println("Tavel Bookings");
		System.out.println("Switch");
		System.out.println("Donation");
		System.out.println("Inverstment Ideas");
		
	}
	
}
class paytm implements net_banking{
	public void way_of_pay() {
		
		System.out.println("Scan QR Code & Pay");
		System.out.println("To Mobile");
		System.out.println("Receive Money");
		System.out.println("Pay UPI iD");
			
	}
	public void process() {
		System.out.println("Successfull Paid");
		System.out.println("some network issue");
	}
	public void view_balance() {
		System.out.println("Your balance is : 22000");
	}
	public void additional_usage() {
		System.out.println("Recharges and Bill payments");
		System.out.println("Loans & Credit Cards");
		System.out.println("Invest & Trade in Stocks");
		System.out.println("paytm Health");
	}
	
}
class paymentapp{
	net_banking Select_app(String app) {
		if (app=="googlepay") {
			return new google_pay();
		}
		else if(app=="phonepay") {
			return new phone_pay();
		}
		else {
			return new paytm();
		}
		
	}
}
public class interface_program {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		paymentapp p=new paymentapp();
		System.out.println("Enter Your payment app: ");
		String app=s.nextLine();
		p.Select_app(app);
		

	}

}
