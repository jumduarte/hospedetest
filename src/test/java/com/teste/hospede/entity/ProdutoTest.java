package com.teste.hospede.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProdutoTest {

	private Produto Produto;
	
	@BeforeEach
	void setUp() {
		//Arrange
		Produto = new Produto(2L,"Garrafa",05.0);
	}
	@Test
	@DisplayName("Testando o getter and setter do Id")
	void testId() {
		//Act
		Produto.setId(2L);
		//Assert
		assertEquals(2L, Produto.getId());
	}
	@Test
	@DisplayName("Testando o getter and setter do Nome")
	void testNome() {
		//Act
		Produto.setNome("brinquedo");
		//Assert
		assertEquals("brinquedo", Produto.getNome());
	}
	
	@Test
	@DisplayName("Testando o getter and setter do Preço")
	void testPreco() {
		//Act
		Produto.setPreco(22.3);
		//Assert
		assertEquals(22.3, Produto.getPreco());
	}
	@Test
	@DisplayName("Testando o construtor")
	void testContrutorAll() {
		//Act
		Produto novoProduto = new Produto (2L,"refrigerante",05.0);
		assertAll("novoProduto",
				()-> assertEquals(2L, novoProduto.getId()),
				()-> assertEquals("refrigerante", novoProduto.getNome()),
				()-> assertEquals(5.0, novoProduto.getPreco()));
	}
	
}