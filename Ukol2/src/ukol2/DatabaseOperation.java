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
			System.out.println("Zadejte jméno "+(i+1)+". èlovìka:");
			String jmeno = sc.nextLine();
			System.out.println("Zadejte rok narození "+(i+1)+". èlovìka:");
			int rok = sc.nextInt();
			polePrvku[i] = new databaze(jmeno, rok);
		}
		//3. bod
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadejte maximální výši úvazku:");
		databaze.setMaxVyseUva(sc.nextDouble());
		
		//4. bod
		while (true)
		{
			System.out.println("Zadejte index osoby:");
			int index = sc.nextInt();
			if (index < polePrvku.length && index >=0)
			{
				System.out.println("Jméno osoby je: "+polePrvku[index].getJmeno()+" (r. n.: "+polePrvku[index].getRokNar()+").\nAktuální úvazek je: "+polePrvku[index].getVyseUva());
				System.out.println("Zadejte výši nového úvazku:");
				double novyUvazek = sc.nextDouble();
				if (polePrvku[index].zmena(novyUvazek))
				{
					System.out.println("Nový úvazek je: "+polePrvku[index].getVyseUva());
					
				}
				else
				{
					System.out.println("Úvazek nebylo možné zmìnit ("+polePrvku[index].getVyseUva()+").");
				}
			}
		}
		
	}

}
