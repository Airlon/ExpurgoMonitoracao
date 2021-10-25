package com.boavista.expurgoBilling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.boavista.expurgoBilling.connection.ProdutoClienteDao;
import com.boavista.expurgoBilling.connection.ProdutoDao;
import com.boavista.expurgoBilling.dominio.Produto;
import com.boavista.expurgoBilling.dominio.ProdutoCliente;

@SpringBootApplication
public class Executar {
	
	private static final Logger logger = LoggerFactory.getLogger(Executar.class);

	public static void main(String[] args) {
		SpringApplication.run(Executar.class, args);
		
		
			  Produto produto = new Produto();

			  ProdutoDao daoProduto = new ProdutoDao();

			  daoProduto.remove(produto);
			  
			  
			  
			  ProdutoCliente produtoCliente = new ProdutoCliente();
			  
			  ProdutoClienteDao daoProdutoC = new ProdutoClienteDao();
			  
			  daoProdutoC.remove(produtoCliente);

		}


	}


