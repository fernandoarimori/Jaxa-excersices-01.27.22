import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp= new Scanner(System.in);
		int ent, som, med, cont;
		ent=0;
		som=0;
		cont=0;
		do
		{
			System.out.println("Digite um n�mero: ");
			ent=inp.nextInt();
			som=som+ent;
			cont++;
				
		}while (ent!=0);
		med=som/(cont-1);
		System.out.println("A m�dia dos n�meros entrados � de:"+ med+".");
		inp.close();
	}

}
