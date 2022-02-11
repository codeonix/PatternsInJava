//****
//****
//****
//****

//n rows
//1 to n columns
//print *

package patterns;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=1;i<=num;i++) {
        	for(int j=1;j<=num;j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }

	}

}
