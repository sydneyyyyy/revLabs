package com.revature.lambdas;

import java.util.Arrays;
import java.util.List;

public class Wizard {

	// instance Variables
	String name;
	List<Magic> proficiencies;
	
	// Constructor
	public Wizard(String name, Magic... proficiencies) { // Magic[]
		this.name = name;
		this.proficiencies = Arrays.asList(proficiencies);
	}
	
	public static void main(String[] args) {
		
		Wizard hermione = new Wizard("Hermione", Spell.alohomora, Spell.fireball);
		
		hermione.proficiencies.get(0).castSpell();
		
		
		Wizard merlin = new Wizard("Merlin", Spell.alohomora, Spell.avadaKedavra, Spell.fireball);
		merlin.proficiencies.forEach((magic) -> magic.castSpell());
	}
	
	
	
	
	
}
