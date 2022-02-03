package ENDES_CJC.Ejercicio2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class VideojuegoTest {

	@Test
	void testGetTitulo() {
		Videojuego v = new Videojuego();
		v.setTitulo("Juego de Tronos el Videojuego");
		assertEquals("Error en getTitulo","Juego de Tronos el Videojuego",v.getTitulo());
	}

	@Test
	void testSetTitulo() {
		Videojuego v = new Videojuego();
		v.setTitulo("Juego de Tronos el Videojuego");
		assertEquals("Error en setTitulo","Juego de Tronos el Videojuego",v.getTitulo());
	}

	@Test
	void testGetHorasEstimadas() {
		Videojuego v = new Videojuego();
		v.setHorasEstimadas(100);
		assertEquals(100,v.getHorasEstimadas(),"Error en getHorasEstimadas");
	}

	@Test
	void testSetHorasEstimadas() {
		Videojuego v = new Videojuego();
		v.setHorasEstimadas(100);
		assertEquals(100,v.getHorasEstimadas(),"Error en setHorasEstimadas");
	}

	@Test
	void testGetGenero() {
		Videojuego v = new Videojuego();
		v.setGenero("Aventuras");
		assertEquals("Error en getGenero","Aventuras",v.getGenero());
	}

	@Test
	void testSetGenero() {
		Videojuego v = new Videojuego();
		v.setGenero("Aventuras");
		assertEquals("Error en setGenero","Aventuras",v.getGenero());
	}
	
	@Test
	void testGetcompañia() {
		Videojuego v = new Videojuego();
		v.setcompañia("Aventures");
		assertEquals("Error en getcompañia","Aventures",v.getcompañia());
	}

	@Test
	void testSetcompañia() {
		Videojuego v = new Videojuego();
		v.setcompañia("Aventures");
		assertEquals("Error en setcompañia","Aventures",v.getcompañia());
	}

	//Se repiten los mismos test que en SerieTest, solo habría que cambiar las variables
	@Disabled
	@Test
	void testEntregar() {
		fail("Not yet implemented"); // TODO
	}

	@Disabled
	@Test
	void testDevolver() {
		fail("Not yet implemented"); // TODO
	}

	@Disabled
	@Test
	void testIsEntregado() {
		fail("Not yet implemented"); // TODO
	}

	@Disabled
	@Test
	void testCompareTo() {
		fail("Not yet implemented"); // TODO
	}

	@Disabled
	@Test
	void testToString() {
		fail("Not yet implemented"); // TODO
	}

	@Disabled
	@Test
	void testEqualsVideojuego() {
		fail("Not yet implemented"); // TODO
	}

	@Disabled
	@Test
	void testVideojuego() {
		fail("Not yet implemented"); // TODO
	}

	@Disabled
	@Test
	void testVideojuegoStringString() {
		fail("Not yet implemented"); // TODO
	}

	@Disabled
	@Test
	void testVideojuegoStringIntStringString() {
		fail("Not yet implemented"); // TODO
	}

}
