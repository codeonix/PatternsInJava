//Isosceles triangle 
//   1   
//  121
// 12321
//1234321

//n rows
//n column (ith row = spaces + increasing + decreasing )
// print (spaces ,increasing )and decreasing numbers 

package patterns;
import java.util.Scanner;
public class Pattern13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			//spaces  and increasing (n columns = n-i spaces and then numbers)
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//increasing 
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			//decreasing i-1 to 1

			for(int p =i-1;p>=1;p--) {
				System.out.print(p);
			}


			System.out.println();
		}
		s.close();
	}

}
