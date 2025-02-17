package controller;

public class SomaController {

	public SomaController() {
		super();
	}
	
    public int somannatural(int n, int contador, int soma) {
    	if (n < 0) {
    		return 0; // Retornará 0 caso o usuário insira um número negativo.
    		}
    	if (contador > n) {
    		return soma; // Ponto de parada - quando o contador passar de n, será retornada a ultima sokma.
    	}
    		soma = soma + contador; // Incremento da soma com o contador.
    		contador++; // incremento do contador.
    		return somannatural(n, contador, soma);
    		
    }
}
