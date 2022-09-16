/*
 * Write a program to calculate the monthly telephone bills as per the following rule: 

	Minimum Rs. 200 for upto 100 calls. 
	Plus Rs. 0.60 per call for next 50 calls. 
	Plus Rs. 0.50 per call for next 50 calls. 
	Plus Rs. 0.40 per call for any call beyond 200 calls
	
	Test Cases
	
	Input		Output
	180			245
	200			255
	210			259
 */


import java.util.Scanner;

public class callsCost{
	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		int n=ab.nextInt();
		if(n<=100) {
			System.out.println("200");
		}
		else {
			if(n<=150) {
				double m=(n-100)*0.60;
				System.out.println(200+m);
			}
			if(n<=200 && n>150) {
				double y=(n-150)*0.50;
				System.out.println(230+y);
			}else {
				double z=(n-200)*0.40;
				System.out.println(255+z);
			}
		}
	}
}