package br.com.cleiton.jogoforca.game;

import br.com.cleiton.jogoforca.core.Word;

public class Game {
	
	public void start()
	{
		Word word = new Word("casa");
		
		word.hasChar('a');
		word.hasChar('c');
		word.hasChar('s');
		
		System.out.println(word.discovered());
		
		System.out.println(word);
		
	}

}
