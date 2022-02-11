//ABCD
//BCDE
//CDEF
//DEFG

//related to 
//1
//23
//345
//4567

//n rows
//n column (start from p = A+i-1 
//print p and increment p every time when get printed 

package patterns;
import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=1;i<=num;i++) {
			char p = (char) ('A'+i-1);
			for(int j=1;j<=num;j++) {
				System.out.print(p);
				p++;
			
			}
			System.out.println();
		}
 s.close();
	}

}
