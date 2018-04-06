package hospitalcare;

public class Doente {
	
	protected Prescricao _prescricao;
	protected EntradaDoente _entrada;
	String Nome;
	String Descricao;
	
	public Doente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doente(Prescricao prescricao,EntradaDoente entrada,String nome,String descricao)
	{
		this._prescricao=prescricao;
		this._entrada=entrada;
		this.Nome=nome;
		this.Descricao=descricao;
	}

	public Prescricao get_prescricao() {
		return _prescricao;
	}

	public void set_prescricao(Prescricao _prescricao) {
		this._prescricao = _prescricao;
	}

	public EntradaDoente get_entrada() {
		return _entrada;
	}

	public void set_entrada(EntradaDoente _entrada) {
		this._entrada = _entrada;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	
	
}
