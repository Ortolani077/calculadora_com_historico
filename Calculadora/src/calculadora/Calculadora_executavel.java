package calculadora;

import java.util.Scanner;

public class Calculadora_executavel {

	
	
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		Calculadora_switch calculadora = new Calculadora_switch();
		
		
		
	do {
		
		System.out.print("Digite o primeiro número: ");
		float n1 = scanner.nextFloat();
		System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
		System.out.print("Digite o segundo número: ");
		float n2 = scanner.nextFloat();
		
		 float resultado= calculadora.calcularResultado(n1 , n2 , operador);
		 
		 System.out.println("Resultado: " + resultado );
		System.out.println("----------------------------------------------------------------------");
		
	} while (true);
	
	
	
	}
		
		
	}


