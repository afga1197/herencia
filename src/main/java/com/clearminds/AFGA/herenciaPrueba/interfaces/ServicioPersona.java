package com.clearminds.AFGA.herenciaPrueba.interfaces;

import com.clearminds.AFGA.herenciaPrueba.model.Persona;

public interface ServicioPersona {
	
	public boolean insertar(Persona persona);
	public boolean actualizar(Persona persona);
	public boolean eliminar(Persona persona);
	
}
