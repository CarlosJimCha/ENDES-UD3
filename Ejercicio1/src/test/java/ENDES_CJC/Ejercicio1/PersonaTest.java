package ENDES_CJC.Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PersonaTest {
	
	@Disabled
	@Test
	void testPersona() {
		fail("Not yet implemented");
	}
	
	@Disabled
	@Test
	void testPersonaStringIntChar() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testPersonaStringIntCharDoubleDouble() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}
	
	@Disabled
	@Test
	void testSetEdad() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testSetSexo() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testSetPeso() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testSetAltura() {
		fail("Not yet implemented");
	}

	@Test
	void testCalcularIMC() {

		Persona p = new Persona();
		boolean porDefecto = false;
		p.setAltura(2);
		p.setPeso(120);

		if (p.calcularIMC()<=100 && p.calcularIMC()>=0)
			porDefecto = true;
		
		assertTrue(porDefecto, "Error, cálculo del IMC incorrecto");
	}

	
	@Test
	void testEsMayorDeEdad() {
	
		Persona p = new Persona();
		boolean porDefecto = false;
		p.setEdad(16);
		
		if(p.esMayorDeEdad() == false)
			porDefecto = true;
		
		assertTrue(porDefecto, "Error, cálculo erróneo de la mayoría de edad");
		
	}

	@Disabled
	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
