package com.clearminds.AFGA.herenciaPrueba.impl;

import com.clearminds.AFGA.herenciaPrueba.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		PersonaManager personaManager = new PersonaManager();
		Persona persona = new Persona();
		persona.setNombre("Andres");
		persona.setApellido("Gomez");
		persona.setEdad(20);
		personaManager.insertarPersona(persona);;

	}

}
