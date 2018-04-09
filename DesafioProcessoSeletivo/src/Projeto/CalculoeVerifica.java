package Projeto;




import org.apache.commons.lang3.StringUtils;

public class CalculoeVerifica {
	private static String mo;
	private static int i;
	private static int p=0;
	private static int j=9999;
	private static String erro="não foi possivel calcular";
	public static String CalcularD(String Matricula) {
		if (Matricula != null) {
			mo=Matricula;
			i=Integer.parseInt(mo);
			if (i > p && i <= j )
			{
				int a, b, c, d, k , l;
				
				a =  Character.getNumericValue( Matricula.charAt(0))*5;
				b =  Character.getNumericValue(Matricula.charAt(1))*4;
				c =  Character.getNumericValue(Matricula.charAt(2))*3;
				d =  Character.getNumericValue(Matricula.charAt(3))*2;
				
				k = a+b+c+d;
				l = k % 16;

				Matricula = Matricula + "-" + StringUtils.upperCase(Integer.toHexString(l));
             return Matricula;
			}
			return erro;
		}

		return erro ; 
	}

	public static boolean verifica(String Matricula) 
	{
		if (Matricula != null) 
		{			
			if(Matricula.charAt(4)=='-' && Matricula.charAt(0)!='-' )// verifica se o hifen esta no lugar correto  provando que tem 4 digitos apenas e verifica que nao tem o menos na frente para não ser negativo
			{
				String hexa;
				char m;
				int a, b, c, d, k , l;
				
				a =  Character.getNumericValue( Matricula.charAt(0))*5;
				b =  Character.getNumericValue(Matricula.charAt(1))*4;
				c =  Character.getNumericValue(Matricula.charAt(2))*3;
				d =  Character.getNumericValue(Matricula.charAt(3))*2;
				
				k = a+b+c+d;
				l = k % 16;
				

				hexa = StringUtils.upperCase(Integer.toHexString(l));
				m = Matricula.charAt(5);

				if (hexa.equals(String.valueOf(m))) {
					return true;

				}
			}

		
	
		
		}
		return false;
		}
}
