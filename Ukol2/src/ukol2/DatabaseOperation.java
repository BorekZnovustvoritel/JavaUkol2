package ukol2;

import java.util.Scanner;

public class DatabaseOperation 
{

	public static void main(String[] args) 
	{
		databaze polePrvku[] = new databaze[3];
		//1. a 2. bod
		for (int i = 0; i < polePrvku.length; i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Zadejte jm�no "+(i+1)+". �lov�ka:");
			String jmeno = sc.nextLine();
			System.out.println("Zadejte rok narozen� "+(i+1)+". �lov�ka:");
			int rok = sc.nextInt();
			polePrvku[i] = new databaze(jmeno, rok);
		}
		//3. bod
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadejte maxim�ln� v��i �vazku:");
		databaze.setMaxVyseUva(sc.nextDouble());
		
		//4. bod
		while (true)
		{
			System.out.println("Zadejte index osoby:");
			int index = sc.nextInt();
			if (index < polePrvku.length && index >=0)
			{
				System.out.println("Jm�no osoby je: "+polePrvku[index].getJmeno()+" (r. n.: "+polePrvku[index].getRokNar()+").\nAktu�ln� �vazek je: "+polePrvku[index].getVyseUva());
				System.out.println("Zadejte v��i nov�ho �vazku:");
				double novyUvazek = sc.nextDouble();
				if (polePrvku[index].zmena(novyUvazek))
				{
					System.out.println("Nov� �vazek je: "+polePrvku[index].getVyseUva());
					
				}
				else
				{
					System.out.println("�vazek nebylo mo�n� zm�nit ("+polePrvku[index].getVyseUva()+").");
				}
			}
		}
		
	}

}
