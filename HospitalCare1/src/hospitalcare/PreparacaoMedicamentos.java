package hospitalcare;

public class PreparacaoMedicamentos {

	protected Enfermeiro _enfermeiro;
	protected AdministracaoMedicamentos _medicamentos;
	protected HorarioToma _horario;
	
	
	public PreparacaoMedicamentos() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PreparacaoMedicamentos(Enfermeiro _enfermeiro, AdministracaoMedicamentos _medicamentos,
			HorarioToma _horario) {
		super();
		this._enfermeiro = _enfermeiro;
		this._medicamentos = _medicamentos;
		this._horario = _horario;
	}


	public Enfermeiro get_enfermeiro() {
		return _enfermeiro;
	}


	public void set_enfermeiro(Enfermeiro _enfermeiro) {
		this._enfermeiro = _enfermeiro;
	}


	public AdministracaoMedicamentos get_medicamentos() {
		return _medicamentos;
	}


	public void set_medicamentos(AdministracaoMedicamentos _medicamentos) {
		this._medicamentos = _medicamentos;
	}


	public HorarioToma get_horario() {
		return _horario;
	}


	public void set_horario(HorarioToma _horario) {
		this._horario = _horario;
	}
	
	
}
