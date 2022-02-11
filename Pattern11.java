//****
//***
//**
//*

//n rows


package patterns;
import java.util.Scanner;
public class Pattern11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		s.close();
	}

}
