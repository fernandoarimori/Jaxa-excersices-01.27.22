import java.util.Scanner;

public class Exerxise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int x, y;
		x=0;
		y=0;
		do
		{
			System.out.print("Digite um n�mero: \n");
			y= in.nextInt();
			x=y+x;
			
		}while (y!=0);
		System.out.print("A soma total dos n�mero �: "+x);	
		in.close();
	}

}
