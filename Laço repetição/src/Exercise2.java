
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int y,x=0;

		for (x = 0; x < 10; x++) {
			System.out.print("\nDigite um n�mero\n");
			y = inp.nextInt();
			if (y == 0 || y % 2 == 0) {
				System.out.print("\nSeu n�mero " + y + " � par");
			}
			else
			{
				System.out.print("\nSeu n�mero "+ y+ " � �mpar");
			}
		}
		System.out.print("\nFIM DO PROGRAMA");
		inp.close();
	}

}
