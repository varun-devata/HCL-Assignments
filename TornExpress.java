/*
	 * TRON EXPRESS is a full-time courier and cargo dispatch agency for corporate companies around the world. It mainly deals with delivering and tracking the packages delivered. TRON EXPRESS has its annual budget session during the end of year. The company has more than 30,000 full-time employees, 5,00,000 customers per month, and an average of 3 million packages a day.
	
	The manner in which the company structures pay scales is different for permanent and temporary staff. Some of the criteria which the company uses to decide the pay are as follows:
	
	1. Number of packages being delivered: Permanent employees get $50 for every package they deliver, whereas temporary employees get $30 for every delivered package.
	
	2. The distance they travel: Permanent employees get a daily allowance of $75 for their travel. Similarly, temporary employees get a daily allowance of $65 for their travel.
	
	3. Shifts: People who work for the night shift get an additional pay of 10% over and above their regular pay.
	
	Depending on all these factors, the basic pay structure is decided.
	
	Now, the company wants to reward the employees with bonuses based on their grade as follows: (Assume that grade is provided as input.)
	
	Grade A1: 5% of basic pay
	
	Grade A2: 10% of basic pay 
	
	Grade A3: 15% of basic pay
	
	With all the information provided, use all possible type of statements and expressions and design a Java program to help the management to calculate the net pay (basic added to bonus) for employees.
 */

import java.util.Scanner;

public class TornExpress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char empType;
		int nPkgDlvd =0,distTrvld=0;
		boolean shift = false;
		String grade ="";		
		float basicSal,netSal = 0,shiftAmt,bonus = 0;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emloyee type(type P for permanent/ type T for temporary):");
		empType = sc.next().charAt(0);
		
		if(empType == 'P' || empType == 'T'){
		    System.out.println("Enter the total no of packages being delivered :");
		    nPkgDlvd = sc.nextInt();
		
		    System.out.println("Enter distance travelled in no of days :");
		    distTrvld = sc.nextInt();
		
		    System.out.println("Have the employee attended night shift(true/false)");
		    shift = sc.nextBoolean();
		
		    System.out.println("Enter the employee grade(A1,A2,A3) :");
		    grade = sc.next();
		}
		else {
			System.out.println("Invalid Employee type");
			//System.exit(0);
		}		
		if(empType == 'P') {
			basicSal = 5000f;
			nPkgDlvd = nPkgDlvd * 50;
			distTrvld = distTrvld * 75;
			if(shift) {
				shiftAmt = basicSal * 0.1f;
			}
			else 
				shiftAmt = 0;
			switch(grade) {
				case "A1":
					bonus = basicSal *0.05f;
					break;
				case "A2":
					bonus = basicSal *0.1f;
					break;
				case "A3":
					bonus = basicSal *0.15f;
					break;
				default:
					System.out.println("Invalid grade entry");
					System.exit(0);					
			}
			netSal = basicSal + nPkgDlvd + distTrvld + shiftAmt + bonus;
		}
		else if(empType == 'T') {
			basicSal = 3000f;
			nPkgDlvd = nPkgDlvd * 30;
			distTrvld = distTrvld * 65;
			if(shift) {
				shiftAmt = basicSal * 0.1f;
			}
			else 
				shiftAmt = 0;
			switch(grade) {
				case "A1":
					bonus = basicSal *0.05f;
					break;
				case "A2":
					bonus = basicSal *0.1f;
					break;
				case "A3":
					bonus = basicSal *0.15f;
					break;
				default:{
					System.out.println("Invalid grade entry");
					System.exit(0);	
				}
			}
			netSal = basicSal + nPkgDlvd + distTrvld + shiftAmt + bonus;			
		}		
		System.out.println("The net salary of the employee : " + netSal);		
	}

}