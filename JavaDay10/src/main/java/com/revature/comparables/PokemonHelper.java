package com.revature.comparables;

import java.util.Comparator;

public class PokemonHelper implements Comparator<Pokemon> {

	// uses compare() rather than compareTo()
	
	@Override
	public int compare(Pokemon p1, Pokemon p2) {
		return p1.getId() - p2.getId();
	}

}
