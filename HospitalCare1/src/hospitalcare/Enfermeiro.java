package hospitalcare;

public class Enfermeiro {

	
	protected PrescricaoVerbalUnica _verbalunica;
	protected PreparacaoMedicamentos _medicamento;
	protected EstadoDoente _estado;
	protected AdministracaoMedicamentos _administracao;
	protected ServicoEnfermeiro _servico;
	String Nome;
	
	
	
	public Enfermeiro() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Enfermeiro(PrescricaoVerbalUnica _verbalunica, PreparacaoMedicamentos _medicamento, EstadoDoente _estado,
			AdministracaoMedicamentos _administracao, ServicoEnfermeiro _servico, String nome) {
		super();
		this._verbalunica = _verbalunica;
		this._medicamento = _medicamento;
		this._estado = _estado;
		this._administracao = _administracao;
		this._servico = _servico;
		Nome = nome;
	}
	
	
	public PrescricaoVerbalUnica get_verbalunica() {
		return _verbalunica;
	}
	public void set_verbalunica(PrescricaoVerbalUnica _verbalunica) {
		this._verbalunica = _verbalunica;
	}
	public PreparacaoMedicamentos get_medicamento() {
		return _medicamento;
	}
	public void set_medicamento(PreparacaoMedicamentos _medicamento) {
		this._medicamento = _medicamento;
	}
	public EstadoDoente get_estado() {
		return _estado;
	}
	public void set_estado(EstadoDoente _estado) {
		this._estado = _estado;
	}
	public AdministracaoMedicamentos get_administracao() {
		return _administracao;
	}
	public void set_administracao(AdministracaoMedicamentos _administracao) {
		this._administracao = _administracao;
	}
	public ServicoEnfermeiro get_servico() {
		return _servico;
	}
	public void set_servico(ServicoEnfermeiro _servico) {
		this._servico = _servico;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	
	
	
}
