//1111
//2222
//3333
//4444


//n rows
//1 to n columns
//print i

package patterns;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=1;i<=num;i++) {
        	for(int j=1;j<=num;j++) {
        		System.out.print(i);
        	}
        	System.out.println();
        }

	}

}
