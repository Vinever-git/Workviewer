package br.com.workViewer.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.workViewer.model.domain.Avaliacao;

public class AvaliacaoDao {
	
	public  List<Avaliacao> getAvaliacao() throws SQLException,ClassNotFoundException{
		Connection conexao = conexaoJDBCFactory.getConexao();
		PreparedStatement ps = conexao.prepareStatement("SELECT idAvaliacao, nomeAvaliador, nomeAvaliado, setor, feedBack, pontuacao from tb_avaliacao");
		ResultSet rs = ps.executeQuery();
		List<Avaliacao> avaliacao = new ArrayList<>();
		while(rs.next()) {
			avaliacao.add(new Avaliacao(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
		}
		return avaliacao;
		
	}
	
	

	public void salvar(Avaliacao avaliacao) throws SQLException, ClassNotFoundException {
		Connection conexao = conexaoJDBCFactory.getConexao();
		PreparedStatement statement = conexao.prepareStatement(
				"INSERT INTO TB_AVALIACAO(nomeAvaliador, nomeAvaliado, setor, feedBack, pontuacao) values (?,?,?,?,?)");
		statement.setString(1,avaliacao.getNomeAvaliador());
		statement.setString(2,avaliacao.getNomeAvaliado());
		statement.setString(3,avaliacao.getSetor());
		statement.setString(4,avaliacao.getFeedBack());
		statement.setString(5,avaliacao.getPontuacao());
		statement.execute();
		
		
	}

	
	
	

}
