public class OlaMundo {
	
	public static void main(String[] args) {
	// imprime uma mensagem na saída padrão
		
	/*
	Esta linha será ignorada pelo compilador.
	System.out.println("Esta instrução será ignorada também");
	E esta linha também.
	*/	
		
	/*
	 Existem várias outras sequências de escape, sendo que as mais conhecidas são:
		• \n para nova linha
		• \\ para uma barra invertida
		• \" para aspas duplas
	 */
	
	System.out.println("Olá Mundo");
	
	}
	
}

public class ExemploVariaveis {
	
	public static void main(String[] args) {
		int quantidade;
		
		quantidade = 10;
		System.out.println(quantidade);
		
		quantidade = 15;
		System.out.println(quantidade);
		
	}
	
}


//instanciando um wrapper que representa
//um número primitivo do tipo long
Long idadeEmMilisegundos = Long.valueOf(933120000000L);

//instanciando um wrapper que transforma
//a String "15" em tipo primitivo
//e embrulha em um objeto wrapper
Integer diasParaPagamento = Integer.valueOf("15");

//wrapper que representa um double
Double precoPassagem = Double.valueOf(200.10);

//wrapper que representa um float
Float distanciaPercorrida = Float.valueOf("100.6");

//representa o valor true
Boolean temPendencias = Boolean.valueOf(true);

//representa o valor false
//(qualquer texto diferente de true representa false)
Boolean atrasado = Boolean.valueOf("Yes");

//numeroAtual = numeroAtual + 1;
numeroAtual++;

int x = 10;
int y = 5;
int soma = x + y; // adição
System.out.println("Resultado: " + soma); // concatenação


int soma = 2 + 10;
int subtracao = 6 - 10;
int multiplicacao = 8 * 3;
int divisao = 8 / 2;
int resto = 7 % 2;

System.out.println(soma);
System.out.println(subtracao);
System.out.println(multiplicacao);
System.out.println(divisao);
System.out.println(resto);



boolean maior = b > a; // 'b' é maior que 'a'?
boolean maiorOuIgual = b >= a; // 'b' é maior ou igual a 'a'?
boolean menor = a < b; // 'a' é menor que 'b'?
boolean menorOuIgual = a <= 10; // 'a' é menor ou igual a '10'?
boolean igual = a == b - c; // 'a' é igual a 'b' menos 'c'?
boolean diferente = a != c; // 'a' é diferente de 'c'?

System.out.println(maior);
System.out.println(maiorOuIgual);
System.out.println(menor);
System.out.println(menorOuIgual);
System.out.println(igual);
System.out.println(diferente);


for (iniciação; condição; incremento) {
	// bloco de código do loop
	}

int numeroFinal = 9;

for (int i = 1; i <= numeroFinal; i++) {
	System.out.println(i);
}

