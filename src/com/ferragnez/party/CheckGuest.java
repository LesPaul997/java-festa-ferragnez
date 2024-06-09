package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		// Definisci invitati con Array
		
		String [] people = {
				"Dua Lipa",
				"Paris Hilton",
				"Manuel Agnelli",
				"J-Ax",
				"Francesco Totti",
				"Ilary Blasi",
				"Bebe Vio",
				"Luis",
				"Pardis Zarei",
				"Martina Maccherone",
				"Rachel Zeilic", };
		
		Scanner input = new Scanner (System.in);
		
		//Varibile con input name 
		System.out.println("Inserisci il tuo nome");
		String name = input.nextLine();
		
		//Valore Booleano
		boolean invited = false;
		
		//Ciclo for per verificare se l'utente è tra gli invitati
		for (int i = 0; i < people.length; i++) {
			if (name.toLowerCase().equals(people[i].toLowerCase())) {
				invited = true;
				break;
			}
		}
		
		if (!invited) {
			System.out.println("Non sei nella lista mi dispiace!");
		} else {
			System.out.println("Benvenuto/a " + name);
		}
		
		input.close();
		
	}
	
}


