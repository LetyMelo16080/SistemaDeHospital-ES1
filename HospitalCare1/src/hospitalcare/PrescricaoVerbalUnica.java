package hospitalcare;



public class PrescricaoVerbalUnica {

	protected Enfermeiro _enfermeiro;
	protected AutorizacaoPrescricao autorizacao;
	
	
	public PrescricaoVerbalUnica() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PrescricaoVerbalUnica(Enfermeiro _enfermeiro, AutorizacaoPrescricao autorizacao) {
		super();
		this._enfermeiro = _enfermeiro;
		this.autorizacao = autorizacao;
	}


	public Enfermeiro get_enfermeiro() {
		return _enfermeiro;
	}


	public void set_enfermeiro(Enfermeiro _enfermeiro) {
		this._enfermeiro = _enfermeiro;
	}


	public AutorizacaoPrescricao getAutorizacao() {
		return autorizacao;
	}


	public void setAutorizacao(AutorizacaoPrescricao autorizacao) {
		this.autorizacao = autorizacao;
	}
	
	
}
