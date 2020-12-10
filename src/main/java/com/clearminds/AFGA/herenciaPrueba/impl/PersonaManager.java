package com.clearminds.AFGA.herenciaPrueba.impl;

import com.clearminds.AFGA.herenciaPrueba.interfaces.ServicioPersona;
import com.clearminds.AFGA.herenciaPrueba.model.Persona;

public class PersonaManager {
	
	ServicioPersona serv;

	public PersonaManager() {
		serv = new ServicioPersonaBDD();
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
	
	

}
