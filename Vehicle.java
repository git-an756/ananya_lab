package day2;
interface Dia
{
	void scan();
}
interface sita 
{
	void kola();
}

public class Vehicle implements  Dia,sita{
	public void scan()
	{
		System.out.println("Good to go");
	}
	public void kola()
	{
		System.out.println("Hola!!");
	}
	public static void main(String args[])
	{
		Vehicle v=new Vehicle();
		v.scan();
		v.kola();
	}
	

}
