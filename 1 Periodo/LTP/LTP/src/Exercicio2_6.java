import java.util.*;
public class Exercicio2_6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		float altura;
		float peso;
		float imc;
		float pMaximo;
		float pMinimo;
		
		System.out.print("Digite o seu peso (Kg): ");
		peso = leia.nextFloat();
		System.out.print("Digite sua altura (m): ");
		altura = leia.nextFloat();
		
		imc = peso / altura * altura;
		if (imc < 20) {
			System.out.println("Situação = abaixo do peso");
		} else if (imc < 25) {
			System.out.println("Situação = peso ideal");
		} else {
			System.out.println("Situação = acima do peso");
		}
		
		pMinimo = 20 * (altura * altura);
		pMaximo = 25 * (altura * altura);
		System.out.print("Seu peso minimo é " + pMinimo);
		System.out.print(" e seu peso maximo é " + pMaximo);

	}

}

