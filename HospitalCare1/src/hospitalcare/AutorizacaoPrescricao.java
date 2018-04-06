package hospitalcare;

public class AutorizacaoPrescricao {

	protected String _descricao;
	
	public AutorizacaoPrescricao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AutorizacaoPrescricao(String descricao)
	{
		this._descricao=descricao;
	}

	public String get_descricao() {
		return _descricao;
	}

	public void set_descricao(String _descricao) {
		this._descricao = _descricao;
	}
	
	
}
