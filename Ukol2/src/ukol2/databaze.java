package ukol2;

public class databaze
{
	private String jmeno;
	private int rokNar;
	private double vyseUva;
	
	static double maxVyseUva = 1;
	
	databaze(String jmeno, int rokNar)
	{
		this.jmeno = jmeno;
		this.rokNar = rokNar;
	}
	
	public String getJmeno()
	{
		return this.jmeno;
	}
	/*public void setJmeno(String jmeno)
	{
		this.jmeno = jmeno;
	}*/
	
	public int getRokNar()
	{
		return this.rokNar;
	}
	/*public void setRokNar(int rokNar)
	{
		this.rokNar = rokNar;
	}*/
	
	public double getVyseUva()
	{
		return this.vyseUva;
	}
	/*void setVyseUva(double vyseUva)
	{
		this.vyseUva = vyseUva;
	}*/
	
	public static void setMaxVyseUva(double maxV)
	{
		maxVyseUva = maxV;
	}
	
	boolean zmena(double novaVyseUva)
	{
		if ((novaVyseUva + this.vyseUva) > maxVyseUva)
		{
			return false;
		}
		else
		{
			this.vyseUva += novaVyseUva;
			return true;
		}
	}
}
