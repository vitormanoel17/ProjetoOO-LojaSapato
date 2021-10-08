package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import controller.*;
class TesteControleDados {
	ControleDados d = new ControleDados();

	@Test
	void testInserirEditarCliente() {
		String[] dadosCertos = new String[] {"vitor","Cidade","Go","72880672","70","centro","Sq 16","61","995818909"};
		String[] novosDados = dadosCertos;
		
		// cadastro de cliente
		assertTrue(d.inserirEditarCliente(novosDados, 0, 1));
		//Edição cliente
		assertTrue(d.inserirEditarCliente(novosDados, 3, 2));
		
		//cep inválido
		novosDados[3] = "12344";		
		assertFalse(d.inserirEditarCliente(novosDados, 0, 1));
		assertFalse(d.inserirEditarCliente(novosDados, 0, 2));
		novosDados[3] = "adsf";
		assertFalse(d.inserirEditarCliente(novosDados, 0, 1));
		assertFalse(d.inserirEditarCliente(novosDados, 0, 2));
		
		//numero invalidos
		novosDados = dadosCertos;
		novosDados[4] = "abc";
		assertFalse(d.inserirEditarCliente(novosDados, 0, 1));
		assertFalse(d.inserirEditarCliente(novosDados, 0, 2));
		
		//ddd invalido
		novosDados = dadosCertos;
		novosDados[7] = "1234";
		assertFalse(d.inserirEditarCliente(novosDados, 0, 1));
		assertFalse(d.inserirEditarCliente(novosDados, 0, 2));
		
		//numero de telefone invalido
		novosDados = dadosCertos;
		novosDados[8] = "abcdefg";
		assertFalse(d.inserirEditarCliente(novosDados, 0, 1));
		assertFalse(d.inserirEditarCliente(novosDados, 0, 2));
		novosDados[8] = "1234";
		assertFalse(d.inserirEditarCliente(novosDados, 0, 1));
		assertFalse(d.inserirEditarCliente(novosDados, 0, 2));
		
		
	}

	@Test
	void testInserirEditarFuncionario() {
		String[] dadosCertos = new String[] {"vitor","Cidade","Go","72880672","70","centro","Sq 16","61","995818909"};
		String[] novosDados = dadosCertos;
		
		// cadastro de Funcionario
		assertTrue(d.inserirEditarFuncionario(novosDados, 0, 1));
		//Edição Funcionario
		assertTrue(d.inserirEditarFuncionario(novosDados, 3, 2));
		
		//cep inválido
		novosDados[3] = "12344";		
		assertFalse(d.inserirEditarFuncionario(novosDados, 0, 1));
		assertFalse(d.inserirEditarFuncionario(novosDados, 0, 2));
		novosDados[3] = "adsf";
		assertFalse(d.inserirEditarFuncionario(novosDados, 0, 1));
		assertFalse(d.inserirEditarFuncionario(novosDados, 0, 2));
		
		//numero invalidos
		novosDados = dadosCertos;
		novosDados[4] = "abc";
		assertFalse(d.inserirEditarFuncionario(novosDados, 0, 1));
		assertFalse(d.inserirEditarFuncionario(novosDados, 0, 2));
		
		//ddd invalido
		novosDados = dadosCertos;
		novosDados[7] = "1234";
		assertFalse(d.inserirEditarFuncionario(novosDados, 0, 1));
		assertFalse(d.inserirEditarFuncionario(novosDados, 0, 2));
		
		//numero de telefone invalido
		novosDados = dadosCertos;
		novosDados[8] = "abcdefg";
		assertFalse(d.inserirEditarFuncionario(novosDados, 0, 1));
		assertFalse(d.inserirEditarFuncionario(novosDados, 0, 2));
		novosDados[8] = "1234";
		assertFalse(d.inserirEditarFuncionario(novosDados, 0, 1));
		assertFalse(d.inserirEditarFuncionario(novosDados, 0, 2));

	}

	@Test
	void testInserirEditarProduto() {
		assertEquals(1,1);
	}

	@Test
	void testInserirVenda() {
		
	}

}
