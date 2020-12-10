package com.clearminds.AFGA.herenciaPrueba.impl;

import com.clearminds.AFGA.herenciaPrueba.interfaces.ServicioPersona;
import com.clearminds.AFGA.herenciaPrueba.model.Persona;

public class PersonaManager {
	
	ServicioPersona serv;

	public PersonaManager() throws InstanceException {
		Class<?> clase;
		try {
			clase = Class.forName("com.clearminds.AFGA.herenciaPrueba.impl.ServicioPersonaBDD");
			serv= (ServicioPersona) clase.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
	
	

}
