public class OperacionFraccion
{
	public static Fraccion multiplica (Fraccion frac1, Fraccion frac2)
	{
		Fraccion resultado;
		int numerador = frac1.getNumerador() * frac2.getNumerador();
		int denominador = frac1.getDenominador() * frac2.getDenominador();
		resultado = new Fraccion(numerador,denominador);
		Fraccion resultadoSimp;
		resultadoSimp = simplificar(resultado);
		return resultadoSimp;
	}

	public static int mcd(Fraccion resultado){
		int u = Math.abs(resultado.getNumerador());
		int v = Math.abs(resultado.getDenominador());
		if (v==0){
			return u;
		}

		int r;
		while (v!=0){
			r = u %v;
			u=v;
			v = r;
		}
		return u;
	}

	public static Fraccion simplificar(Fraccion resultado){
		int n = mcd(resultado);
		int num = resultado.getNumerador() / n;
		int dem = resultado.getDenominador() / n;
		Fraccion res;
		res = new Fraccion(num,dem);
		return res;
	}

}
