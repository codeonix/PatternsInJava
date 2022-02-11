//13579
//35791
//57913
//79135






package patterns;
import java.util.Scanner;
public class Pattern20 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int x = 2*(i+j);
                if( i+j <= n+1){
                    System.out.print(x-3);

                }
                else{
                    System.out.print(x-(n*2+3));

                }
            }
            System.out.println();

        }
	}

}
