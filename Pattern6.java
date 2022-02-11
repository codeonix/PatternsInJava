//1
//23
//456
//78910

//n rows
//i columns (1 to i columns )  
//print p and increment it  every time when get printed 

package patterns;
import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int p =1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(p);
				p++;
			}
			System.out.println();
		}
 s.close();
	}

}
