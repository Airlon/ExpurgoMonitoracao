package com.boavista.expurgoBilling.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.boavista.expurgoBilling.dominio.Produto;

public class ProdutoDao {
	
	private static final Logger logger = LoggerFactory.getLogger(ProdutoDao.class);

	   // a conexão com o banco de dados
    private Connection connection;

    public ProdutoDao() {
      this.connection = new ConnectionFactory().getConnection();
      
    }
            
        public void remove(Produto produto) {
            try {
                PreparedStatement stmt = connection.prepareStatement("delete " +
                        "from fatlog_produto");
                stmt.execute();
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        
    }
    
    
 