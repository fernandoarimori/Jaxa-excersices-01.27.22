import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		String c;
		int idade, qua, dez, tm, tf, to, cont, tc, tn, ta, mn, ha, oc;
		Scanner in = new Scanner(System.in);
		cont = 0;
		qua = 0;
		dez = 0;
		tm = 0;
		tf = 0;
		to = 0;
		tc = 0;
		tn = 0;
		ta = 0;
		mn = 0;
		ha = 0;
		oc = 0;
		while (cont < 150) {
			System.out.print("Digite sua idade: \n");
			idade = in.nextInt();

			/*
			 * sexo
			 */
			System.out.print("Digite seu sexo: (1=feminino/ 2= masculino/ 3- outros)\n");
			s = in.nextLine();
			switch (s) {
			case "1":
				tf = tf + 1;
				System.out.print("Voc� � do sexo feminino.\n");
				break;
			case "2":
				tm = tm + 1;
				System.out.print("Voc� � do sexo masculino.\n");
				break;
			case "3":
				to = to + 1;
				System.out.print("Voc� � considerado outros.\n");
				break;
			default:
				System.out.print("N�o estabelecido.\n");
			}

			/*
			 * comportamento
			 */
			System.out.print("Digite seu sexo: (1= calmo/ 2= nervoso/ 3- agressivo)\n");
			c = in.nextLine();
			switch (c) {
			case "1":
				tc = tc + 1;
				System.out.print("Voc� � calmo.\n");
				break;
			case "2":
				tn = tn + 1;
				System.out.print("Voc� � nervoso.\n");
				break;
			case "3":
				ta = ta + 1;
				System.out.print("Voc� � agressivo.\n");
				break;
			default:
				System.out.print("N�o estabelecido.\n");
			}

			/*
			 * Mulheres nervosas
			 */
			if (tf >= 1 && tn >= 1) {
				mn = mn++;
			}
			if (tm >= 1 && ta >= 1) {
				ha = ha++;
			}
			if (to >= 1 && tc >= 1) {
				oc = oc++;
			}
			if (idade > 40 && tn >= 1) {
				qua = qua + 1;
			}
			if (idade < 18 && tc >= 1) {
				dez = dez + 1;
			}

			cont++;

		}

		System.out.print("O n�mero de pessoas calmas � " + tc + ".\n");

		System.out.print("O n�mero de mulheres nervosas � " + mn + ".\n");

		System.out.print("O n�mero de homens agressivos � " + ha + ".\n");

		System.out.print("O n�mero de outros calmos � " + oc + ".\n");

		System.out.print("O n�mero de pessoas a cima de 40 e nervosas �  " + qua + ".\n");

		System.out.print("O n�mero de pessoas com menos de 18 e calmas �  " + dez + ".\n");
		in.close();

	}

}
