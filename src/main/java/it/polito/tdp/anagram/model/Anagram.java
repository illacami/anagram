package it.polito.tdp.anagram.model;

import java.util.LinkedList;
import java.util.List;

public class Anagram {
	
	
	public List<String> anagrammi (String parola){
		
		List<String> risultato = new LinkedList<>();		
		permuta("", parola, 0, risultato);
		
		return risultato;
	}
	
	// livello = lunghezza della soluzione parziale
	// livello iniziale = 0
	// parziale = stringa che contiene anagramma incompleto in fase di costruzione
	// lettere = lettere della parola iniziale non ancora utilizzate
	//            (=== il sottoproblema che dobbiamo ancora risolvere)
	
	private void permuta(String parziale, String lettere, int livello, List<String> risultato) {
		
		if(lettere.isEmpty()) {   // caso terminale
			             		  // la soluzione parziale e' una soluzione completa
			//System.out.println(parziale);
			risultato.add(parziale);
		} else {
			
			// fai ricorsione
			// sottoproblema == una lettera (un singolo carattere) di 'lettere'
			
			for(int pos = 0; pos < lettere.length(); pos++) {
				
				char tentativo = lettere.charAt(pos);
				
				String nuovaParziale = parziale + tentativo;
				String nuoveLettere = lettere.substring(0, pos) + lettere.substring(pos+1);
						
				permuta(nuovaParziale, nuoveLettere, livello+1, risultato);
				
				/**
				 * 		BACKTRACKING
				 * 		qui non serve perchè ho creato nuove variabili e
				 * 		non vado a 'inquinare' quelle originali
				 */
			}
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}





