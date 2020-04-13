//uDemy, curso Java Completo, secao 9, aula 77 (base na aula 76)
//codigo em https://github.com/marcmir70/uDemy_JavaCompleto_09_consThisSobrEncap
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_77;

public class aula77 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Product_77 product = new Product_77(name, price);
		
//		product.name = "Computer"; se na classe Product_77 os atributos sao PRIVATE retorna erro
		product.setName("Computer");
		System.out.println("Updated Name:: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated Price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);

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