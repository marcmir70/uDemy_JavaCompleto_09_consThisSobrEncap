//uDemy, curso Java Completo, secao 9, aula 76 (base na aula 76)
//codigo em https://github.com/marcmir70/uDemy_JavaCompleto_09_consThisSobrEncap
package entities;

public class Product_76 {

	public String name;
	public double price;
	public int quantity;

// sobrecarga : inclusao de construtor padrao
	public Product_76() {
	}
	
	public Product_76 (String name, double price, int quantity) { // por convenção, usamos os mesmos nomes dos atributos
		this.name = name; 
		this.price = price; 
		this.quantity = quantity; 
	}

// sobrecarga : disponibilizar mais de uma versao da mesma operacao	
	public Product_76 (String name, double price) { // por convenção, usamos os mesmos nomes dos atributos
		this.name = name; 
		this.price = price; 
//		this.quantity = 0;  opcional, no Java atributos sao iniciados como zero ou null
//		quantity = 0;  seria possivel por nao ser ter mais o parametro nesta sobrecarga		
	}

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
