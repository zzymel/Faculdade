import java.util.*;
public class Exercicio2_5 {

	public static void main(String[] args) {
		
		byte ladoA;
		byte ladoB;
		byte ladoC;
		float somaAeB;
		float somaBeC;
		float somaAeC;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("O lado A do triangulo mede: ");
		ladoA = leia.nextByte();
		System.out.print("O lado B do triangulo mede: ");
		ladoB = leia.nextByte();
		System.out.print("O lado C do triangulo mede: ");
		ladoC = leia.nextByte();
		
		somaAeB = ladoA + ladoB;
		somaBeC = ladoB + ladoC;
		somaAeC = ladoA +  ladoC;
		
		if (somaAeB <= ladoC || somaBeC <= ladoA || somaAeC <= ladoB) {
			System.out.print("Não é um triangulo");
		} else if (ladoA == ladoB && ladoA == ladoC) {
			System.out.print("O triangulo é equilátero!");
		} else if (ladoA != ladoB && ladoA != ladoC) {
			System.out.print("O triangulo é escaleno!");
		} else {
			System.out.print("O triangulo é isósceles!");
		}

	}
	
}
