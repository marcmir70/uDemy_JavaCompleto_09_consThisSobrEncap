//uDemy, curso Java Completo, secao 9, aula 76 (base na aula 65 da seção 8)
//codigo em https://github.com/marcmir70/uDemy_JavaCompleto_09_consThisSobrEncap
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_76;

public class aula76 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
//1		System.out.print("Quantity in stock: ");
//1		int quantity = sc.nextInt();
//1 ...construtor apenas com 2 argumentos/parametros
		Product_76 product = new Product_76(name, price); // Ctrl Space autocompleta declaração
		
		System.out.println();
		System.out.println("Product data: " + product); // implicitamente chama metodo .toString()

		System.out.println();
		System.out.print("Enter the number of products to be added to stock: ");
		int quantity = sc.nextInt();
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