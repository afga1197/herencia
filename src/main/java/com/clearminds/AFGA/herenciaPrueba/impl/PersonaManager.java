package com.clearminds.AFGA.herenciaPrueba.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.AFGA.herenciaPrueba.interfaces.ServicioPersona;
import com.clearminds.AFGA.herenciaPrueba.model.Persona;

public class PersonaManager {

	ServicioPersona serv;

	public PersonaManager() throws InstanceException {
		Class<?> clase;
		try {
			String claseArchivo = leerClase("clase1");
			clase = Class.forName(claseArchivo);
			serv = (ServicioPersona) clase.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
	}

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}

	private String leerClase(String propiedad) {
		Properties p = new Properties();
		try {
			p.load(new FileReader("C:/Users/andre/Desktop/CapacitacionCMC/proyectosGit/herencia/config.properties"));
			return p.getProperty(propiedad);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
