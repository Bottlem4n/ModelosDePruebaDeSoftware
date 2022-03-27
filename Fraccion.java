public class Fraccion
{
	private int numerador;
	private int denominador;

	public Fraccion()
	{
		numerador = 0;
		denominador = 1;
	}

	public Fraccion(int numerador, int denominador)
	{
		this.numerador = numerador;
		if(denominador > 0)
			this.denominador = denominador;
		else
			this.denominador = 1;
	}

	public int getNumerador()
	{
		return numerador;
	}

	public int getDenominador()
	{
		return denominador;
	}

	public void setNumerador(int val)
	{
		numerador=val;
	}

	public void setDenominador(int val)
	{
		if(val >0)
			this.denominador = val;
		else 
			this.denominador = 1;
	}

	/*public int mcd()
	{
		int u = Math.abs(numerador);
		int v = Math.abs(denominador);
		if (v==0)
		{
			return u;
		}
		int r;
		while (v!=0)
		{
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}

	public void simplificar()
	{
		int n = mcd();
		numerador = numerador / n;
		denominador = denominador / n;
	}*/

	@Override
	public String toString()
	{
		String cadena;
		cadena = numerador+"/"+denominador;
		return cadena;
	}
}
