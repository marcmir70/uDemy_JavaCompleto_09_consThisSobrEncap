//uDemy, curso Java Completo, secao 9, aula 74 (base na aula 65 da seção 8)
//codigo em https://github.com/marcmir70/uDemy_JavaCompleto_09_consThisSobrEncap
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_74;

public class aula74 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//1		Product_74 product = new Product_74();
		
//1 		System.out.println(product.name);
//1 		System.out.println(product.price);
//1		System.out.println(product.quantity);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
//1 ...abaixo
		Product_74 product = new Product_74(name, price, quantity); // Ctrl Space autocompleta declaração
		
		System.out.println();
		System.out.println("Product data: " + product); // implicitamente chama metodo .toString()

		System.out.println();
		System.out.print("Enter the number of products to be added to stock: ");
//1		int quantity = sc.nextInt();
//1 ...removido 'int'		
		quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Product data: " + product); 
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Product data: " + product); 
		
		sc.close();
	}	
}