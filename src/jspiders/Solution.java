package jspiders;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Upcasting ->abstraction
		Calculator c=new CalculatorImpl();
		int a =0;
		int b=0;
		//method driven program
		while(true) {
			System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.exit");
			int choice=scan.nextInt();
			if(choice>=1&&choice<=4) {
				System.out.println("Enter 2 numbers");
				a=scan.nextInt();
				b=scan.nextInt();
				switch(choice) {
				case 1:
					int ans=c.add(a,b);
					System.out.println("addition is:"+ans);
					break;
				case 2:
					ans=c.sub(a,b);
					System.out.println("Sub is:"+ans);
					break;
				case 3:
					ans=c.mul(a,b);
					System.out.println("Mul is:"+ans);
					break;
				case 4:
					ans=c.div(a,b);
					if(ans!=0) {
						System.out.println("Division is:"+ans);
					}
					else {
						System.out.println("Stupid dont divide it by 0");
					}
					break;
				case 5:
					System.out.println("thank you");
					System.exit(0);
					break;
				default:
					System.out.println(c.displayErrorMessage());
				}
				System.out.println("-------------------");
			}
			else {
				System.out.println("Invalid choice");
				//				break;
			}
		}

	}

}	


//		while(true) {
//			System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.exit");
//			int choice=scan.nextInt();
//			switch(choice) {
//			case 1:
//				System.out.println("enter 2 numbers");
//				int ans=c.add(scan.nextInt(), scan.nextInt());
//				System.out.println("addition is:"+ans);
//				break;
//			case 2:
//				System.out.println("enter 2 numbers");
//				ans=c.sub(scan.nextInt(), scan.nextInt());
//				System.out.println("Sub is:"+ans);
//				break;
//			case 3:
//				System.out.println("enter 2 numbers");
//				ans=c.mul(scan.nextInt(), scan.nextInt());
//				System.out.println("Mul is:"+ans);
//				break;
//			case 4:
//				System.out.println("enter 2 numbers");
//				ans=c.div(scan.nextInt(), scan.nextInt());
//				System.out.println("Division is:"+ans);
//				break;
//			case 5:
//				System.out.println("thank you");
//				System.exit(0);
//				break;
//			default:
//				System.out.println(c.displayErrorMessage());
//			}
//			System.out.println("-------------------");
//		}
