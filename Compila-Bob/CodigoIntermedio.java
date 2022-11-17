import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

public class CodigoIntermedio {
    public static PrintWriter writer;
	static String fileName = "intermedio.txt";
    static String encoding = "UTF-8";
    
    static Token operador;
	static Token v1;
	static Token v2;
	static Token v3;
	


    class TokenAsignaciones
{
	  //Variable para validar asignaciones
	  public static int segunda = 0;
	  public static double numd=0, pnumd =0, rd=0,auxr=0;//decimal resultado
	  public static String n;
	  public static String p;
	  public static String posfijacad="";
	  //Tabla que almacenara los tokens declarados
	  public static Hashtable tabla = new Hashtable();
	  public static Stack<String> s = new Stack<String>();
	  //Tabla que almacenara los id numericos y decimal resultado
	  private static Hashtable tablaOD = new Hashtable();
	  //Listas y Pila para pasar expresion a postfija
	  public static ArrayList<Token> simb = new ArrayList();
	  private static ArrayList<Token> posfija = new ArrayList();
	  private static Stack<Token> pila = new Stack<Token>();
	  public static Expressiontree tree;

	public static void InsertarSimboloOD(Token identificador, double totalD)//Para obtener resultados decimal
	{
		tablaOD.put(identificador.image, totalD);
	}
		
		public static void addSimb(Token s){
				simb.add(s);
		}

		public static void delSimb(){
		simb.clear();}

    public static void construct(Token v)
    {
    	String band="";
        for (int i=0;i<simb.size();i++) {
        	tree.add(simb.get(i));
        	band+= " "+simb.get(i).image;
        }
        tree.generateCuadruple(tree.root,v);
        tree.current=null;
        tree.root=null;
    }

    public static boolean isOperator(String c) {
        return (c == "+" || c == "-" || c == "*" || c =="/" || c =="<" || c =="<=" || c==">"|| c==">="
        	|| c == "&" || c == "|"|| c == "!=" || c == "==" || c == "++" || c == "--");
    }

    public static int priority(Token operador){
        int val = -1;
        int tipoIdent1=0;

        if(operador.kind != 38 && operador.kind != 40 && operador.kind != 39){
        if(tabla.get(operador.image) != null) {
				tipoIdent1 = (Integer)tabla.get(operador.image);
		    }
        }

        if(operador.kind==38 || operador.kind==39 || tipoIdent1!=0){
       		val=3;
       	}
		if(operador.image=="*" || operador.image=="/"|| operador.image=="/" || operador.image=="==" || operador.image=="!="
			|| operador.image=="<=" || operador.image=="<" || operador.image==">" || operador.image==">="){
     		val = 2;
		}if(operador.image=="+" || operador.image=="++"|| operador.image=="--"  || operador.image=="-" || operador.image=="&&"|| operador.image=="||"){
			val = 1;
		}
           return val;
    }    
 
