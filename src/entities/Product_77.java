//uDemy, curso Java Completo, secao 9, aula 77 (base na aula 76)
//codigo em https://github.com/marcmir70/uDemy_JavaCompleto_09_consThisSobrEncap
package entities;

public class Product_77 {

	private String name;
	private double price;
	private int quantity;

// Construtores
	// construtor padrao
	public Product_77() {
	}
	
	public Product_77 (String name, double price, int quantity) { 
		this.name = name; 
		this.price = price; 
		this.quantity = quantity; 
	}

	public Product_77 (String name, double price) { 
		this.name = name; 
		this.price = price; 
	}

// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

//	public void setQuantity(int quantity) {  nao se deve permitir alterar direto do 
//		this.quantity = quantity;            programa sendo mudada quando entra ou sai 
//	}	                                     um produto do estoque
	
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
