package hospitalcare;

import java.util.Date;

public class HorarioToma {

	Date data_hora_toma;
	protected PreparacaoMedicamentos _preparacao;
	protected Prescricao _prescricao;
	
	public HorarioToma() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HorarioToma(Date data_hora_toma, PreparacaoMedicamentos _preparacao, Prescricao _prescricao) {
		super();
		this.data_hora_toma = data_hora_toma;
		this._preparacao = _preparacao;
		this._prescricao = _prescricao;
	}

	public Date getData_hora_toma() {
		return data_hora_toma;
	}

	public void setData_hora_toma(Date data_hora_toma) {
		this.data_hora_toma = data_hora_toma;
	}

	public PreparacaoMedicamentos get_preparacao() {
		return _preparacao;
	}

	public void set_preparacao(PreparacaoMedicamentos _preparacao) {
		this._preparacao = _preparacao;
	}

	public Prescricao get_prescricao() {
		return _prescricao;
	}

	public void set_prescricao(Prescricao _prescricao) {
		this._prescricao = _prescricao;
	}
	
	
}