        /*//METODO PARA MANDAR ERROR DE RESTAR STRING
        public static String checkExpresion(Token TokenIzq, Token operador, Token TokenAsig){
        
            int tipoIdent1=0;
            int tipoIdent2=0;	


            if(TokenIzq.kind != 36 && TokenIzq.kind != 39 && TokenIzq.kind != 38 && TokenIzq.kind != 40){
            if(tabla.get(TokenIzq.image) == null || operador == null) {
				return "";
			}
            tipoIdent1 = (Integer)tabla.get(TokenIzq.image);
        	}

        	if(TokenAsig.kind != 36 && TokenAsig.kind != 39 && TokenAsig.kind != 38 && TokenAsig.kind != 40){
        	if(tabla.get(TokenAsig.image) == null  || operador == null) {
				return "";
			}
            tipoIdent2 = (Integer)tabla.get(TokenAsig.image);
        	}
			
			//35 es el valor de tipo de dato String
            if (tipoIdent1 == 35 && tipoIdent2 == 35||TokenIzq.kind == 39 && TokenAsig.kind == 39|| tipoIdent1 == 35 && TokenAsig.kind == 36 || tipoIdent1 == 35 &&  TokenAsig.kind == 38|| tipoIdent1 == 35 && TokenAsig.kind == 40|| tipoIdent1 == 35 && TokenAsig.kind == 39
            	||TokenIzq.kind == 36 && tipoIdent2 == 35||TokenIzq.kind == 38 && tipoIdent2 == 35 ||TokenIzq.kind == 40 && tipoIdent2 == 35||TokenIzq.kind == 39 && tipoIdent2 == 35
            	|| tipoIdent1 == 35 && tipoIdent2 == 32 || tipoIdent1 == 32 && tipoIdent2 == 35 || tipoIdent1 == 33 && tipoIdent2 == 35 || tipoIdent1 == 35 && tipoIdent2 == 33
            	|| TokenIzq.kind == 36 && TokenAsig.kind == 39|| TokenIzq.kind == 39 && TokenAsig.kind == 36|| tipoIdent1 == 32 &&  TokenAsig.kind == 39){
				switch(operador.image) {
					case ">=":
					case "<=":
					case ">":
					case "<":
					case "-":
					case "+":
					case "*":
					case "/":
						return "Error semántico: los tipos de datos String no pueden usar el operador " + operador.image + " en la linea " + operador.beginLine+" Col: "+ operador.beginColumn;
				}
            }
            //34 es el valor de tipo de dato char
            if (tipoIdent1 == 34 && tipoIdent2 == 34||TokenIzq.kind == 40 && TokenAsig.kind == 40 || tipoIdent1 == 34 && TokenAsig.kind == 36 || tipoIdent1 == 34 &&  TokenAsig.kind == 38|| tipoIdent1 == 34 && TokenAsig.kind == 39 || tipoIdent1 == 34 && TokenAsig.kind == 40
            	||TokenIzq.kind == 36 && tipoIdent2 == 34||TokenIzq.kind == 38 && tipoIdent2 == 34 ||TokenIzq.kind == 39 && tipoIdent2 == 34 ||TokenIzq.kind == 40 && tipoIdent2 == 34 || TokenIzq.kind == 38 && TokenAsig.kind == 40|| TokenIzq.kind == 40 && TokenAsig.kind == 38
            	|| tipoIdent1 == 34 && tipoIdent2 == 32 || tipoIdent1 == 32 && tipoIdent2 == 34 || tipoIdent1 == 33 && tipoIdent2 == 34 || tipoIdent1 == 34 && tipoIdent2 == 33
            	|| TokenIzq.kind == 36 && TokenAsig.kind == 40|| TokenIzq.kind == 40 && TokenAsig.kind == 36|| tipoIdent1 == 32 &&  TokenAsig.kind == 40|| TokenIzq.kind == 40 && tipoIdent2 == 32){
				switch(operador.image) {
					case ">=":
					case "<=":
					case ">":
					case "<":
					case "-":
					case "+":
					case "*":
					case "/":
						return "Error semántico: los tipos de datos Char no pueden usar el operador " + operador.image + " en la linea " + operador.beginLine+" Col: "+ operador.beginColumn;
				}
            }
            if (tipoIdent1 == 34 && tipoIdent2 == 35 || tipoIdent1 == 35 && tipoIdent2 == 34 || TokenIzq.kind == 40 && TokenAsig.kind == 39 || TokenIzq.kind == 39 && TokenAsig.kind == 40){
				switch(operador.image) {
					case ">=":
					case "<=":
					case ">":
					case "<":
					case "-":
					case "+":
					case "*":
					case "/":
						return "Error semántico: los tipos de datos Char y String no pueden usar el operador " + operador.image + " en la linea " + operador.beginLine+" Col: "+ operador.beginColumn;
				}
            }
            if(tipoIdent1 == 32 || tipoIdent1 == 33 || TokenIzq.kind == 36 || TokenIzq.kind == 38){
            	auxr=1;
            }
			
            return "";
        }*/
        
    }


    class Expressiontree{
        public static Node<Token> root,current;
         public static boolean flag = false;
            public static int counter = 0;
            public static int etiquet = 0;
         public static String result = "", temp = "";
         public static ArrayList<Cuadruple> cuadruples = new ArrayList();
            //ARBOL
       public Expressiontree(){}
   
       public ArrayList<Cuadruple> retList(){
           return cuadruples;
       }
       public  void add(Token t){
           current = insert(current,t);
           flag = false;
       }
   
