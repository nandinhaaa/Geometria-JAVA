
public class Main {
	public static void main(String[] args) {

		// Teste da classe Quadrado
		quadrado primeiroQuadrado = new quadrado();
		primeiroQuadrado.setLado(10);
		
		double areaPrimeiroQuadrado = primeiroQuadrado.calculaArea();
		System.out.println("Area quadrado: " + areaPrimeiroQuadrado);
		
		System.out.println("Desenho quadrado: ");
		primeiroQuadrado.desenhar();
	}
}
