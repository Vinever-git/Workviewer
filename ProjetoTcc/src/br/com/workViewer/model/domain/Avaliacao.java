package br.com.workViewer.model.domain;

public class Avaliacao {
	
	private int idAvaliacao;
	private String nomeAvaliador;
	private String nomeAvaliado;
	private String setor;
	private String feedBack;
	private String pontuacao;
	
	public Avaliacao() {
		super();
	}
	
	public Avaliacao(int idAvaliacao, String nomeAvaliador, String nomeAvaliado, String setor, String feedBack,
			String pontuacao) {
		super();
		this.idAvaliacao = idAvaliacao;
		this.nomeAvaliador = nomeAvaliador;
		this.nomeAvaliado = nomeAvaliado;
		this.setor = setor;
		this.feedBack = feedBack;
		this.pontuacao = pontuacao;
	}

	public int getIdAvaliacao() {
		return idAvaliacao;
	}
	public void setIdAvaliacao(int idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}
	public String getNomeAvaliador() {
		return nomeAvaliador;
	}
	public void setNomeAvaliador(String nomeAvaliador) {
		this.nomeAvaliador = nomeAvaliador;
	}
	public String getNomeAvaliado() {
		return nomeAvaliado;
	}
	public void setNomeAvaliado(String nomeAvaliado) {
		this.nomeAvaliado = nomeAvaliado;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getFeedBack() {
		return feedBack;
	}
	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}
	public String getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(String pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	

}