       public  Node<Token> insert(Node<Token> current,Token t){
           Node<Token> newNode, aux;
           if( current == null){
               newNode = new Node<Token>(t);
               if( root != null){
                   newNode.left = root;
                   root.parent = newNode;
               }
               root = newNode;
               return newNode;
           }
           newNode = new Node<Token>(t);
           int currentPriority = TokenAsignaciones.priority(current.data), 
                   newPriority = TokenAsignaciones.priority(newNode.data);
           if( currentPriority >= newPriority){
               aux = insert(current.parent,t);
               if( flag ){
                   current.parent = aux;
                   aux.left = current;
               }
               
               current = aux;
               flag=false; 
           }else{
               newNode.parent = current;
               current.right = newNode;
               current = newNode;
               flag = true;
           }
           
           return current;
       }
   
       public static boolean assignment(){
           if( root.left == null && root.right == null ){
               return true;
           }
           return false;
       }
       public static String generateCuadruple(Node<Token> node,Token v) {
            if (node != null) {
                String value1,value2;
                value1 = generateCuadruple(node.left,v);
                value2 = generateCuadruple(node.right,v);
                if(TokenAsignaciones.isOperator(node.data.image)){
                    counter++;
                    if( node.parent == null){
                        if(v.image=="decide"){
                         //result = (node.data.image+"    "+value1+"   "+value2+"    T"+(counter));
                         etiquet +=1;
                         writer.println(node.data.image+"    "+value1+"   "+value2+"    T"+(counter));
                         writer.println("L"+etiquet+": if"+"   T"+(counter)+"   goto   L"+(etiquet+1));
                         etiquet +=1;
                        }else if(v.image=="repito"){
                            etiquet +=1;
                         writer.println(node.data.image+"    "+value1+"   "+value2+"    T"+(counter));
                         writer.println("L"+etiquet+": if"+"   T"+(counter)+"   goto   L"+(etiquet-1));
                        }else if(v.image=="repito hasta que"){
                         etiquet +=1;
                         writer.println(node.data.image+"    "+value1+"   "+value2+"    T"+(counter));
                         writer.println("L"+etiquet+": if"+"   T"+(counter)+"   goto   L"+(etiquet+1));
                         etiquet +=1;
                        }
                        else if(node.data.image=="++"){ 
                            writer.println("+     "+value1+"    1    "+v.image+"\n");
                        }else if(node.data.image=="--"){ 
                            writer.println("-     "+value1+"    1    "+v.image+"\n");
                        }
                        else{ //result = (node.data.image+"    "+value1+"    "+value2+"     "+v.image);
                        writer.println(node.data.image+"    "+value1+"    "+value2+"     "+v.image+"\n");
                        }
                        //counter=0;
                        //cuadruples.add(new Cuadruple(v.image, node.data.image, value1, value2));
                    }else{ //result = (node.data.image+"    "+value1+"    "+value2+"     T"+counter);
                        writer.println(node.data.image+"    "+value1+"    "+value2+"     T"+counter);
                         //cuadruples.add(new Cuadruple("T"+counter, node.data.image, value1, value2));
                    }
                    return "T"+(counter);
                }else{
                    if( assignment() ){
                        writer.println(v.image+":="+node.data.image+"\n");
                        //result = ("T1"+":="+node.data.image);
                    }
                    return node.data.image;
                }  
            }
            return "";
        }
    }
   
   
    class Node<Token>{
           Token data;
           Node<Token> parent,right,left;
           
           public Node(Token val){ data = val; }
       }
   
    class Cuadruple {
   
       private static String name,operator,firstOperand,secondOperand;
   
       public Cuadruple() {}
       public Cuadruple(String n, String op, String opn1, String opn2) {
           name = n;
           operator = op;
           firstOperand = opn1;
           secondOperand = opn2;
       }
       
       public String getName() {
           return name;
       }
       public void setName(String name) {
           this.name = name;
       }
       public String getOperator() {
           return operator;
       }
       public void setOperator(String operator) {
           this.operator = operator;
       }
       public String getFirstOperand() {
           return firstOperand;
       }
       public void setFirstOperand(String firstOperand) {
           this.firstOperand = firstOperand;
       }
       public String getSecondOperand() {
           return secondOperand;
       }
       public void setSecondOperand(String secondOperand) {
           this.secondOperand = secondOperand;
       }
   }

}


