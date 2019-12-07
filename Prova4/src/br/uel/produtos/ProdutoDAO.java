package br.uel.produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.uel.contatos.ConnectionFactory;
import br.uel.contatos.Contato;
import br.uel.contatos.RuntimeException;
import br.uel.contatos.String;
import br.uel.contatos.java;


public class ProdutoDAO {

	
	private Connection connection;
	
	public ProdutoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void cadastrar(Produto contato){
		
		String sql = 
				"INSERT INTO contato (NOME, EMAIL, ENDERECO, DATA_NASCIMENTO) VALUES (?,?,?,?)";
		
		//utilize sempre prepared statement pois ele � mais r�pido que statement -> consulta parametrizada
		try {
			PreparedStatement prstate = connection.prepareStatement(sql);
			
			prstate.setString(1, contato.getNome());
			prstate.setString(2, contato.getEmail());
			prstate.setString(3, contato.getEndereco());
			prstate.setDate(4, new java.sql.Date(contato.getDataNascimento().getTimeInMillis()));
			
			prstate.execute();
			
			prstate.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}
		}
				
		
	}
}
