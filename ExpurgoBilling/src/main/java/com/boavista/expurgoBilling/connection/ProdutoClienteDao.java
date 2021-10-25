package com.boavista.expurgoBilling.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.boavista.expurgoBilling.dominio.ProdutoCliente;

public class ProdutoClienteDao {
	
	private static final Logger logger = LoggerFactory.getLogger(ProdutoClienteDao.class);

	   // a conexão com o banco de dados
	   private Connection connection;

 	public ProdutoClienteDao() {
 		this.connection = new ConnectionFactory().getConnection();
   
 	}
         
     public void remove(ProdutoCliente produtoCliente) {
         try {
             PreparedStatement stmt = connection.prepareStatement("delete " +
                     "from fatlog_produto_cliente");
             stmt.execute();
             stmt.close();
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     }
     
 }


