package org.generation.italy;

import java.util.Scanner;

public class CalcolaBigliettoTreno {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci età: ");
		int age = sc.nextInt();
		
		System.out.print("Inserisci numero di km da percorrere: ");
		double km = sc.nextDouble();
		
		double price = km * 0.21;
		double decimalPrice  = Math.round(price*100.0)/100.0;
		double minDiscount = price * 0.2;
		double overDiscount = price * 0.65;
		
		if(age < 12) {
			System.out.print("Per i minori di 12 anni, il viaggio è completamente gratuito :-)");
		} else if(age < 18) {
			double minPrice = price - minDiscount;
			double decimalMinPrice  = Math.round(minPrice*100.0)/100.0;
			System.out.print("Prezzo del biglietto scontato per i minorenni: " + decimalMinPrice + "€");
		} else if(age > 65){
			double overPrice = price - overDiscount; 
			double decimalOverPrice  = Math.round(overPrice*100.0)/100.0;
			System.out.print("Prezzo del biglietto scontato per gli over 65: " + decimalOverPrice + "€");
		} else {
			System.out.print("Prezzo del biglietto: " + decimalPrice + "€");
			
		}
		
	}
}
