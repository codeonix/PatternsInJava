//   1
//  12
// 123
//1234

//n rows
//n column (in ith row = n-i spaces +in ith row =i numbers)
// print spaces and numbers

package patterns;
import java.util.Scanner;
public class Pattern10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			//spaces 
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//numbers
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		s.close();
	}

}
