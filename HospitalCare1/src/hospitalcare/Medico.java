package hospitalcare;

public class Medico {

	String Nome;
	protected Prescricao _prescricao;
	protected AltaDoente _alta;
	protected EstadoDoente _estado;
	
	
	public Medico() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Medico(String nome, Prescricao _prescricao, AltaDoente _alta, EstadoDoente _estado) {
		super();
		Nome = nome;
		this._prescricao = _prescricao;
		this._alta = _alta;
		this._estado = _estado;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public Prescricao get_prescricao() {
		return _prescricao;
	}


	public void set_prescricao(Prescricao _prescricao) {
		this._prescricao = _prescricao;
	}


	public AltaDoente get_alta() {
		return _alta;
	}


	public void set_alta(AltaDoente _alta) {
		this._alta = _alta;
	}


	public EstadoDoente get_estado() {
		return _estado;
	}


	public void set_estado(EstadoDoente _estado) {
		this._estado = _estado;
	}
	
	
	
}
