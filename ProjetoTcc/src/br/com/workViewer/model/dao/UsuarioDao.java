package br.com.workViewer.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.workViewer.model.domain.Usuario;

public class UsuarioDao  {
	
	public List<Usuario> getUsuario() throws SQLException,ClassNotFoundException{
		Connection conexao = conexaoJDBCFactory.getConexao();
		PreparedStatement ps = conexao.prepareStatement("SELECT idUsuario, nome, cpf, telefone, dataNascimento, email, senha from tb_usuario");
		ResultSet rs = ps.executeQuery();
		List<Usuario> usuario = new ArrayList<>();
		while(rs.next()) {
			usuario.add(new Usuario(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
		}
		return usuario;
		
	}

	public void salvar(Usuario usuario) throws SQLException, ClassNotFoundException {
		Connection conexao = conexaoJDBCFactory.getConexao();
		PreparedStatement statement = conexao.prepareStatement(
				"INSERT INTO TB_USUARIO(nome,cpf,telefone,dataNascimento,email,senha) values (?,?,?,?,?,?)");
		statement.setString(1,usuario.getNome());
		statement.setString(2,usuario.getCpf());
		statement.setString(3,usuario.getTelefone());
		statement.setString(4,usuario.getDataNascimento());
		statement.setString(5,usuario.getEmail());
		statement.setString(6,usuario.getSenha());
		statement.execute();
		
		
	}

	
		
	}

