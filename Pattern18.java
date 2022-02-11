//****
// ****
//  ****
//   ****





package patterns;
import java.util.Scanner;
public class Pattern18 {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	for(int i=1;i<=n;i++) {
		//space 
		for(int j=1;j<i;j++) {
			System.out.print(" ");
		}
		
		//stars 
		for(int k=1;k<=n;k++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	}
	

}
