package it.polito.tdp.anagram.model;

import java.util.LinkedList;
import java.util.List;

public class TestAnagramma {

	public static void main(String[] args) {
		

		Anagram a = new Anagram();
		
		List<String> anagrammi = new LinkedList<>();
		
		anagrammi = a.anagrammi("ricarica");
		System.out.println(anagrammi);

	}

}
