//1=1
//1+2=3
//1+2+3=6






package patterns;
import java.util.Scanner;
public class Pattern19 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			//LHS
			int sum=0;
			for(int j=1;j<=i;j++) {
				if(j ==i) {
					System.out.print(j);
				}
				else {
					System.out.print(j+"+");
				}

				sum = sum+j;
			}
			System.out.print("=");
			//RHS
			System.out.print(sum);

			System.out.println();
		}
	}


}
