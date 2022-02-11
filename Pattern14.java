//Stars 
//   *   
//  ***
// *****
//*******
// *****
//  ***
//   *


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
public class Pattern14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int n1 = (num+1)/2;
		for(int i=1;i<=n1;i++) {
			//spaces  and increasing (n columns = n-i spaces and then numbers)
			//spaces
			for(int j=1;j<=n1-i;j++) {
				System.out.print(" ");
			}
			//increasing 
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			//decreasing i-1 to 1

			for(int p =i-1;p>=1;p--) {
				System.out.print("*");
			}


			System.out.println();
		}

		int n2=n1-1;
		for(int i=1;i<=n2;i++) {
			//spaces ,increasing(i for ith row  ) and decreasing 
			//spaces 
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}

			//increasing 
			for(int k=n2-i+1;k>=1;k--) {
				System.out.print("*");
			}

			//decreasing 
			for(int p=n2-i;p>=1;p--) {
				System.out.print("*");
			}

			System.out.println();
		}

		s.close();
	}

}
