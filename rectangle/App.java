package rectangle;

import java.util.Locale;
import java.util.Scanner;

public class App {
//Faça um programa para ler os valores da largura e altura de um retângulo.
//Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width: ");
		rectangle.width = sc.nextDouble();
		System.out.println("Enter rectangle height: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
	
		sc.close();	
	}

}
