package hospitalcare;

import java.util.Date;

public class EstadoDoente {

	protected EntradaDoente _entrada;
	protected Enfermeiro _enfermeiro;
	protected Medico _medico;
	Date data;
	
	
	public EstadoDoente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EstadoDoente(EntradaDoente _entrada, Enfermeiro _enfermeiro, Medico _medico, Date data) {
		super();
		this._entrada = _entrada;
		this._enfermeiro = _enfermeiro;
		this._medico = _medico;
		this.data = data;
	}


	public EntradaDoente get_entrada() {
		return _entrada;
	}


	public void set_entrada(EntradaDoente _entrada) {
		this._entrada = _entrada;
	}


	public Enfermeiro get_enfermeiro() {
		return _enfermeiro;
	}


	public void set_enfermeiro(Enfermeiro _enfermeiro) {
		this._enfermeiro = _enfermeiro;
	}


	public Medico get_medico() {
		return _medico;
	}


	public void set_medico(Medico _medico) {
		this._medico = _medico;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}
	
	
}
