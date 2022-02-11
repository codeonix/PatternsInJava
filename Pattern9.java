//   *
//  **
// ***
//****

//n rows
//n column (in ith row = n-i spaces +in ith row =i stars)
// print spaces and stars 

package patterns;
import java.util.Scanner;
public class Pattern9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			//spaces 
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//stars
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}

}
