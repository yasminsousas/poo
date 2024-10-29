package employe;

import java.util.Locale;
import java.util.Scanner;

//Programa para ler os dados de um funcionário.
//Em seguida, mostrar os dados do funcionário.
//Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada e mostrar novamente.
public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Employee employee = new Employee();
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println(employee);
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println();
		System.out.println("Update data: " + employee);
		
		sc.close();
	}

}
