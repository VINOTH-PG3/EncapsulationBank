package Encapsulation;

import java.util.Scanner;
//IN ENCAPULATION PRIVATE MODIFIER IS USED TO HIDE THE DATA AND IT CAN ONLY BEEN ACESS BY CREATING OBJECT FOR PRIVATE CLASS
//*AFTER CREATING OBJECT WE CANT CALL DIRECTLY....BUT BY USING GET SET METHOD WE CAN CALL THEM
public class bank {       //class bank is created
	private  int minimumBalance=1000;      // DATA IS HIDDEN
	private long mainBalance=22000;
	
	
	public static void main(String[] args) {
		
	
}
	public int getMinimumBalance() {                          //GETER setter METHOD IS USED
		return minimumBalance;                                //ITS RETURN MINIMUM BALANCE SO THAT minimumBalance=1000;(from PRIVATE DATA) 
	}
	public void setMinimumBalance(int minimumBalance) {
		//if(minimumBalance>2000)
		this.minimumBalance = minimumBalance;
	}
	
	
	public long getMainBalance() {                            //GETER setter METHOD IS USED
		return mainBalance;                                   //ITS RETURN main BALANCE SO THAT mainBalance=22000;( from PRIVATE DATA) 
	}
	public void setMainBalance(int mainBalance) {
		this.mainBalance = mainBalance;
	}
	
	
	void deposit(){                        //method deposit is created 
		Scanner credit = new Scanner(System.in);   // scanner is used to get value from user
		System.out.println("ENTER YOUR DEPOSIT AMOUNT  ");
		long Damount=credit.nextLong();    // value get from user and stored in Damount
		 mainBalance=mainBalance+Damount;
		 System.out.println("YOUR CURRENTBALACE IS  "+mainBalance);
	}
	public void deduction() {                             //method deduction is created
		Scanner debit = new Scanner(System.in);            // scanner is used to get value from user
		System.out.println("ENTER YOUR WITHDRAW AMOUNT  ");
		long Wamount=debit.nextLong();                       // value get from user and stored in wamount
		 mainBalance=mainBalance-Wamount;
		 System.out.println("YOUR CURRENTBALACE IS  "+mainBalance);
		
	}
}
