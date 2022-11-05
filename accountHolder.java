package Encapsulation;



public class accountHolder {
	public static void main(String[] args) {
		bank indian =new bank();
		System.out.println("DEAR CUSTOMER YOU SGOULD MAINTAIN BALACE ABOVE  "+indian.getMinimumBalance());
		System.out.println("YOUR MAIN BALANCE IS  "+indian.getMainBalance());
		indian.deposit();
		indian.getMainBalance();
		indian.deduction();
		indian.getMainBalance();
		indian.getMinimumBalance();
	
	}
 
 
}
