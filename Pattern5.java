//1
//12
//123
//1234

//n rows
//(i columns )1 to i columns
//print j

package patterns;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
