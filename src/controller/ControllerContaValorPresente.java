package controller;

public class ControllerContaValorPresente {

	public ControllerContaValorPresente() {
		super();
	}

	public int ContaNumeros(double v, double n) {
		int cont = 0;
		if (v == 0) { // Quando valor for == 0 não há mais valores a ser comparados/contados, então retornar 0
			return 0;
		} else {
			double resto = v % 10; // Calcular resto
			cont = cont + ContaNumeros(((v - resto) / 10), n); // Chama função novamente retirando o valor do resto, assim tem-se v sem o último valor já analisado
			if (resto == n) {
				return cont + 1; // Se resto for igual valor de comparação somar 1 ao contador
			} else {
				return cont;
			}
		}
	}

}
