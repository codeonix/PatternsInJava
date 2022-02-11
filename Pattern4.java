//4321
//4321
//4321
//4321

//n rows
//n to 1 columns
//print j

package patterns;
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=num;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
