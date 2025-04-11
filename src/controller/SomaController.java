package controller;

public class SomaController {

	public SomaController() {
		super();
	}
	
    public int somannatural(int n, int contador, int soma) {
    	if (n < 0) {
    		return 0; 
    		}
    	if (contador > n) {
    		return soma; 
    	}
    		soma = soma + contador; 
    		contador++; 
    		return somannatural(n, contador, soma);   		
    }
}