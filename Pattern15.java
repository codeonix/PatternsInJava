//Triangle of numbers 
//   1  
//  232
// 34543
//4567654

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
public class Pattern15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			int num=i;
			//spaces  and increasing (n columns = n-i spaces and then numbers)
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//increasing 
			for(int k=1;k<=i;k++) {
				System.out.print(num);
				num++;
			}
			//decreasing from num-1
			int num2 = num-2;
			for(int p=1;p<=i-1;p++) {
				System.out.print(num2);
				num2--;
			}


			System.out.println();
		}
		s.close();
	}

}
