package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import persona.Persona;
import vehiculos.Coche;

public class Start {

	public static void main(String[] args) {
		
		
		HashMap <Persona,Coche> coches = new HashMap<Persona, Coche>();
		
		Coche c1 = new Coche("1111BBB", "Rojo", "Mercedes");
		Coche c2 = new Coche("1111CCC", "Verde", "Mercedes");
		Coche c3 = new Coche("1111DDD", "Amarillo", "Mercedes");
		Coche c4 = new Coche("1111EEE", "Azul", "Mercedes");
		
		Persona p1 = new Persona("71742276X", "Pablo");
		Persona p2 = new Persona("71742170Y","Pepe");
		
		
		coches.put(p1, c1);
		coches.put(p1, c2);
		coches.put(p2, c3);
		coches.put(p2, c4);
		
		System.out.println(coches);
		
		/*Set<String> keys = coches.keySet();
		for(String k:keys) {
			
			//System.out.println(k+" = "+coches.get(k));
		}
		*/
		Collection<Coche> losCoches =  coches.values();
		
		List<Coche> listado = new ArrayList<Coche>();
		listado.addAll(losCoches);
		
		System.out.println(listado);
		
	}

}
