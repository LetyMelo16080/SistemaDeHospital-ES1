package hospitalcare;

public class Administrativo {
	
	protected String Nome;
	protected ServicoEnfermeiro _servico;
	protected EntradaDoente _entrada;
	
	public Administrativo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrativo(ServicoEnfermeiro servico,EntradaDoente entrada,String nome)
	{
		this._servico=servico;
		this._entrada=entrada;
		this.Nome=nome;
	}

	public ServicoEnfermeiro get_servico() {
		return _servico;
	}

	public void set_servico(ServicoEnfermeiro _servico) {
		this._servico = _servico;
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
	
	
}
