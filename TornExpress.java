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