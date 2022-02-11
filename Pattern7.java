//ABCD
//ABCD
//ABCD
//ABCD

//n rows
//n column 
//print jth alphabet 

package patterns;
import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				char ch= (char)(64+j);
				System.out.print(ch);
			
			}
			System.out.println();
		}
 s.close();
	}

}