//GRAMATICAS METODO PARA CODIGO INTERMEDIO NO DESCOMENTAR
/*void Decide():{}
{
IF() ( 
	LOOKAHEAD(2)
	ELSE()|{})

}
void IF():{
	Token v1;
	Token v2;
	int val=0,h=0;
}
{
	<IF>{v1=token;}<ParenIzq> OpComparacion() <ParenDer>{CodigoIntermedio.TokenAsignaciones.construct(v1); CodigoIntermedio.TokenAsignaciones.delSimb();}  <ASIGNACION>  <SepIzq>
	{CodigoIntermedio.writer.println("Goto L"+(CodigoIntermedio.Expressiontree.etiquet+1)+" \nL"+CodigoIntermedio.Expressiontree.etiquet+":");  h=CodigoIntermedio.Expressiontree.etiquet+1; CodigoIntermedio.Expressiontree.etiquet+=1;}
	(	 
	sentencias() 
	)*
	<SepDer>(ELSE(){val=1;})*
	{
		if(val==0){CodigoIntermedio.writer.println("L"+h);
		}else{CodigoIntermedio.writer.println("L"+CodigoIntermedio.Expressiontree.etiquet);}
	}
}

void ELSE():{}
{
	<ELSE> <SepIzq>{CodigoIntermedio.writer.println("Goto L"+(CodigoIntermedio.Expressiontree.etiquet+1)+" \nL"+CodigoIntermedio.Expressiontree.etiquet+":");  CodigoIntermedio.Expressiontree.etiquet+=1;}
	(	 
	sentencias() )*<SepDer> (<PuntoComa>|errorFinlinea())
}


// ############## CICLOS #############

void Ciclo_RepitoHastaQue():
{
	Token v1,ite,op;
	int h=0;
	int k=0;}
{
	<CicloIterado>{v1=token;} <ParenIzq> <IDENTIFICADOR> <COMA> (<IDENTIFICADOR>|DataType()){CodigoIntermedio.TokenAsignaciones.construct(v1); h=(CodigoIntermedio.Expressiontree.etiquet-1); CodigoIntermedio.writer.println("Goto L"+(CodigoIntermedio.Expressiontree.etiquet+1)); CodigoIntermedio.writer.println("L"+CodigoIntermedio.Expressiontree.etiquet+":"); CodigoIntermedio.TokenAsignaciones.delSimb(); CodigoIntermedio.Expressiontree.etiquet+=1; k=CodigoIntermedio.Expressiontree.etiquet;} <ParenDer> (<ASIGNACION>|ErrorNoAsignacion())
	<SepIzq> (sentencias())* <SepDer> (<PuntoComa>|errorFinlinea()){CodigoIntermedio.TokenAsignaciones.addSimb(ite); CodigoIntermedio.TokenAsignaciones.addSimb(op); CodigoIntermedio.TokenAsignaciones.addSimb(ite); CodigoIntermedio.TokenAsignaciones.construct(ite); 
		CodigoIntermedio.writer.println("Goto L"+h); CodigoIntermedio.writer.println("L"+k);}

}

 void Ciclo_RepitoMientras():
 {	
	Token v1;
	Token v2;
	int h=0;
}
{
	<CicloLimit>{CodigoIntermedio.writer.println("\nL"+(CodigoIntermedio.Expressiontree.etiquet+1)+":");  CodigoIntermedio.Expressiontree.etiquet+=1;} (<ASIGNACION>|ErrorNoAsignacion()) <SepIzq> 
	(sentencias())* 
	<SepDer> <CicloWhile>{v1=token;}<ParenIzq> OpComparacion(){CodigoIntermedio.TokenAsignaciones.construct(v1); CodigoIntermedio.TokenAsignaciones.delSimb();
		CodigoIntermedio.Expressiontree.etiquet+=1; CodigoIntermedio.writer.println("Goto L"+(Expressiontree.etiquet)); CodigoIntermedio.writer.println("L"+(Expressiontree.etiquet));}<ParenDer> (<PuntoComa>|errorFinlinea())
} 
*/


