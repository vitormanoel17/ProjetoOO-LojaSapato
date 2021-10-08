package teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import controller.Validador;

class testeValidador {
	Validador v = new Validador();
	@Test
	void validarCep() {
		assertTrue(v.validarCep("72880672"));
		assertFalse(v.validarCep("321"));
		assertFalse(v.validarCep("21243455654646"));
	}
	
	@Test
	void validarDdd() {
		assertTrue(v.validarDdd("11"));
		assertFalse(v.validarDdd("121"));
		assertFalse(v.validarDdd("1"));
	}
	
	@Test
	void validarTelefone() {
		assertTrue(v.validarTelefone("995818909"));
		assertFalse(v.validarTelefone("11232"));
		assertFalse(v.validarTelefone("21334565646"));
	}
	
}
