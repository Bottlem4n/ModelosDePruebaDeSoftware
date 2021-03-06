// OperacioFraccion.java
// Equipo K
// Integrantes:
// Nombre			|	Participacion
// Botello Contreras Jair	|		1
// Garcia Reyes Irving		|		1

public class OperacionFraccion
{
	public static Fraccion multiplica (Fraccion frac1, Fraccion frac2)
	{
		Fraccion resultado;
		int numerador = frac1.getNumerador() * frac2.getNumerador();
		int denominador = frac1.getDenominador() * frac2.getDenominador();
		resultado = new Fraccion(numerador,denominador);
		Fraccion resultadoSimplificado;
		resultadoSimplificado = simplificar(resultado);
		return resultadoSimplificado;
	}

	public static int maximoComunDivisor(Fraccion resultado){
		int u = Math.abs(resultado.getNumerador());
		int v = Math.abs(resultado.getDenominador());
		if (v==0){
			return u;
		}

		int resto;
		while (v!=0){
			resto = u % v;
			u = v;
			v = resto;
		}
		return u;
	}

	public static Fraccion simplificar(Fraccion resultado){
		int mcd = maximoComunDivisor(resultado);
		int numerador = resultado.getNumerador() / mcd;
		int denominador = resultado.getDenominador() / mcd;
		Fraccion resultadoSimplificado;
		resultadoSimplificado = new Fraccion(numerador,denominador);
		return resultadoSimplificado;
	}

}
