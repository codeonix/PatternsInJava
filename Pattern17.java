//*
//*1*
//*121*
//*12321*
//*121*
//*1*
//*


//related to
//   1   
//  121
// 12321
//1234321

//n rows
//n column (ith row = spaces + increasing + decreasing )
// print (spaces ,increasing )and decreasing numbers 

package patterns;
import java.util.Scanner;
public class Pattern17 {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	System.out.println("*");
	//Upper part --> n rows 
	for (int i=1;i<=n;i++) {
		System.out.print("*");
		//Increasing 
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		//decreasing 
		for(int k=i-1;k>=1;k--) {
			System.out.print(k);
		}
		
		System.out.print("*");
		System.out.println();
	}
	
	//Lower part --> n-1 rows 
	for(int i=1;i<=n-1;i++) {
		System.out.print("*");
		//Increasing 
		int p=1;
		for(int j=n-i;j>=1;j--) {
			
			System.out.print(p);
			p++;
		}
		
		//decreasing 
		for(int k = n-i-1;k>=1;k--) {
			System.out.print(k);
		}
		
		System.out.print("*");
		System.out.println();
	}
	
	System.out.println("*");
	
	}
	

}
