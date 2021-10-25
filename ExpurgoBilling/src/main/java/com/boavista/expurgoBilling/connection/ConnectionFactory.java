package com.boavista.expurgoBilling.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectionFactory {
	
	private static final Logger logger = LoggerFactory.getLogger(ConnectionFactory.class);
	
	  public Connection getConnection() {
	      try {
	          return DriverManager.getConnection(
	  "jdbc:mysql://localhost:3306/migracao_dados", "user", "123456");
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }

}
