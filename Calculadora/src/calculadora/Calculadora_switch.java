package calculadora;

import java.util.ArrayList;
import java.util.List;

public class Calculadora_switch {

	
	
	float n1;
	float n2;
	char operador;
	float resultado;
	private List<String>historico = new ArrayList<>();
	
	


	public float calcularResultado(float n1, float n2, char operador) {
	    float resultado = 0;

	    switch (operador) {
	        case '+':
	            resultado = n1 + n2;
	            break;
	        case '-':
	            resultado = n1 - n2;
	            break;
	        case '*':
	            resultado = n1 * n2;
	            break;
	        case '/':
	            if (n2 == 0) {
	                System.out.println("Erro, Não se faz divisão por zero");
	            } else {
	                resultado = n1 / n2;
	            }
	            break;
	        default:
	            System.out.println("Erro de operador");
	    }

	    
	    		/*add ao historico*/
	    	
	    String operacao = String.format("%.2f %c %.2f = %.2f", n1, operador, n2, resultado);
	    historico.add(operacao);
	    
	    /*exibir*/
	    
	    exibirHistorico();
	    return(resultado);
	    
	}
	
	private void adicionarAoHistorico(String operacao) {
		
	historico.add(operacao);
	if(historico.size()>5) {
		historico.remove(0);
		
		
	}
	}
		
	private void exibirHistorico() {
		
		System.out.println("\nHistórico: ");
		for(String operacao:historico) {
			System.out.println(operacao );
			
			
		}
	}	
	
	}
	
	
	

	
			
			
