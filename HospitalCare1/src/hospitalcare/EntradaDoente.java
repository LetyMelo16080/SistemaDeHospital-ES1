package hospitalcare;

import java.util.Date;

public class EntradaDoente {
	
	protected EstadoDoente _estado;
	protected AltaDoente _alta;
	protected Administrativo _administrador;
	protected Doente _doente;
	Date data;
	
	public EntradaDoente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EntradaDoente(EstadoDoente _estado, AltaDoente _alta, Administrativo _administrador, Doente _doente,
			Date data) {
		super();
		this._estado = _estado;
		this._alta = _alta;
		this._administrador = _administrador;
		this._doente = _doente;
		this.data = data;
	}

	public EstadoDoente get_estado() {
		return _estado;
	}

	public void set_estado(EstadoDoente _estado) {
		this._estado = _estado;
	}

	public AltaDoente get_alta() {
		return _alta;
	}

	public void set_alta(AltaDoente _alta) {
		this._alta = _alta;
	}

	public Administrativo get_administrador() {
		return _administrador;
	}

	public void set_administrador(Administrativo _administrador) {
		this._administrador = _administrador;
	}

	public Doente get_doente() {
		return _doente;
	}

	public void set_doente(Doente _doente) {
		this._doente = _doente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	
	
}
