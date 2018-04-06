package hospitalcare;

import java.util.Date;

public class AdministracaoMedicamentos {

	Date data;
	private PreparacaoMedicamentos _preparacao;
	private Enfermeiro _enfermeiro;
	
	public AdministracaoMedicamentos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdministracaoMedicamentos(PreparacaoMedicamentos preparacao,Enfermeiro enfermeiro, Date data)
	{
		this._preparacao=preparacao;
		this._enfermeiro=enfermeiro;
		this.data=data;
	}

	public PreparacaoMedicamentos get_preparacao() {
		return _preparacao;
	}

	public void set_preparacao(PreparacaoMedicamentos _preparacao) {
		this._preparacao = _preparacao;
	}

	public Enfermeiro get_enfermeiro() {
		return _enfermeiro;
	}

	public void set_enfermeiro(Enfermeiro _enfermeiro) {
		this._enfermeiro = _enfermeiro;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}
