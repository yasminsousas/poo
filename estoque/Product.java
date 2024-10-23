package estoque;

public class Product { //atributos
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() { //valor total do estoque que é o preço x quantidade e retornará o valor
		return price * quantity;
	}
	
	public void addProducts(int quantity) { //adição de produtos no estoque 
		this.quantity += quantity; //this especifica que quer acessar o atributo da classe
	}
	
	public void removeProducts(int quantity) { //remoção de produtos no estoque
		this.quantity -= quantity;
	}
}

