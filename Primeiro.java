public class Primeiro{
	
	private static String[] parametros;
	//visibilidade tipo-retorno nome parametros
	private static int idade;
	private static float salario;
	private static String nome;
	private static String sobrenome;
	private static boolean sabeJava;
	private static int qtdeMeses;
	
	private static void tratarParametros(){
		//início parametros
		nome = parametros[0];
		sobrenome = parametros[1];
		idade = Integer.valueOf (parametros[2]);
		salario = Float.valueOf (parametros[3]);
		sabeJava = "s".equalsIgnoreCase(parametros[4]) ? true : false;
		qtdeMeses = Integer.valueOf(parametros[5]);
		//fim parametros
	}
	
	private static boolean validar(){
		return parametros.length == 6;
	}
	
	public static void main(String[] args)	{
		
		parametros = args;
		
		if(validar()){
		parametros = args;
		tratarParametros();
		
		int anoNascimento = 2021 - idade;
		float salarioTotal = salario * qtdeMeses;
		String exp =  idade < 50 ? "Iniciante" : "Veterano";
		String estabilidade = salarioTotal > 1000 ? "Estavel" : "Instavel";
		
		System.out.println ("Nome: " + nome);
		System.out.println ("Sobrenome: " + sobrenome);
		System.out.println ("Idade: " + idade);
		System.out.println ("Nascimento: " + anoNascimento);
		System.out.println ("Salario: " + salario);
		System.out.println ("Java?: " + sabeJava);
		System.out.println ("Salário Total: " + salarioTotal);
		System.out.println ("Experiencia: " + exp);
		System.out.println ("Estabilidade: " + estabilidade);
		
		}else{
			System.out.println ("Problemas na quantidade de parametros");
		}
}}