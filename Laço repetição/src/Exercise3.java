import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp= new Scanner(System.in);
		int idade, svin, scin;
		svin=0;
		scin=0;
		
		System.out.print("Digite a  idade: \n");
		idade= inp.nextInt();
		
		while(idade>=0 && idade!=-99)
		{
			if(idade<21){
				svin=svin+idade; 
				
			}

			if(idade>50)
			{
				scin=scin+idade;
			}

					
			
			System.out.print("O total de pessoas com menos de 21 anos � "+svin+".\n");
			System.out.print("O total de pessoas com mais de 50 anos � de: "+ scin+".\n"); 
			System.out.print("Digite a  idade: \n");
			idade= inp.nextInt();
		}
		System.out.print("N�mero inv�lido");
		System.out.print("O total de pessoas com menos de 21 anos � "+svin+".\n");
		System.out.print("O total de pessoas com mais de 50 anos � de: "+ scin+".\n"); 
		inp.close();
		
	}

}
