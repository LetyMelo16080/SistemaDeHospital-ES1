package hospitalcare;

import java.util.Date;

public class AltaDoente {

	protected Medico _medico;
	protected EntradaDoente _entrada;
	Date data;
	
	public AltaDoente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AltaDoente(Medico medico,EntradaDoente entrada,Date data)
	{
		this._medico=medico;
		this._entrada=entrada;
		this.data=data;
	}

	public Medico get_medico() {
		return _medico;
	}

	public void set_medico(Medico _medico) {
		this._medico = _medico;
	}

	public EntradaDoente get_entrada() {
		return _entrada;
	}

	public void set_entrada(EntradaDoente _entrada) {
		this._entrada = _entrada;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
}
