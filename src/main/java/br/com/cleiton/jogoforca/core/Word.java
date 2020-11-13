package br.com.cleiton.jogoforca.core;

import java.util.HashSet;
import java.util.Set;

public class Word {
	
	private static final char SECRET_CHAR = '_';
	
	private String originalWord;
	private Set<Character> foundChars = new HashSet<>(); //Controlar os caracteres j� encontrados
	private Set<Character> wordChars = new HashSet<>();

	public Word(String originalWord) {
		this.originalWord = originalWord.toUpperCase();
		
		char[] chars = this.originalWord.toCharArray();
		
		for (char c : chars) {
			wordChars.add(c);
		}
	}
	
	public int size() {
		return originalWord.length();
	}
	
	public boolean hasChar(char c) {
		
		c = Character.toUpperCase(c);
		
		int pos = originalWord.indexOf(c);
		
		if (pos > -1) {
			
			foundChars.add(c);
			
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder(); //Concatenar
		
		char[] charArryay = originalWord.toCharArray();
		
		for(int i = 0; i < charArryay.length; i++) {
			char c = charArryay[i];
			
			if (foundChars.contains(c)) {
				sb.append(c);
			}
			else {
				sb.append(SECRET_CHAR);
			}
			
			sb.append(" ");
			
			
		}
		
		return sb.toString();
	}
	
	public boolean discovered() {
		return foundChars.equals(wordChars);
	}

	public String getOriginalWord() {
		return originalWord;
	}
	
}
