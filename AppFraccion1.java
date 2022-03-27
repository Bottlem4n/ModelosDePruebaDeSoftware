import java.io.*;

public class AppFraccion1
{
	public static void main(String []args)
	{
		System.out.println("Modelos de prueba de sw");
		Fraccion fr1 = new Fraccion(3,4);
		Fraccion fr2 = new Fraccion(9,6);
		Fraccion fr3 = new Fraccion ();
		Fraccion fr4 = new Fraccion(5,0);
		System.out.println("fr1: " + fr1.getNumerador() +"/"+ fr1.getDenominador());
	}

}
