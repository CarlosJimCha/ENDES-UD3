package ENDES_CJC.Ejercicio2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class SerieTest {
	
	@Test
	void testGetTitulo() {
		Serie serie = new Serie();
		serie.setTitulo("Juego de Tronos");
		assertEquals("Error en getTitulo","Juego de Tronos",serie.getTitulo());
	}

	@Test
	void testSetTitulo() {
		Serie serie = new Serie();
		serie.setTitulo("Juego de Tronos");
		assertEquals("Error en setTitulo","Juego de Tronos",serie.getTitulo());
	}

	@Test
	void testGetnumeroTemporadas() {
		Serie serie = new Serie();
		serie.setnumeroTemporadas(3);;
		assertEquals("Error en getNumeroTemporadas",3,serie.getnumeroTemporadas());
	}

	@Test
	void testSetnumeroTemporadas() {
		Serie serie = new Serie();
		serie.setnumeroTemporadas(3);
		assertEquals("Error en setNumeroTemporadas",3,serie.getnumeroTemporadas());
	}

	@Test
	void testGetGenero() {
		Serie serie = new Serie();
		serie.setGenero("Aventuras");
		assertEquals("Error en getGenero","Aventuras",serie.getGenero());
	}

	@Test
	void testSetGenero() {
		Serie serie = new Serie();
		serie.setGenero("Aventuras");
		assertEquals("Error en setGenero","Aventuras",serie.getGenero());
	}

	@Test
	void testGetcreador() {
		Serie serie = new Serie();
		serie.setcreador("Javi");
		assertEquals("Error en getcreador","Javi",serie.getcreador());
	}

	@Test
	void testSetcreador() {
		Serie serie = new Serie();
		serie.setcreador("Javi");
		assertEquals("Error en setcreador","Javi",serie.getcreador());
	}

	@Test
	void testEntregar() {
		Serie serie = new Serie();
		serie.entregar();
		assertTrue(serie.isEntregado(),"Error en entregar");
	}

	@Test
	void testDevolver() {
		Serie serie = new Serie();
		serie.devolver();
		assertFalse(serie.isEntregado(),"Error en devolver");
	}

	@Test
	void testIsEntregado() {
		Serie serie = new Serie();
		serie.entregar();
		assertTrue(serie.isEntregado(),"Error en isEntregado");
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
	void testEqualsSerie() {
		fail("Not yet implemented"); // TODO
	}

	@Disabled
	@Test
	void testSerie() {
		fail("Not yet implemented"); // TODO
	}

	@Disabled
	@Test
	void testSerieStringString() {
		fail("Not yet implemented"); // TODO
	}

	@Disabled
	@Test
	void testSerieStringIntStringString() {
		fail("Not yet implemented"); // TODO
	}

}
