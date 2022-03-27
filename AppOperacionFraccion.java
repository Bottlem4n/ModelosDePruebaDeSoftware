public class AppOperacionFraccion
{
	public static void main (String args[])
	{	
		Fraccion fr1 = new Fraccion(10,8);
		Fraccion fr2 = new Fraccion(2,5);
		Fraccion resultado = OperacionFraccion.multiplica(fr1,fr2);
		System.out.println("La multiplicacion de "+fr1+" * "+ fr2 + " = " + resultado);
	}
}
