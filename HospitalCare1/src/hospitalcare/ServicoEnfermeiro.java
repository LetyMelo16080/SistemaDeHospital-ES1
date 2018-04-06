package hospitalcare;

public class ServicoEnfermeiro {
	
	protected Enfermeiro _enfermeiro;
	protected Administrativo _administrativo;
	public ServicoEnfermeiro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServicoEnfermeiro(Enfermeiro _enfermeiro, Administrativo _administrativo) {
		super();
		this._enfermeiro = _enfermeiro;
		this._administrativo = _administrativo;
	}
	public Enfermeiro get_enfermeiro() {
		return _enfermeiro;
	}
	public void set_enfermeiro(Enfermeiro _enfermeiro) {
		this._enfermeiro = _enfermeiro;
	}
	public Administrativo get_administrativo() {
		return _administrativo;
	}
	public void set_administrativo(Administrativo _administrativo) {
		this._administrativo = _administrativo;
	}
	
	

}
