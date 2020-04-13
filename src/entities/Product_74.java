//uDemy, curso Java Completo, secao 9, aula 74 (base na aula 65 da seção 8)
//codigo em https://github.com/marcmir70/uDemy_JavaCompleto_09_consThisSobrEncap
package entities;

public class Product_74 {

	public String name;
	public double price;
	public int quantity;

// aula 74
	public Product_74(String name, double price, int quantity) { // por convenção, usamos os mesmos nomes dos atributos
		this.name = name; 
		this.price = price; 
		this.quantity = quantity; 
	}
// aula 74

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
		return name + ", $ " 
				+ String.format("%.2f", price) + ", " 
				+ quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
