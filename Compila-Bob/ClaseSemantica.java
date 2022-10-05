import java.io.PrintStream;
import java.util.Hashtable;
import java.lang.String;
import java.util.ArrayList;

public class ClaseSemantica{
    public static Hashtable tabla = new Hashtable();
    private static ArrayList<Integer> intComp = new ArrayList();
	private static ArrayList<Integer> decComp = new ArrayList();
	private static ArrayList<Integer> strComp = new ArrayList();

    public static void InsertarSimbolo(Token identificador, int tipo)
	{
		//En este metodo se agrega a la tabla de tokens el identificador que esta siendo declarado junto con su tipo de dato
		tabla.put(identificador.image, tipo);
	 }


	 public static void SetTables()
	{
		/*En este metodo se inicializan las tablas, las cuales almacenaran los tipo de datos compatibles con:		
		 entero = intComp
		 decimal = decComp
		 cadena = strComp
		 caracter = chrComp
		*/
		intComp.add(32);
		intComp.add(34);
		
		decComp.add(32);
		decComp.add(34);
		decComp.add(33);
		decComp.add(35);

		
		strComp.add(36);
		strComp.add(31);
		strComp.add(39);
	}

	public static String checkAsing(Token TokenIzq, Token TokenAsig)
	{
		//variables en las cuales se almacenara el tipo de dato del identificador y de las asignaciones (ejemplo: n1(tipoIdent1) = 2(tipoIdent2) + 3(tipoIdent2))
		int tipoIdent1;
		int tipoIdent2;		
							/* De la tabla obtenemos el tipo de dato del identificador  
								asi como, si el token enviado es diferente a algun tipo que no se declara como los numeros(32), los decimales(35),
								caracteres(38) y cadenas(31)
								entonces tipoIdent1 = tipo_de_dato, ya que TokenAsig es un dato*/
		if(TokenIzq.kind != 32 && TokenIzq.kind != 33)		
		{
			try 
			{
				//Si el TokenIzq.image existe dentro de la tabla de tokens, entonces tipoIdent1 toma el tipo de dato con el que TokenIzq.image fue declarado
				tipoIdent1 = (Integer)tabla.get(TokenIzq.image);	
			}
			catch(Exception e)
			{
				//Si TokenIzq.image no se encuentra en la tabla en la cual se agregan los tokens, el token no ha sido declarado, y se manda un error
				return " ";
			}
		}
		else 		
			tipoIdent1 = 0;
			
		//TokenAsig.kind != 48 && TokenAsig.kind != 50 && TokenAsig.kind != 51 && TokenAsig.kind != 52
		if(TokenAsig.kind == 39)	
		{
			/*Si el tipo de dato que se esta asignando, es algun identificador(kind == 39) 
			se obtiene su tipo de la tabla de tokens para poder hacer las comparaciones*/
			try
			{
				tipoIdent2 = (Integer)tabla.get(TokenAsig.image);
			}
			catch(Exception e)
			{
				//si el identificador no existe manda el error
				return " ";
			}
		}
				//Si el dato es entero(48) o decimal(50) o caracter(51) o cadena(52)
				//tipoIdent2 = tipo_del_dato
		else if(TokenAsig.kind == 32 || TokenAsig.kind == 33 || TokenAsig.kind == 36)
			tipoIdent2 = TokenAsig.kind;
		else //Si no, se inicializa en algun valor "sin significado(con respecto a los tokens)", para que la variable este inicializada y no marque error al comparar
			tipoIdent2 = 0; 

			
	  
		
		if(tipoIdent1 == 34) //Int
		{
			//Si la lista de enteros(intComp) contiene el valor de tipoIdent2, entonces es compatible y se puede hacer la asignacion
			if(intComp.contains(tipoIdent2))
				return " ";
			else //Si el tipo de dato no es compatible manda el error
				return "Error semántico  en la linea "+TokenAsig.beginLine+", columna "+TokenAsig.beginColumn+ " no se puede convertir " + TokenAsig.image + " a Entero\r\n";
		}
		else if(tipoIdent1 == 35 || tipoIdent1 == 36) //flotante
		{
			if(decComp.contains(tipoIdent2))
				return " ";
			else
				return "Error semántico en la linea "+TokenAsig.beginLine+", columna "+TokenAsig.beginColumn+ " no se puede convertir " + TokenAsig.image + " a Decimal \r\n";
		}
		else if(tipoIdent1 == 31) //string
		{
			if(strComp.contains(tipoIdent2))
				return " ";
			else
				return "Error semántico en la linea "+TokenAsig.beginLine+", columna "+TokenAsig.beginColumn+ " no se puede convertir " + TokenAsig.image + " a Cadena \r\n";
		}else
		{
			return " ";
		}
	}	  


	/*Metodo que verifica si un identificador ha sido declarado, ej cuando se declaran las asignaciones: i++, i--)*/ 
		public static String checkVariable(Token checkTok)
		{
			try
			{
				//Intenta obtener el token a verificar(checkTok) de la tabla de los tokens
				int tipoIdent1 = (Integer)tabla.get(checkTok.image);
				return "\r\n";
			}
			catch(Exception e)
			{				//Si no lo puede obtener, manda el error
				return "Error semántico en la línea:  " +checkTok.beginLine +" columna:  "+checkTok.beginColumn +", "+ checkTok.image + " no ha sido declarado \r\n";
			}
		}
	

     

}