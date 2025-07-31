import java.util.*;
public class Exercicio2_7 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		byte tempoCasa;
		float salario;
		float bonus;
		float valeTransporte;
		
		System.out.print("Anos de casa: ");
		tempoCasa = leia.nextByte();
		System.out.print("Salário: ");
		salario = leia.nextFloat();
		
		if (tempoCasa <= 5 && salario < 300) {
			System.out.println("Bonus : R$50,00");
			valeTransporte = 0.05f * salario;
			System.out.print("Vale transporte: R$" + valeTransporte);
		} else if (tempoCasa <= 5 && salario > 300) {
			System.out.println("Bonus: R$80,00");
			valeTransporte = 0.06f * salario;
			System.out.print("Vale transporte: R$" + valeTransporte);
		} else if (tempoCasa < 10 && salario <= 500) {
			bonus = 0.15f * salario;
			System.out.println("Bonus: R$" + bonus);
			System.out.print("Vale transporte: R$70,00");
		} else if (tempoCasa < 10 && salario < 2000) {
			bonus = 0.13f * salario;
			System.out.println("Bonus: R$" + bonus);
			System.out.print("Vale transporte: R$90,00");
		} else if (tempoCasa < 10 && salario > 2000) {
			bonus = 0.12f * salario;
			valeTransporte = 0.08f * salario;
			System.out.println("Bonus: R$" + bonus);
			System.out.print("Vale transporte: R$" + valeTransporte);
		} else {
			valeTransporte = 0.04f * salario;
			System.out.println("Bonus: R$300,00");
			System.out.print("Vale transporte: R$" + valeTransporte);
		}

	}

}

