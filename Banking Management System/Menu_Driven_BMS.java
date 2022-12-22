package b;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu_Driven_BMS {

	public static void main(String[] args) {
		
		BMS_Loader bms=new BMS_Loader();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println( " Welcome to Our Bank");
		
		while(true) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("+++              MAIN MENU             +++");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("|||   Press 1  ->  Create Account      |||");
			System.out.println("|||   Press 2  ->  Display Details     |||");
			System.out.println("|||   Press 3  ->  Deposit             |||");
			System.out.println("|||   Press 4  ->  Withdraw            |||");
			System.out.println("|||   Press 5  ->  Change Pin          |||");
			System.out.println("|||   Press 0  ->  Exit                |||");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++");
			
			int choice=sc.nextInt();
			
			while(!(choice>=0 && choice<6)) {
				System.err.println("  Invalid choice!!\nTry Again : ");
				choice=sc.nextInt();
			}
			
			
			if(choice==0) {
				System.out.println("Thank you !!");
				break;
			}
			
			
			else {
				try {
					if(choice==1) {
						bms.storeData();
					}else if(choice==2) {
						bms.displayData();
					}else if(choice==3 || choice==4 || choice==5) {
						bms.updateData(choice);
					}
				}
				
				
		
				catch(InputMismatchException e) {
					System.err.println(" Invalid entry  !!");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
				
				finally {
					System.out.println("++++++++++++++++++++++++++++++++++++++++++");
					System.out.println("|||       Press 1  -> Main Menu        |||");
					System.out.println("|||       Press 0  -> Exit             |||");
					System.out.println("++++++++++++++++++++++++++++++++++++++++++");
					
					int choice1=sc.nextInt();
					
					while(!(choice1==0||choice1==1)) {
						System.err.println("!!Invalid choice!!\nTry Again : ");
						choice1=sc.nextInt();
					}
					
					if(choice1==1) {
						continue;
					}
					else if(choice1==0) {
						System.out.println("Thank you !!");
						break;
					}
				}
			}
		}
	}
}
