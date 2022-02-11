//1234
//1234
//1234
//1234

//n rows
//1 to n columns
//print j

package patterns;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=1;i<=num;i++) {
        	for(int j=1;j<=num;j++) {
        		System.out.print(j);
        	}
        	System.out.println();
        }

	}

}
